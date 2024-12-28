package com.xiaobu.controller;

import com.xiaobu.entity.vo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author 小布
 * @className DemoController.java
 * @createTime 2022年04月01日 19:52:00
 */
@RestController
@RequestMapping("test")
@Slf4j
public class TestController {

    @PostMapping("test1")
    public User test1(@RequestBody User user) {
        log.info("【test1】::user = [{}]", user);
        return user;
    }

    @PostMapping("test2")
    public User test2(User user) {
        log.info("【test2】::user = [{}]", user);
        return user;
    }


}
