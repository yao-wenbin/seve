package io.github.yaowenbin.common.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class R<T> implements Serializable {

    private static final long serialVersionUID = 3452913614867544640L;

    private T data;

    private int code;

    private String msg = "";

    public R() {
    }

    private R(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    private R(int code, String msg) {
        this(code, msg, null);
    }

    public static <T> R<T> success(Runnable run) {
        run.run();
        return new R<>(ExceptionEnum.SUCCESS.getCode(), ExceptionEnum.SUCCESS.getMessage());
    }

    public static <T> R<T> success(T data) {
        return new R<>(ExceptionEnum.SUCCESS.getCode(), ExceptionEnum.SUCCESS.getMessage(), data);
    }

    public static <T> R<T> success() {
        return new R<>(ExceptionEnum.SUCCESS.getCode(), ExceptionEnum.SUCCESS.getMessage());
    }


    public static <T> R<T> failed() {
        return new R<>(ExceptionEnum.ERROR.getCode(), ExceptionEnum.ERROR.getMessage());
    }

    public static <T> R<T> failed(String message) {
        return new R<>(ExceptionEnum.ERROR.getCode(), message);
    }

    public static <T> R<T> unauthorized() {
        return new R<>(ExceptionEnum.UNAUTHORIZED.getCode(), ExceptionEnum.UNAUTHORIZED.getMessage());
    }
}
