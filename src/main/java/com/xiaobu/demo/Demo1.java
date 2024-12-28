package com.xiaobu.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author xiaobu
 * @version JDK1.8.0_171
 * @date on  2021/6/22 20:53
 * @description
 */
@Slf4j
public class Demo1 {
    public static void main(String[] args) {
        log.debug("debug-test");
        log.info("info-test");
        log.error("error-test");
        //testInteger();
        //testString();
        //test2();
        //groupByTest();
        //
    }

    public static void testInteger() {
        List<Map<String, Integer>> list = new ArrayList<>();
        Map<String, Integer> map1 = new HashMap<>(16);
        map1.put("id", 1);
        map1.put("age", 1);
        Map<String, Integer> map2 = new HashMap<>(16);
        map2.put("id", 1);
        map2.put("age", 1);
        Map<String, Integer> map3 = new HashMap<>(16);
        map3.put("id", 2);
        map3.put("age", 1);
        list.add(map1);
        list.add(map2);
        list.add(map3);
        LinkedHashMap<Integer, List<Map<String, Integer>>> integerMap = list.stream()
                .sorted(Comparator.comparingInt(map -> (Integer) map.get("id")))
                .collect(Collectors.groupingBy(map -> (Integer) map.get("id"), LinkedHashMap::new, Collectors.toList()));
        //正常输出
        System.out.println("integerMap = " + integerMap);
    }

    public static void testString() {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>(16);
        map1.put("id", "1");
        map1.put("age", "1");
        Map<String, String> map2 = new HashMap<>(16);
        map2.put("id", "1");
        map2.put("age", "1");
        Map<String, String> map3 = new HashMap<>(16);
        map3.put("id", "2");
        map3.put("age", "1");
        list.add(map1);
        list.add(map2);
        list.add(map3);
        LinkedHashMap<String, List<Map<String, String>>> stringMap = list.stream()
                .sorted(Comparator.comparing(map -> map.get("id")))
                .collect(Collectors.groupingBy(map -> map.get("id"), LinkedHashMap::new, Collectors.toList()));
        //正常输出
        System.out.println("stringMap = " + stringMap);
    }

    public static void test2() {
        List<Map<String, Object>> dataList = new ArrayList<>();
        Map<String, Object> map1 = new HashMap<>(16);
        map1.put("id", "1");
        map1.put("name", "1");
        Map<String, Object> map2 = new HashMap<>(16);
        map2.put("id", "1");
        map2.put("name", "2");
        Map<String, Object> map3 = new HashMap<>(16);
        map3.put("id", "2");
        map3.put("name", "3");
        dataList.add(map1);
        dataList.add(map2);
        dataList.add(map3);
        Map<String, List<Map<String, Object>>> listLinkedHashMap = new LinkedHashMap<>();
        Map<String, List<Map<String, Object>>> temp = dataList.stream().collect(Collectors.groupingBy(map -> (String) map.get("id")));
        temp.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(e -> listLinkedHashMap.put(e.getKey(), e.getValue()));
        System.out.println("listLinkedHashMap = " + listLinkedHashMap);
        //comparingInt和comparing 会报错 要明确的指定类型  Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
        LinkedHashMap<Integer, List<Map<String, Object>>> ageMap = dataList.stream()
                .sorted(Comparator.comparingInt(map -> (Integer) map.get("id")))
                .collect(Collectors.groupingBy(map -> (Integer) map.get("id"), LinkedHashMap::new, Collectors.toList()));
        System.out.println("ageMap = " + ageMap);
    }

    /**
     * 分组
     */
    private static void groupByTest() {
        List<Person> persons = new ArrayList<>();
        for (int i = 1; i <= 40; i++) {
            Random r = new Random();
            Person person = new Person();
            person.setName("abel-" + i);
            person.setAge(25 + r.nextInt(50));
            persons.add(person);
        }
        //将list 排序，并按照排序后的结果进行有序分组 不会报错
        LinkedHashMap<Integer, List<Person>> ageMap = persons.stream().sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.groupingBy(Person::getAge, LinkedHashMap::new, Collectors.toList()));
        System.out.println("ageMap = " + ageMap);
    }
}