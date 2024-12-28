package com.xiaobu.collection;

import org.testng.collections.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type List test.
 *
 * @author xiaobu
 * @version JDK1.8.0_171
 * @date on 2021/6/1 22:12
 * @description
 */
public class ListTest {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        List<String> subList = list.subList(0, 1);
        System.out.println("subList = " + subList);
        subList = Lists.newArrayList(subList);
        list.remove(0);
        System.out.println("subList = " + subList);
        System.out.println("list = " + list);
        List list1 = list.stream().skip(0).limit(1).collect(Collectors.toList());
        System.out.println("list1 = " + list1);
    }
}
