package com.jirengu.java.collection.info;

public class AbstractMap {
    //AbstractMap是一个抽象类，它实现了Map接口
    //Map接口中的方法：
    //1. void clear()：清空Map
    //Map => entrySet()内部结构
    //Map本身是没有迭代器的。迭代器来自entrySet()，
    // entrySet()返回的是一个Set集合 => collection

    //Views视图
    //keySet()：返回一个Set集合，这个集合中存放的是Map中的所有key

    //SimpleEntry key不可变，value可变
    //SimpleImmutableEntry key和value都不可变
}
