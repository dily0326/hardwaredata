package com.ytrj.hardwaredata.controller;

import com.ytrj.hardwaredata.entity.base.Result;
import com.ytrj.hardwaredata.utils.JsonUtil;
import java.lang.reflect.ParameterizedType;
import java.util.Objects;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* @description : 接口控制 基础类
* @author : dongye
* @date : 2019/9/23
*/ 
public class BaseController <T> extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private Class<T> classT;
    protected Logger logger;

    private JsonUtil jsonUtils = new JsonUtil();


    protected BaseController() {
        ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
        classT = (Class<T>) type.getActualTypeArguments()[0];
        logger = LoggerFactory.getLogger(classT);
    }

    /**
     * 取得客户端IP.
     */
    public static String getIp(HttpServletRequest requst) {
        HttpServletRequest request = requst;
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    /**
     * 取得HttpRequest中Parameter的简化方法.
     */
    public static String getParameter(String name, HttpServletRequest requst) {
        return requst.getParameter(name);
    }


    /**
     * 获得JSON参数串
     *
     * @param request
     * @return
     */
    public String getJsonStr(HttpServletRequest request) {
        return Objects.nonNull(request.getAttribute("jsonStr")) ? request.getAttribute("jsonStr").toString() : null;
    }

    /**
     * 返回提示信息
     *
     * @param code
     * @param object
     * @param request
     * @param response
     */
    public void renderJson(int code, String msg, Object object, HttpServletRequest request, HttpServletResponse response) {
        jsonUtils.renderJson(new Result(code,msg,object), response, request);
    }
}
