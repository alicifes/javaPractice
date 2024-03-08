package com.jirengu.java.basic;

public class suvCar {
   //cmd + n 构造器
   int topSpeed;
    int seats;
    String color;
    //一个类必须要有一个构造器
    //构造器生成,this指代这个类
    public suvCar(int topSpeed, int seats, String color) {
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.color = color;
    }

    //一个包 = 一个文件夹
}
