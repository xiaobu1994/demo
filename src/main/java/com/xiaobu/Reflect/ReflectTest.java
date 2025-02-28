package com.xiaobu.Reflect;

import lombok.Data;
import lombok.SneakyThrows;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * @author xiaobu
 * @version JDK1.8.0_171
 * @date on  2021/6/15 18:45
 * @description
 */
public class ReflectTest {
    @SneakyThrows
    public static void main(String[] args) {
        demo2();
       // getInstance();
        demo();
    }

    @SneakyThrows
    public static void demo() {
        Class<?> c = Person.class;
        //Class<? extends Person> c = Person.class;
        Field f1 = c.getDeclaredField("name");
        System.out.println("-----Class.getDeclaredField(String name)用法-------");
        System.out.println("-----Class.getDeclaredFields()用法-------");
        //通过Class.getDeclaredFields()获取类或接口的指定属性值。
        Field[] f2 = c.getDeclaredFields();
        for (Field field : f2) {
            field.setAccessible(true);
            //Exception in thread "main" java.lang.IllegalArgumentException: Can not set java.lang.String field com.xiaobu.Reflect.ReflectTest$Person.name to java.lang.Class
            System.out.println(field.get(c));
        }
        //修改属性值
        System.out.println("----修改name属性------");
        f1.setAccessible(true);
       //Exception in thread "main" java.lang.IllegalArgumentException: Can not set java.lang.String field com.xiaobu.Reflect.ReflectTest$Person.name to java.lang.Class
        f1.set(c, "Maoge");
        //修改后再遍历各属性的值
        Field[] f3 = c.getDeclaredFields();
        for (Field fields : f3) {
            fields.setAccessible(true);
            System.out.println(fields.get(c));
        }

    }

    @SneakyThrows
    public static void demo2() {
        Person person = new Person();
        //通过Class.getDeclaredField(String name)获取类或接口的指定属性值。
        Field f1 = Person.class.getDeclaredField("name");
        //Field f1 = person.getClass().getDeclaredField("name");
        System.out.println("-----Class.getDeclaredField(String name)用法-------");
        //System.out.println(f1.get(person));
        System.out.println("-----Class.getDeclaredFields()用法-------");
        //通过Class.getDeclaredFields()获取类或接口的指定属性值。
        Field[] f2 = person.getClass().getDeclaredFields();
        for (Field field : f2) {
            field.setAccessible(true);
            System.out.println(field.get(person));
        }
        //修改属性值
        System.out.println("----修改name属性------");
        f1.setAccessible(true);
        f1.set(person, "Maoge");
        //修改后再遍历各属性的值
        Field[] f3 = person.getClass().getDeclaredFields();
        for (Field fields : f3) {
            fields.setAccessible(true);
            System.out.println(fields.get(person));
        }

    }

    @SneakyThrows
    public static void getInstance() {
        //1. 通过类名获取
        Class<com.xiaobu.Reflect.Person> p= com.xiaobu.Reflect.Person.class;
        //p = class com.xiaobu.Reflect.ReflectTest$Person
        System.out.println("p = " + p);
        //2. 通过对象实例获取
        com.xiaobu.Reflect.Person person = new com.xiaobu.Reflect.Person();
        Class<? extends com.xiaobu.Reflect.Person> personClass = person.getClass();
        System.out.println(personClass);
        //3. 通过Class类静态方法获取
        //通过Class类静态方法forName()获取
        //Exception in thread "main" java.lang.ClassNotFoundException: com.xiaobu.Reflect.ReflectTest.Person
        Class<?> c = Class.forName("com.xiaobu.Reflect.ReflectTest.Person");
        System.out.println(c);
    }

    @Data
    public static class Person implements Serializable {
        private static final long serialVersionUID = 7353364411628218048L;
        private String name;
        private int age;
    }

}
