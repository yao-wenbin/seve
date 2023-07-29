package io.github.yaowenbin.auth.api;

/**
 * @Author yaowenbin
 * @Date 2023/7/28
 */
public record LoginReq(
        String username,
        String password
) {
}
