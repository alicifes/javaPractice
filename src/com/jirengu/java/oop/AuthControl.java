package com.jirengu.java.oop;

public class AuthControl {
    //在java中，如果我不想把当前代码给别人使用，保持内部的封装，这里就需要使用代码权限的控制
    // private 私有类型 只能在当前的类中使用
    // public 公有类型 可以在任何地方使用,

    private int age;
    private String name;

    private AuthControl(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void printEnd() {
        System.out.println("age"+ this.age);
    }

    public static void main(String[] args) {
        AuthControl authControl = new AuthControl(10, "jirengu");
        authControl.printEnd();
    }

}
