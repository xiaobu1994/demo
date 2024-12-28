package com.xiaobu.gc;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author xiaobu
 * @version JDK1.8.0_171
 * @date on  2019/5/16 17:41
 * @description V1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        Map map = System.getProperties();
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        int i = 0;
        while (true) {
            i++;
            map.put(threadLocalRandom.nextInt(), "value");
            System.out.println("执行了 " + i + "次");
        }
    }
}
