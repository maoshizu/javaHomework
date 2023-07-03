package com.loginDemo.repository;

import com.loginDemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service//添加第2处
public interface UserDao extends JpaRepository<User, String> {
    User findByUsername(String username); //通过用户名uname查找用户，注意要按照JPA的格式使用驼峰命名法
    User findByUsernameAndPassword(String username, int password);//通过用户名uname和密码查找用户

}
