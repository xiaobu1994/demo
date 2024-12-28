package com.xiaobu.logTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test1 {

    public static void main(String[] args) {
        String i = "122";
        int j = Integer.parseInt(i);
        System.out.println("j = " + j);
        log.debug("debug-test");
        log.info("info-test");
        log.error("error-test");
    }
}
