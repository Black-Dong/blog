package cn.dong.blog.service;

import cn.dong.blog.po.User;

/**
 * @author : Dong
 * @date : 2019/11/22 9:41
 */
public interface UserService {

    User checkUser(String username,String password);
}
