package com.jirengu.java.oop.inheritance;

public class Car extends Vehicle{
    public Car(String name, String color, int year, String model, int maxSpeed) {
        //调用父类的构造器
        super(name, color, year, model, maxSpeed);
    }

    public static void main(String[] args) {
        Car car = new Car("BMW", "red", 2017, "X5", 300);
        //只有父类为public的时候才能使用
        System.out.println(car.name);
        car.getPrintInfom();
        //instanceof 判断实例
        System.out.println(car instanceof Car);
        //super 用于在子类中找父类的属性 区分this
        //再构造子类的时候，会先构造父类，会往上找，找到object
    }
}
