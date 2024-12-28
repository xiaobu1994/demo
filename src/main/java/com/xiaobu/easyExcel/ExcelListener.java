package com.xiaobu.easyExcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import lombok.SneakyThrows;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 小布
 * @version 1.0.0
 * @className ExceListener.java
 * @createTime 2021年12月12日 20:51:00
 */
public class ExcelListener extends AnalysisEventListener<User> {

    private final Set<User> users1 = new HashSet<>();
    private final Set<User> users2 = new HashSet<>();
    private final Set<User> users3 = new HashSet<>();
    private final Set<User> users4 = new HashSet<>();
    private final Set<User> users5 = new HashSet<>();
    private final Set<User> users6 = new HashSet<>();
    private final Set<User> users7 = new HashSet<>();
    private final Set<User> users8 = new HashSet<>();
    private final Set<User> users9 = new HashSet<>();
    private final Set<User> users10 = new HashSet<>();
    private final Set<User> users11 = new HashSet<>();
    private final Set<User> users12 = new HashSet<>();

    @Override
    public void invoke(User user, AnalysisContext analysisContext) {
        System.out.println(user);
        String id = user.getId();
        String month = id.substring(10, 12);
        switch (month) {
            case "01":
                users1.add(user);
                break;
            case "02":
                users2.add(user);
                break;
            case "03":
                users3.add(user);
                break;
            case "04":
                users4.add(user);
                break;
            case "05":
                users5.add(user);
                break;
            case "06":
                users6.add(user);
                break;
            case "07":
                users7.add(user);
                break;
            case "08":
                users8.add(user);
                break;
            case "09":
                users9.add(user);
                break;
            case "10":
                users10.add(user);
                break;
            case "11":
                users11.add(user);
                break;
            default:
                users12.add(user);
        }
    }

    @SneakyThrows
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        String fileName1 = "D:\\export\\一月份.xlsx";
        String fileName2 = "D:\\export\\二月份.xlsx";
        String fileName3 = "D:\\export\\三月份.xlsx";
        String fileName4 = "D:\\export\\四月份.xlsx";
        String fileName5 = "D:\\export\\五月份.xlsx";
        String fileName6 = "D:\\export\\六月份.xlsx";
        String fileName7 = "D:\\export\\七月份.xlsx";
        String fileName8 = "D:\\export\\八月份.xlsx";
        String fileName9 = "D:\\export\\九月份.xlsx";
        String fileName10 = "D:\\export\\十月份.xlsx";
        String fileName11 = "D:\\export\\十一月份.xlsx";
        String fileName12 = "D:\\export\\十二月份.xlsx";
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，
        // 名字为模板 然后文件流会自动关闭
        EasyExcel.write(fileName1, User.class).sheet("数据").doWrite(users1);
        EasyExcel.write(fileName2, User.class).sheet("数据").doWrite(users2);
        EasyExcel.write(fileName3, User.class).sheet("数据").doWrite(users3);
        EasyExcel.write(fileName4, User.class).sheet("数据").doWrite(users4);
        EasyExcel.write(fileName5, User.class).sheet("数据").doWrite(users5);
        EasyExcel.write(fileName6, User.class).sheet("数据").doWrite(users6);
        EasyExcel.write(fileName7, User.class).sheet("数据").doWrite(users7);
        EasyExcel.write(fileName8, User.class).sheet("数据").doWrite(users8);
        EasyExcel.write(fileName9, User.class).sheet("数据").doWrite(users9);
        EasyExcel.write(fileName10, User.class).sheet("数据").doWrite(users10);
        EasyExcel.write(fileName11, User.class).sheet("数据").doWrite(users11);
        EasyExcel.write(fileName12, User.class).sheet("数据").doWrite(users12);
    }


    public static void main(String[] args) {
        // 指定读的路径
        String fileName = "D:\\out.xlsx";
        //  调用读的方法
        EasyExcel.read(fileName, User.class, new ExcelListener())
                .sheet().doRead();
        // EasyExcel.read(fileName, User.class, new PageReadListener<User>(dataList -> {
        //             for (User user : dataList) {
        //                 System.out.println("user = " + user);
        //             }
        //         }))
        //         .sheet().doRead();
    }
}
