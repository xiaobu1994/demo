package com.xiaobu.easyExcel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

import java.io.Serializable;

/**
 * The type User.
 *
 * @author 小布
 * @version 1.0.0
 * @className User.java
 * @createTime 2021年12月12日 20:49:00
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -7173446719049141230L;
    /**
     * The Id.
     */
    @ExcelProperty("ID")
    @ColumnWidth(30)
    private String id;
    /**
     * The Name.
     */
    @ExcelProperty("NAME")
    @ColumnWidth(20)
    private String name;


}
