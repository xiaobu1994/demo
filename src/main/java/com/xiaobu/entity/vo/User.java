package com.xiaobu.entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author 小布
 * @version 1.0.0
 * @className User.java
 * @createTime 2024年09月25日 21:11:00
 */
@Data
public class User {
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthDay;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date createTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endTime;
    private Integer age;
}
