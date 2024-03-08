package com.jirengu.java.oop.abstraction;

public abstract class Animal {

    //abstract 方法不能用final，static， private
    abstract void eat();

    abstract void makeSound();

    private static void walk() {
        System.out.println("I can walk");
    }

    public static void main(String[] args) {
        walk();
    }
}
