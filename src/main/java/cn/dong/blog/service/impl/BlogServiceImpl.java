package cn.dong.blog.service.impl;

import cn.dong.blog.dao.BlogRepository;
import cn.dong.blog.exception.NotFoundException;
import cn.dong.blog.po.Blog;
import cn.dong.blog.po.Type;
import cn.dong.blog.service.BlogService;
import cn.dong.blog.vo.BlogSearch;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author : Dong
 * @date : 2019/11/25 9:25
 */
@Service
@Transactional
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Blog getBlog(Long id) {
        return blogRepository.getOne(id);
    }

    @Override
    public Page<Blog> listBlog(Pageable pageable, BlogSearch blogSearch) {

        final Page<Blog> page = blogRepository.findAll(new Specification<Blog>() {
            @Override
            public Predicate toPredicate(Root<Blog> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                if (blogSearch.getTitle() != null && !"".equals(blogSearch.getTitle())) {
                    predicates.add(criteriaBuilder.like(root.<String>get("title"), "%" + blogSearch.getTitle() + "%"));
                }
                if (blogSearch.getTypeId() != null) {
                    predicates.add(criteriaBuilder.equal(root.<Type>get("type").<Long>get("id"), blogSearch.getTypeId()));
                }
                if (blogSearch.isRecommendStatus()) {
                    predicates.add(criteriaBuilder.equal(root.<Boolean>get("recommendStatus"), blogSearch.isRecommendStatus()));
                }
                criteriaQuery.where(predicates.toArray(new Predicate[predicates.size()]));
                return null;
            }
        }, pageable);

        return page;
    }

    @Override
    public Blog saveBlog(Blog blog) {
        blog.setCreateTime(new Date());
        blog.setUpdateTime(new Date());
        blog.setViews(0);
        return blogRepository.save(blog);
    }

    @Override
    public Blog updateBlog(Long id, Blog blog) {
        Blog b = blogRepository.getOne(id);
        if (b == null) {
            throw new NotFoundException("您要修改的博客不存在");
        }
        BeanUtils.copyProperties(b, blog);
        return blogRepository.save(b);
    }

    @Override
    public void deleteBlog(Long id) {
        blogRepository.deleteById(id);
    }
}
