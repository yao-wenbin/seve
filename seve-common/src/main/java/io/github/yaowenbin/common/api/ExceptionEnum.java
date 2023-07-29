package io.github.yaowenbin.common.api;

/**
 * @Author yaowb
 * @Date 2022/11/11
 */
/* Code约定:
 * 百分位为一个独立模块
 * 十分位为一个独立功能
 * 个位为一个具体错误
 * x00表示一个模块的通用异常
 * xx0表示一个功能的通用异常
 * xxx表示一个独立模块中一个功能的具体异常
 */

public enum ExceptionEnum {
    // 数据操作错误定义
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    DUPLICATE_KEY_EXCEPTION(405, "数据重复啦，请重选数据或刷新页面"),
    PRAM_NOT_MATCH(400, "参数不正确"),
    VALIDATE_FAILED(400, "参数检验失败"),
    UNAUTHORIZED(401, "未登录或token过期，请登录！"),
    FORBIDDEN(403, "没有相关权限"),
    NOT_FOUND(404, "没有找到相关数据"),
    NOT_REPEAT_SUBMIT(405, "请勿重复提交数据"),
    ERROR(500, "系统异常, 请联系管理员"),
    NPE(501, "系统异常出现了空指针异常, 请联系管理员"),

    ;
    private final int code;
    private final String message;

    ExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
