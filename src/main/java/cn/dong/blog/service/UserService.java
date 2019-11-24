package cn.dong.blog.service;

import cn.dong.blog.po.User;

/**
 * 用户的service
 * @author : Dong
 * @date : 2019/11/22 9:41
 */
public interface UserService {

    /**
     * 根据用户名密码验证用户
     * @param username
     * @param password
     * @return User/null
     */
    User checkUser(String username,String password);
}
