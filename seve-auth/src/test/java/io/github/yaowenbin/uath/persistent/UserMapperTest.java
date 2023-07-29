package io.github.yaowenbin.uath.persistent;

import io.github.yaowenbin.auth.AuthApplication;
import io.github.yaowenbin.auth.model.User;
import io.github.yaowenbin.auth.persistent.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

/**
 * @Author yaowenbin
 * @Date 2023/7/28
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = AuthApplication.class)
public class UserMapperTest {

    @Resource
    UserMapper userMapper;

    @Test
    void selectByUsername() {
        User yaowenbin = userMapper.selectOneByUsername("yaowenbin");
        System.out.println(yaowenbin);
    }

    @Test
    void insert() {

    }

}
