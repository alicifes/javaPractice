package com.jirengu.java.oop.polymorphism;

public class Rectangle extends Shape{

    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public double calculateArea() {
        return width * height;
    }
    //用单一的类型来进行表示

    //向上以及向下转型
    //向上转型 自动的，父可以转为子
    //向下转型 需要强制的，子转为父(xxxx)xxxx
}