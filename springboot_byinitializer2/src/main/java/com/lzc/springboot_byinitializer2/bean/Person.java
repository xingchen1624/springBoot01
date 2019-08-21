/**
 * Copyright (C), 2012-2019, by xavier chen
 * FileName: Person
 * Author:   chen
 * Date:     2019/8/19 22:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 **/
package com.lzc.springboot_byinitializer2.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件的配置每个属性的值，映射到组件中
 * @ConfigurationProperties:告诉SpringBoot将文本的所有属性和配置文件中的相关配置进行绑定；
 * prefix = "person" 配置文件中哪个配置和你的类中属性进行一一映射
 * 除了@ConfigurationProperties以外，还可以使用 @Value注解获取属性值
 * @Value类似于配置文件中的
 * <bean class="xxx">
 *  <property name="xxx" value="xxx"></property>
 * </bean>
 * 其中value属性中可以取值：①字面量 ②${key}从环境变量或配置文件中取值 ③#{SpEL} spring的表达式语言
 * 所以@Value也可以使用这三种取值方式
 *
 * 只有这个组件是容器中的组件，才能提供到容器中，这个组件必须要由spring容器管理 @Component
 * 一般情况下@ConfigurationProperties默认从全局配置文件中获取值
 * @PropertySource可以设置从指定配置文件中获取值,当默认配置文件太大，可以进行拆分
 */
//@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
//    @Value("${person.name}")
    private String name;
//    @Value("#{11*2}")
    private Integer age;
//    @Value("true")
    private Boolean boss;
    private Date birthday;

    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

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

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birthday=" + birthday +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}