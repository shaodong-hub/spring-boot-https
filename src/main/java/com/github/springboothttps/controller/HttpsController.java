package com.github.springboothttps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 创建时间为 19:01 2019-04-11
 * 项目名称 spring-boot-https
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@RestController
public class HttpsController {

    @GetMapping("/")
    public String hello(){
        return "Hello world!";
    }


}
