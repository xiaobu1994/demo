package com.xiaobu.gc;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class GcDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(16);
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        int i = 0;
        while (true) {
            map.put(String.valueOf(threadLocalRandom.nextInt()), "vale");
            i++;
            System.out.println("执行了" + i + "次");
        }

    }
}
