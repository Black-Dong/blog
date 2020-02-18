package cn.dong.blog.dao;

import cn.dong.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Dong
 * @date : 2019/11/22 9:44
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * 通过用户名密码找个人
     *
     * @param username
     * @param password
     * @return
     */
    User findByUsernameAndPassword(String username, String password);
}
