package com.xiaobu.demo2;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author xiaobu
 * @version JDK1.8.0_171
 * @date on  2019/6/21 17:27
 * @description
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String message = demoEvent.getMessage();
        System.out.println("message = " + message);
        
    }
}
