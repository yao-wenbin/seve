package io.github.yaowenbin.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author yaowenbin
 * @Date 2023/7/20
 */
@SpringBootApplication
@MapperScan("io.github.yaowenbin.auth.persistent")
public class AuthApplication {
    public static void main(String... args) {
        SpringApplication.run(AuthApplication.class, args);
    }
}
