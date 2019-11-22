package cn.dong.blog.service.impl;

import cn.dong.blog.dao.UserRepository;
import cn.dong.blog.po.User;
import cn.dong.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Dong
 * @date : 2019/11/22 9:42
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {

        User user = userRepository.findByUsernameAndPassword(username, password);
        return user;
    }
}
