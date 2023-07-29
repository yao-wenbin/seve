package io.github.yaowenbin.auth.model;

import com.mybatisflex.annotation.Table;
import io.github.yaowenbin.common.model.Entity;
import lombok.Data;

/**
 * @Author yaowenbin
 * @Date 2023/7/20
 */
@Data
@Table("user")
public class User extends Entity {

    private String username;

    private String password;

    // private String token;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public static User register(RegisterRequest registerRequest) {
        return new User(registerRequest.username(), registerRequest.password());
    }

}
