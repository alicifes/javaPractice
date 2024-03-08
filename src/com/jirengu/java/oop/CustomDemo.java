package com.jirengu.java.oop;

public class CustomDemo {
    int age;
    String name;

    public static void sayInform(CustomDemo c) {
        System.out.println("doSomeThing"+ c.age);
        System.out.println("doSomeThing"+ c.name);
    }

    public static void main(String[] args) {
        CustomDemo customDemo = new CustomDemo();
        customDemo.age = 10;
        customDemo.name = "JOIN";
        sayInform(customDemo);
    }
}

