package com.xiaobu.easyExcel;

import cn.hutool.core.util.StrUtil;
import com.alibaba.excel.EasyExcel;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 小布
 * @className ReadUserTxt.java
 * @createTime 2022年04月06日 18:49:00
 */
public class ReadUserTxt {
    public static void main(String[] args) {
        List<User> users = readTxt();
        String s = writeExcel(users);
        //  调用读的方法
        EasyExcel.read(s, User.class, new ExcelListener())
                .sheet().doRead();
    }

    @SneakyThrows
    public static List<User> readTxt() {
        List<User> userList = new ArrayList<>();
        String pathname = "D:\\new 2.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
        File filename = new File(pathname); // 要读取以上路径的input。txt文件
        InputStreamReader reader = new InputStreamReader(
                new FileInputStream(filename)); // 建立一个输入流对象reader
        BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
        String line;
        while (StrUtil.isNotBlank(line = br.readLine())) {
            // 一行一行地处理...
            System.out.println(line);
            User user = new User();
            String[] s = line.split(" ");
           /* String id = s[0];
            String name = s[1];*/
            String id = s[0];
            String name = s[1];
            user.setId(id);
            user.setName(name);
            userList.add(user);
        }
        return userList;

    }

    public static String writeExcel(List<User> users) {
        String fileName = "D:\\out.xlsx";
        EasyExcel.write(fileName, User.class).sheet("数据").doWrite(users);
        return fileName;
    }


}
