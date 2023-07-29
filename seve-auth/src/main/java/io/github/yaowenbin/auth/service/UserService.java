package io.github.yaowenbin.auth.service;

import io.github.yaowenbin.auth.api.LoginReq;
import io.github.yaowenbin.auth.persistent.UserMapper;
import io.github.yaowenbin.auth.model.User;
import lombok.RequiredArgsConstructor;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author yaowenbin
 * @Date 2023/7/20
 */
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public User login(LoginReq req) {
        userMapper.selectOneByUsername(req.username());
        return null;
    }
}
