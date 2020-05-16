package com.offcn.springbootdemo002.dao;

import com.offcn.springbootdemo002.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yutao
 * @email 291217997@qq.com
 * @data 2020/5/15
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByName(String name);

    User findByNameAndAge(String name,Integer age);
}
