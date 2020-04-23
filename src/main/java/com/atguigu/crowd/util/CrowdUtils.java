package com.atguigu.crowd.util;

import javax.servlet.http.HttpServletRequest;


public class CrowdUtils {
    /**
     * 判断发出的请求类型  1、ajax请求  2、普通请求
     *
     * @param request
     * @return
     */
    public static boolean judgeRequestType(HttpServletRequest request) {
        //获取请求消息头信息
        String acceptInformation = request.getHeader("Accept");
        String xRequestInformation = request.getHeader("X-Requested-With");


        return (acceptInformation != null && acceptInformation.length() > 0 && acceptInformation.contains("application/json"))
                || (xRequestInformation != null && xRequestInformation.length() > 0 && xRequestInformation.equals("XMLHttpRequest"));

    }
}
