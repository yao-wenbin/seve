package io.github.yaowenbin.common.api;


/**
 * @Author yaowenbin
 * @Date 2023/7/20
 */
public abstract class BaseController {

    protected <T> R<T> success() {
        return R.success();
    }

    protected <T> R<T> success(T t) {
        return R.success(t);
    }

}
