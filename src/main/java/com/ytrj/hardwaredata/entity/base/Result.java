package com.ytrj.hardwaredata.entity.base;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ytrj.hardwaredata.entity.result.CommonResultMsg;
import com.ytrj.hardwaredata.utils.StringUtils;
import java.io.Serializable;

/**
* @description : 返回对象封装
* @author : 董野
* @date : 2019/9/23
*/

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Result  implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 成功消息
     */
    public static final String SUCCESS_MSG = "操作成功！";
    /**
     * 成功消息
     */
    public static final String FAIL_MSG = "操作失败！";

    /**
     * 成功码
     */
    public static final int SUCCESS_CODE = 0;
    /**
     * 失败码
     */
    public static final int FAIL_CODE = -1;
    /**
     * 访问失败，token过期
     */
    public static final int TOKEN_ERROR_CODE = -2;
    /**
     * 客户端需要强制更新返回码
     */
    public static final int FORCE_UPGRADE_CODE = -3;
    /**
     * 访问成功，无数据
     */
    public static final int SUCCESS_WITHNODATA_CODE = 1;

    /**
     * 结果状态码(可自定义结果状态码) 1:操作成功 0:操作失败
     */
    private int code;
    /**
     * 响应结果描述
     */
    private String message;

    /**
     * 详细信息，用于开发人员进行错误定位
     */
    private String detail;

    /**
     * 返回数据
     */
    private Object data;

    public Result() {
        super();
    }
    /**
     * @param code    结果状态码(可自定义结果状态码或者使用内部静态变量 1:操作成功 0:操作失败 2:警告)
     * @param message 响应结果描述
     */
    public Result(int code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    /**
     * @param code    结果状态码(可自定义结果状态码或者使用内部静态变量 1:操作成功 0:操作失败 2:警告)
     * @param message 响应结果描述
     */
    public Result(int code, String message, String detail) {
        super();
        this.code = code;
        this.message = message;
        this.detail = detail;
    }

    /**
     * @param code    结果状态码(可自定义结果状态码或者使用内部静态变量 1:操作成功 0:操作失败 2:警告)
     * @param message 响应结果描述
     * @param data    数据
     */
    public Result(int code, String message, Object data) {
        super();
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 结果状态码
     */
    public int getCode() {
        return code;
    }

    /**
     * 结果状态码
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * 响应结果描述
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置响应结果描述
     *
     * @param message 响应结果描述
     */
    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }

    @SuppressWarnings("static-access")
    @Override
    public String toString() {
        return JsonMapper.nonDefaultMapper().toJson(this);
    }

    public static Result success(String msg, Object data) {
        return new Result(SUCCESS_CODE, StringUtils.isBlank(msg) ? SUCCESS_MSG : msg, data);
    }

    public static Result success(Object data) {
        return new Result(SUCCESS_CODE, SUCCESS_MSG, data);
    }
    public static Result success(String msg){
        return new Result(SUCCESS_CODE, msg);
    }
    public static Result success() {
        return new Result(SUCCESS_CODE, SUCCESS_MSG);
    }

    public static Result fail(String msg) {
        return StringUtils.isBlank(msg) ? Result.fail() : new Result(FAIL_CODE, msg);
    }

    public static Result fail(String msg, String detail) {
        return new Result(FAIL_CODE, msg, detail);
    }

    public static Result fail(Object data) {
        return new Result(FAIL_CODE, FAIL_MSG, data);
    }
    public static Result fail(){
        return new Result(FAIL_CODE, FAIL_MSG);
    }
    public static Result tokenFail() {
        return new Result(Result.TOKEN_ERROR_CODE, CommonResultMsg.TOKEN_EMPTY);
    }
    public static Result emptyData(String msg) {
        return new Result(Result.SUCCESS_WITHNODATA_CODE, msg);
    }
    public static Result emptyData() {
        return new Result(Result.SUCCESS_WITHNODATA_CODE, CommonResultMsg.SEARCH_EMPTY_MSG);
    }

    public static Result emptyData(Object object) {
        return new Result(Result.SUCCESS_WITHNODATA_CODE, CommonResultMsg.DATA_EMPTY_MSG, object);
    }

    /**
     * 产生参数错误result，方便使用
     * @return
     */
    public static Result paramError(){
        return fail(CommonResultMsg.PARAM_ERROR);
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
