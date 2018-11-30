package com.example.demo;

import com.granda.mogolog.LogToMongo;
import com.granda.mogolog.LogUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @Author by guanda
 * @Date 2018/11/29 20:27
 */
@RestController()
public class TestController {
    private TestService  testService = new TestService();

    @LogToMongo
    @GetMapping("/get")
    public int getInt() throws IOException {
        try{
            testService.test();
        }catch (RuntimeException e){
            LogUtil.logException(e);
//            throw e;
        }

        return 1;
    }
}

