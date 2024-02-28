package com.jirengu.java.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class myCollectionSort {
    //collection sort 底层还是将其转化为数组进行排序
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(2);
        list.add(9);
        list.add(7);
        for (Integer item: list){
            System.out.println("past"+ item);
        }
        Collections.sort(list);
        for (Integer item: list){
            System.out.println("cur"+ item);
        }
    }
}
