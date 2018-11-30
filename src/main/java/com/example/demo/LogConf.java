package com.example.demo;

import com.granda.mogolog.LogAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author by guanda
 * @Date 2018/11/29 20:30
 */
@Configuration
public class LogConf {

    @Bean
    public LogAspect getLogAspect(){
        return new LogAspect();
    }
}
