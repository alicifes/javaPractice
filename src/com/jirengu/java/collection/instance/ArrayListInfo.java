package com.jirengu.java.collection.instance;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInfo {
    //ArrayList是一个数组队列，相当于 动态数组
    //用于实现容量大小可变的数组

    //查询效率高，增删效率低
    //ArrayList线程不安全，Vector线程安全，但是新的版本推荐ArrayList


    //构造一个ArrayList，不推荐
   ArrayList arrayList = new ArrayList();
   //推荐写法,前方抽象类，后方实现类，然后这里的泛型不能传入基本类型，只能传入包装类

    public static void main(String[] args) {
        List<Integer> arrListInt = new ArrayList<>();
        List<String> arrListString = new ArrayList<>();
        arrListInt.add(1);
        arrListInt.add(2);
        System.out.println(arrListInt.size());

        //使用toArray
        Object[] arr = arrListInt.toArray();
        for(Object i : arr){
            String str = i.toString();
            System.out.println(str);
        }

        //需要考虑传入数组的长度,；两者取其大，因此这里推荐写0，这样可以取其中大的地方
        Integer [] arr1 = arrListInt.toArray(new Integer[0]);
        System.out.println(arr1.length);

        //lambda表达式
        //java8的forEach
        arrListInt.forEach(System.out::println);
        //add是在前方加入，然后移动。set是在指定位置加入
        //arrListInt.add(0, 3); set也是如此
        //remove是删除指定位置，也可以删除指定元素
        //arrListInt.remove(0);
        //arrListInt.remove(new Integer(1)); 删除指定元素

        //Bulk Operation批量操作
    }
}
