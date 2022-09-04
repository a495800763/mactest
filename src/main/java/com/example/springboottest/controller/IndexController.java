package com.example.springboottest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("hello")
    public String hello() {
        Person p = new Person();
        p.setAddress("潜江市");
        p.setGrade(ENUMGRADE.FIRST);
        p.setAge(24);
        p.setName("Mike");
        p.setTelephone(15527049978L);
        return p.toString();
    }
}


class Person {
    private int age;
    private String name;
    private String address;
    private long telephone;
    private ENUMGRADE grade;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public ENUMGRADE getGrade() {
        return grade;
    }

    public void setGrade(ENUMGRADE grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephone=" + telephone +
                ", grade=" + grade +
                '}';
    }
}

enum ENUMGRADE{
    FIRST(1,"低年级"),
    SECOND(2,"高年级");

    private int value;
    private String des;

    ENUMGRADE(int value, String des) {
        this.value = value;
        this.des = des;
    }

    @Override
    public String toString() {
        return "ENUMGRADE{" +
                "des='" + des + '\'' +
                '}';
    }
}
