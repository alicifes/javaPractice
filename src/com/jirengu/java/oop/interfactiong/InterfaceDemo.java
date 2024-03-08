package com.jirengu.java.oop.interfactiong;

public interface InterfaceDemo {
    //接口内部只有缺省和public两种
    interface Interface3 {
        //在接口内部，定义的变量就等于
        //public static final
    }
    //在带上FunctionalInterface注解的接口中，
    //只能有一个抽象方法

    //默认方法
    //可以被实现的类去实现
    //为了实现函数式编程 在1.8之后才有的
    //java的思路是兼容所有的方法
    default void defaultMethod() {
        System.out.println("default method");
    }
    //如果两个接口的名称冲突的话，需要使用接口名.super.方法名

    //静态方法,在子类中不能被重写
    static void staticMethod() {
        System.out.println("static method");
    }
}
