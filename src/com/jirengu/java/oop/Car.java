package com.jirengu.java.oop;

public class Car {
    //状态 字段 fields 成员变量
    int topSpeed;
    int seats;
    String color;
    //构造器,名字必须相同 显示声明&& 隐式声明
    //前期显示声明
    //本质上是一个特殊的方法
    //无参构造器
    Car() {
        topSpeed = 100;
        seats = 4;
        color = "red";
    }

    //方法（行为）
    void drive() {
        System.out.println("drive");
    }
    void stop() {
        System.out.println("stop");
    }

    public static void main(String[] args) {
        //实现一个car对象
        Car car = new Car();
        //创造的时候进行赋值，这里需要使用构造器
        car.drive();
        car.stop();
    }
}
//一个类有且只有一个public class
//一个java文件可以有多个class
class Car2 {
    //状态 字段 fields 成员变量
    int topSpeed;
    int seats;
    String color;
    //构造器,名字必须相同 显示声明&& 隐式声明
    Car2() {
        topSpeed = 100;
        seats = 4;
        color = "red";
    }
    //方法（行为）
    void drive() {
        System.out.println("drive");
    }
    void stop() {
        System.out.println("stop");
    }

    public static void main(String[] args) {
        //实现一个car对象
        Car2 car = new Car2();
        //创造的时候进行赋值，这里需要使用构造器
        car.drive();
        car.stop();
    }
}
