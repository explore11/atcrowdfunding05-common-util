package com.atguigu.crowd.util;

import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class CrowdUtils {

    /**
     * 对明文字符串进行MD5加密
     *
     * @param source 传入的明文字符串
     * @return 加密结果
     */
    public static String md5(String source) {

        // 1.判断source是否有效
        if (source == null || source.length() == 0) {

            // 2.如果不是有效的字符串抛出异常
            throw new RuntimeException(Constants.MESSAGE_STRING_INVALIDATE);
        }

        try {
            // 3.获取MessageDigest对象
            String algorithm = "md5";
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            // 4.获取明文字符串对应的字节数组
            byte[] input = source.getBytes();
            // 5.执行加密
            byte[] output = messageDigest.digest(input);
            // 6.创建BigInteger对象
            int sigNum = 1;
            BigInteger bigInteger = new BigInteger(sigNum, output);
            // 7.按照16进制将bigInteger的值转换为字符串
            int radix = 16;
            String encoded = bigInteger.toString(radix).toUpperCase();

            return encoded;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return null;
    }


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
