package com.jirengu.java.oop.inheritance;

public class Vehicle {
    private String name;
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

    void getPrintInform () {
        System.out.println("name: " + name);
        System.out.println("color: " + color);
        System.out.println("year: " + year);
        System.out.println("model: " + model);
        System.out.println("maxSpeed: " + maxSpeed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
