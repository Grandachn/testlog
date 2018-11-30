package com.example.demo;

import com.granda.mogolog.LogUtil;

/**
 * @Author by guanda
 * @Date 2018/11/30 15:03
 */
public class TestService {
    public void test(){
        try{
            throw new RuntimeException("test");
        }catch (RuntimeException e){
            throw e;
        }
    }
}
