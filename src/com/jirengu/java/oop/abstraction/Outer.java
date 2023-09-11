package com.jirengu.java.oop.abstraction;

public class Outer {
    private int number;
   //内部类
    //非静态内部类可以使用外部类的成员方法和属性
    //静态内部类无法直接使用外部类的成员方法和属性

    //非静态类会在内部写入一个$this

    public static void gerStaticMethods() {
        System.out.println("Static");
    }
    public void outMethod() {
        System.out.println("Outer");
    }

    private class Inner {
        public void innerMethod() {
            gerStaticMethods();
            outMethod();
            System.out.println("method");
        }
    }

    public class Bird {
        public static void flyAble(){
            System.out.println("111");
        }
    }

    //匿名内部类
    public void main(String[] args) {
        //直接实现匿名内部类
        Bird bird = new Bird(){
            @Override
            public String toString() {
                return "$classname{}";
            }
        };
    }
}
