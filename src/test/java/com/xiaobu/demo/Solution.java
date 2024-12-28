package com.xiaobu.demo;

/**
 * @author xiaobu
 * @version JDK1.8.0_171
 * @date on  2019/5/15 16:43
 * @description V1.0
 */
public class Solution {
    public static String multiply(String num1, String num2) {
        char[] value = new char[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                char a = num1.charAt(i);
                char b = num2.charAt(j);
                int c = a - '0';
                int d = b - '0';
                value[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }
        // 处理进位
        int carry = 0;
        for (int i = value.length - 1; i >= 0; i--) {
            value[i] += carry;
            carry = value[i] / 10;
            value[i] %= 10;
        }
        // 处理前端的 0
        int beginIndex = 0;
        while (beginIndex < value.length - 1 && value[beginIndex] == 0) {
            beginIndex++;
        }
        for (int i = beginIndex; i < value.length; i++) {
            value[i] += '0';
        }
        return new String(value, beginIndex, value.length - beginIndex);
    }


    public static void main(String[] args) {
        String num1 = "2";
        String num2 = "3";
        String result = multiply(num1, num2);
        System.out.println("result = " + result);
    }
}
