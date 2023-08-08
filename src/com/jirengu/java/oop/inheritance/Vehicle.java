package com.jirengu.java.oop.inheritance;

public class Vehicle {
    String name;
    private String color;
    private int year;
    private String model;
    private int maxSpeed;

    public Vehicle(String name, String color, int year, String model, int maxSpeed) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void getPrintInfom () {
        System.out.println("name: " + name);
        System.out.println("color: " + color);
        System.out.println("year: " + year);
        System.out.println("model: " + model);
        System.out.println("maxSpeed: " + maxSpeed);
    }
}
