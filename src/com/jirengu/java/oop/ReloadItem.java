package com.jirengu.java.oop;


public class ReloadItem {
    public static void main(String[] args) {
        //直接进行重构Item
        //只是关注于参数类型，不关注于返回值参数的返回值 String String
        //overLoad重载


        //常量 Constant，这里的常量一般都使用的大写,final
        final int MAX_SPEED = 100;
        System.out.println(MAX_SPEED);

        //Static  属于类,生命周期也属于类
        //构造器生成的demo和类的构造器的不一致
        //在类的内部直接生成的方法的时候可以直接生成该方法，而不是需要生成一个对象
        //static需要调用static
    }
    static int age;
    //静态代码块主要用于代码的初始化
    static {
        age = 10;
    }
    //import导入类
    //外部包才需要使用import，不要使用*，这样会导致内存的浪费；最好是显示的应用包
}
