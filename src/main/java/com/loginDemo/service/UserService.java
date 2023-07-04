package com.loginDemo.service;

import com.loginDemo.domain.User;
import org.springframework.stereotype.Service;

@Service//添加第1处
public interface UserService {
    /**
     * 登录业务逻辑
     * @param username 账户名
     * @param password 密码
     * @return
     */
    //以下的方法在UserServiceImpl中实现
    User loginService(int username, String password);

    /**
     * 注册业务逻辑
     * @param user 要注册的User对象，属性中主键uid要为空，若uid不为空可能会覆盖已存在的user
     * @return
     */
    User registService(User user);
}
