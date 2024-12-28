package com.xiaobu.collection;

import com.alibaba.fastjson.JSON;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author xiaobu
 * @version JDK1.8.0_171
 * @date on  2021/5/30 21:10
 * @description
 */
public class CountStr {

    public static void main(String[] args) {
        String str = "abjdskajdklwqklwjkasljdksal";
        Map<String, Long> collect = Stream.of(str.split("")).collect(Collectors.groupingBy(String::toString, Collectors.counting()));
        System.out.println(JSON.toJSONString(collect));
    }
}
