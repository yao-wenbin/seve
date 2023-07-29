package io.github.yaowenbin.auth.api;

import io.github.yaowenbin.auth.model.User;
import io.github.yaowenbin.auth.service.UserService;
import io.github.yaowenbin.common.api.BaseController;
import io.github.yaowenbin.common.api.R;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yaowenbin
 * @Date 2023/7/20
 */
@RequestMapping("/auths")
@RestController
@RequiredArgsConstructor
public class AuthController extends BaseController {

    private final UserService userService;

    @PostMapping("/login")
    public R<User> login(LoginReq req) {
        return success(userService.login(req));
    }

}
