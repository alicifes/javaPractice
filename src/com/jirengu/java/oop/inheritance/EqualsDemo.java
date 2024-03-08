package com.jirengu.java.oop.inheritance;

public class EqualsDemo {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "red", 2017, "X5", 300);
        Car car2 = new Car("BMW", "red", 2017, "X5", 300);
        //比较两个值是否相同
        System.out.println(car1.equals(car2));
    }
}
