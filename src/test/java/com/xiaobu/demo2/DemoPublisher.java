package com.xiaobu.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author xiaobu
 * @version JDK1.8.0_171
 * @date on  2019/6/21 17:34
 * @description
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;

    public void publish(String message) {
        //发布事件
        applicationContext.publishEvent(new DemoEvent(this, message));
    }

    public static void main(String[] args) {
        DemoPublisher publisher = new DemoPublisher();
        publisher.publish("你好!");
    }

}
