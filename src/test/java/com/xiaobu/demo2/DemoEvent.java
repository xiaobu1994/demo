package com.xiaobu.demo2;

import org.springframework.context.ApplicationEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaobu
 * @version JDK1.8.0_171
 * @date on  2019/6/21 17:19
 * @description
 */
public class DemoEvent extends ApplicationEvent {
    Map<String, String> map = new HashMap<>();


    private static final long serialVersionUID = 3435495331570779706L;
    private String message;

    public DemoEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
