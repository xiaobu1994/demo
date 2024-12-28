package com.xiaobu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小布
 * @className DemoController.java
 * @createTime 2022年04月01日 19:52:00
 */
@RestController
@RequestMapping("demo")
@Slf4j
public class DemoController {

    @GetMapping("test1")
    public String test1() {
        log.info("【test1】::\"log\" ==> 【{}】", "log");
        //log.info("【test1】::\"log1111111\" ==> 【{}】", "log1111111");
        return "test1";
    }

    /**
     * 处理对应的GET请求，返回一个简单的字符串。
     *
     * @return 返回字符串"test3"，用于在浏览器中显示。
     */
    @GetMapping("test3")
    public String test3() {
        return "test3";
    }

    @GetMapping("test2")
    public String test2() {
        log.info("【test2】::\"log\" ==> 【{}】", "log");
        return "test2";
    }
}
