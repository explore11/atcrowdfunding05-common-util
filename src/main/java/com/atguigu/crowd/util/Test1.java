package com.atguigu.crowd.util;

import org.junit.jupiter.api.Test;

/**
 * @program: atcrowdfunding05-common-util
 * @description //TODO
 * @author: swq
 * @create: 2020-05-01 21:29
 **/
public class Test1{
    @Test
    public void md(){
        String source="123456";
        System.out.println(CrowdUtils.md5(source));
    }
}
