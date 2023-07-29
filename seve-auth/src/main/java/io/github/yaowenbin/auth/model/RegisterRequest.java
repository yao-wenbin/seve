package io.github.yaowenbin.auth.model;

/**
 * @Author yaowenbin
 * @Date 2023/7/20
 */

public record RegisterRequest (
        String username,
        String password
) {}
