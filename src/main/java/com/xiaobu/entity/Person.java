package com.xiaobu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小布
 * @version 1.0.0
 * @className Person.java
 * @createTime 2022年06月02日 23:08:00
 */

@Data
@NoArgsConstructor
@TableName(value = "person")
public class Person implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    @TableField(value = "`name`")
    private String name;

    @TableField(value = "`month`")
    private Integer month;

    private static final long serialVersionUID = 1L;
}