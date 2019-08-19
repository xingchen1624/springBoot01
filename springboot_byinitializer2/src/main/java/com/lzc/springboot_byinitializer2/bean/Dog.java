/**
 * Copyright (C), 2012-2019, by xavier chen
 * FileName: Dog
 * Author:   chen
 * Date:     2019/8/19 22:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 **/
package com.lzc.springboot_byinitializer2.bean;

/**
 * 〈一句话功能简述〉
 * 〈〉
 * @Author chen
 * @Date 2019/8/19
 * @since 1.0.0
 **/
public class Dog {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}