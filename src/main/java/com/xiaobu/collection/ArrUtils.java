package com.xiaobu.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xiaobu
 * @version JDK1.8.0_171
 * @date on  2021/5/30 21:12
 * @description
 */
public class ArrUtils {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        String[] arrStr = {"1", "2", "3", "4"};
        List<String> list = Arrays.asList(arrStr);
        String str1 = Arrays.stream(arr).boxed().map(i -> i.toString()) //必须将普通数组 boxed才能 在 map 里面 toString
                .collect(Collectors.joining(","));
        System.out.println(str1);
        String splitStr = splitArr(arrStr);
        System.out.println("splitStr = " + splitStr);
        System.out.println("splitList(list) = " + splitList(list));
        String[] newArr = copyNewArr(arrStr);
        System.out.println("newArr = " + newArr);

    }


    public static String splitArr(String[] arr) {
        return String.join(",", arr);
    }


    public static String splitList(List<String> list) {
        return String.join(",", list);
    }


    public static String[] copyNewArr(String[] strArr) {
        String[] newArr = new String[strArr.length - 1];
        System.arraycopy(strArr, 1, newArr, 0, newArr.length);
        return newArr;
    }

}
