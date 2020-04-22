package com.atguigu.crowd.util;

/**
 * 统一返回前台数据格式
 *
 * @param <T>
 */
public class ResultEntity<T> {

    private static final String SUCCESS = "SUCCESS";
    private static final String FAIL = "FAIL";
    private String result;   // 用来封装当前的请求处理的结果是否返回成功
    private String message;  //请求失败时 返回时的错误数据
    private T data;          // 要返回的数据

    /**
     * 处理请求成功没有返回数据
     *
     * @param <Type>
     * @return
     */
    public static <Type> ResultEntity<Type> successWithOutData() {
        return new ResultEntity<Type>(SUCCESS, null, null);
    }

    /**
     * 处理请求成功返回数据
     *
     * @param data
     * @param <Type>
     * @return
     */
    public static <Type> ResultEntity<Type> successWithData(Type data) {
        return new ResultEntity<Type>(SUCCESS, null, data);
    }

    /**
     * 处理失败的请求 返回错误信息
     *
     * @param <Type>
     * @return
     */
    public static <Type> ResultEntity<Type> failWithOutData(String message) {
        return new ResultEntity<Type>(FAIL, message, null);
    }


    public ResultEntity() {
    }

    public ResultEntity(String result, String message, T data) {
        this.result = result;
        this.message = message;
        this.data = data;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
