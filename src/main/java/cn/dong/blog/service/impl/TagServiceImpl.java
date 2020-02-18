package cn.dong.blog.service.impl;

import cn.dong.blog.dao.TagRepository;
import cn.dong.blog.po.Tag;
import cn.dong.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Dong
 * @date : 2019/11/24 18:31
 */
@Service
@Transactional
public class TagServiceImpl implements TagService {

    @Autowired
    private TagRepository tagRepository;

    @Override
    public Tag saveTag(Tag type) {
        return tagRepository.save(type);
    }

    @Override
    public Tag getTag(Long id) {
        return tagRepository.getOne(id);
    }

    @Override
    public Tag getTagByName(String name) {
        return tagRepository.findByName(name);
    }

    @Override
    public Page<Tag> listTag(Pageable pageable) {
        return tagRepository.findAll(pageable);
    }

    @Override
    public List<Tag> listTag() {
        return tagRepository.findAll();
    }


    @Override
    public List<Tag> listTagTop(Integer size) {

        Sort sort = Sort.by(Sort.Direction.DESC, "blogs.size");
        Pageable pageable = PageRequest.of(0, size, sort);
        return tagRepository.findTop(pageable);
    }

    @Override
    public List<Tag> listTags(String ids) {

        return tagRepository.findAllById(covertToList(ids));
    }

    /**
     * 将一组id组成的字符串 eg: 1,2,3 转化为id组成的集合
     *
     * @param ids
     * @return
     */
    private List<Long> covertToList(String ids) {
        List<Long> list = new ArrayList<>();
        if (ids != null && !"".equals(ids)) {
            String[] idarray = ids.split(",");
            for (int i = 0; i < idarray.length; i++) {
                list.add(new Long(idarray[i]));
            }
        }
        return list;
    }


    @Override
    public void deleteTag(Long id) {
        tagRepository.deleteById(id);
    }
}
