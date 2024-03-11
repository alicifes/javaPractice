package com.jirengu.java.hashMapTest;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        //创建一个hashMap
        Map<String, Double> hashMap = new HashMap<>();
        //hashMap put放入值的时候，如果之前为空，会放回null
        //本质上来说会返回之前的值
        hashMap.put("abc", 1.0);
        System.out.println(hashMap.putIfAbsent("abcd", 1.22)); //边界保护,也是返回之前的值
        hashMap.getOrDefault("asds", 123.2); //如果hashMap有kay,就直接返回，如果没有就赋值返回value
        //hashMap.containsKey();
        //hashMap.containsValue();
        //找是否有返回
        hashMap.remove("acdc"); //remove成功会返回之前的值，如果没返回null
        //如果传入两个参数的话，会同时比较key和value
        hashMap.replace("sad", 12.3); //类似于put如果没有直接返回null。如果有返回value：
        //只用于更新操作

        //keySet entry
        Set<String> hashMapSet = hashMap.keySet(); //因为key是唯一的

        //集合，获取全部的value
        Collection<Double> values = hashMap.values(); //

        //遍历所有的entry
        Set<Map.Entry<String, Double>> setEntry = hashMap.entrySet();
        for (Map.Entry<String, Double> entry : setEntry) {
            entry.getKey();
        }
        //遍历hashMap
        //1.使用entry来进行遍历
        //2.keySet =》 遍历
        //3.迭代器(不推荐) entrySet() keySet()
        Iterator<Map.Entry<String, Double>> Inter = hashMap.entrySet().iterator();
        while (Inter.hasNext()) {
            //ddddd 进行迭代
        }
        //4.推荐使用lamda forEach
        hashMap.forEach((k, v) -> System.out.println("key" + k + "value" + v));
        //hash函数本质上是生成独一无二的hash的函数
        //使用times 33算法
        //生成一个times33算法
        //在String中有一个hashcode的方法，该方法使用times33算法。
        //使用的值为31，因为其是一个质数，而且接近2的5次方，方便使用位运算
        //改变hash索引，求模，java使用0.75的负载因子

        //开放寻址法 线性探测

        //开散列 open hashing 也叫做拉链法
        //基于数组 + 链表 1.7之前
        // => 红黑树 1.8之后
    }
}
