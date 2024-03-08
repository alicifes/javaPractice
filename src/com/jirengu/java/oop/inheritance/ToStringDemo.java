package com.jirengu.java.oop.inheritance;

public class ToStringDemo {
    public static void main(String[] args) {
        Car car = new Car("BMW", "red", 2017, "X5", 300);
       //重写 toString
        //这里 car === car.toString()
        System.out.println(car);
    }
}
