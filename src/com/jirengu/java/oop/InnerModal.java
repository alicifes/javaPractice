package com.jirengu.java.oop;

public class InnerModal {
    //jvm 内存结构 (重点)

    //jmm java memory modal java内存模型
    //java对象模型

    //java内存模型 主要分为两块 栈stack  以及  堆heap 方法区

    //基本类型：存在stack，直接存储
    //引用类型：对象存在stack区,本质上是存的地址的索引,指向heap，heap存储对象

    //方法区  线程池（共享）类的信息 属性 方法 常量池 类  大小

    //堆 保存new出来的对象不联系  但是栈是一个连续的东西(线程)LIFO
    public static void main(String[] args) {
        //在new 对象的过程中，首先要由一个空的栈来进行创建
        //每一个方法都会创建一个栈帧在stack中，然后进行引用  （栈帧执行中会压栈，执行当前的方法）
    }
}
