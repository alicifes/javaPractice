package com.jirengu.java.oop;

public class AccessBestPractice {
    //定义基础的属性的话一般使用private
    private int id;
    private String name;

    //在外部使用的话使用xxxx.getId()这样的方式
    //如果想修改的话，使用setId方法来修改
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //如果想要在外部拿到private属性的话，需要使用getter和setter

    //构造器一般是使用public 这样方便别人使用
    public AccessBestPractice(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //暴露给别人的方法
    public void doSomeThing() {
    }
    //不想
    private void doSomeThing2() {
    }
    public static void main(String[] args) {

    }
}
