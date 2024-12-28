package com.xiaobu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @className T.java
 * @author 小布
 * @version 1.0.0
 * @createTime 2022年05月20日 21:36:00
 */

@Data
@NoArgsConstructor
@TableName(value = "t")
public class T implements Serializable {
    @TableField(value = "i")
    private Integer i;

    @TableField(value = "`name`")
    private String name;

    private static final long serialVersionUID = 1L;
}