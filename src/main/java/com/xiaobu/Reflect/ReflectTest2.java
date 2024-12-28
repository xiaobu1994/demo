package com.xiaobu.Reflect;

import lombok.SneakyThrows;

/**
 * @author xiaobu
 * @version JDK1.8.0_171
 * @date on  2021/6/15 18:45
 * @description
 */
public class ReflectTest2 {
    @SneakyThrows
    public static void main(String[] args) {
       getInstance();
    }

    @SneakyThrows
    public static void getInstance() {
        //1. 通过类名获取
        Class<Person> p=Person.class;
        //p = class com.xiaobu.Reflect.ReflectTest$Person
        System.out.println("p = " + p);
        //2. 通过对象实例获取
        Person person = new Person();
        Class<? extends Person> personClass = person.getClass();
        System.out.println(personClass);
        //3. 通过Class类静态方法获取
        //通过Class类静态方法forName()获取
        Class<?> c = Class.forName("com.xiaobu.Reflect.Person");
        System.out.println(c);
    }
}
