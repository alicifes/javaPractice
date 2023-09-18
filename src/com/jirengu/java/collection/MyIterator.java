package com.jirengu.java.collection;


import java.util.Iterator;

public class MyIterator implements Iterator {

    int[] nums;
    int cursor = 0;

    public MyIterator(int[] nums) {
        this.nums = nums;
    }

    @Override
    public boolean hasNext() {
        return cursor < nums.length;
    }

    @Override
    public Object next() {
        int num = nums[cursor];
        cursor ++;
        return num;
    }

    public static void main(String[] args) {
        Iterator test = new MyIterator(new int[]{1, 3, 5, 6, 7});
        while (test.hasNext()){
            System.out.println(test.next());
        }
    }
}
