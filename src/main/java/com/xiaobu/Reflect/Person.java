package com.xiaobu.Reflect;

import lombok.Data;

import java.io.Serializable;

/**
 * The type Person.
 *
 * @version JDK1.8.0_171
 * @date on 2021/6/15 19:02
 * @description
 */
@Data
public class Person implements Serializable {
    /**
     * The constant serialVersionUID.
     */
    private static final long serialVersionUID = 7353364411628218048L;
    /**
     * The Name.
     */
    private String name;
    /**
     * The Age.
     */
    private int age;
}
