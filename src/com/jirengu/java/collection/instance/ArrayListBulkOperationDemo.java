package com.jirengu.java.collection.instance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayListBulkOperationDemo {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        list1.add("111");
        list1.add("222");

        System.out.println(list1);


        //这里containsAll是来自AbstractCollection接口的实现
        System.out.println(new HashSet<>(list1).containsAll(list2));
        //addAll
        list1.addAll(list2);
        list1.addAll(1, list2);
        //删除当前的list1中的所有list2的元素
        list1.removeAll(list2);
        //retainsAll,返回交集部分，如果是相同的也会保留
        list1.retainAll(list2);
    }
}
