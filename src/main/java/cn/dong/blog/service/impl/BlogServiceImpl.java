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
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    public List<Blog> listRecommendBlogTop(Integer size) {
        Pageable pageable = PageRequest.of(0,size, Sort.Direction.DESC,"updateTime");
        return blogRepository.findTop(pageable);
    }

    @Override
    public Page<Blog> listBlog(String search,Pageable pageable) {
        return blogRepository.findBlogsBySearch(search,pageable);
    }

    @Override
    public Page<Blog> listBlog(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Blog saveBlog(Blog blog) {
        if (blog.getId() == null) {
            blog.setCreateTime(new Date());
            blog.setViews(0);
        }
        blog.setUpdateTime(new Date());

        return blogRepository.save(blog);
    }


    @Override
    public void deleteBlog(Long id) {
        blogRepository.deleteById(id);
    }
}
