package com.jirengu.java.arrayListDemo;

public class myArrayList {
    int size;
    int[] array;
    int capacity;
    private static final int DEFAULT_CAPACITY = 10;

    public myArrayList() {
        size = 0;
        this.capacity = DEFAULT_CAPACITY;
        array = new int[DEFAULT_CAPACITY];
    }

    public myArrayList(int capacity){
        if(capacity < 0){
            throw new IllegalArgumentException( "capacity must be positive");
        } else if (capacity < DEFAULT_CAPACITY) {
           this.capacity = DEFAULT_CAPACITY;
        } else {
            this.capacity = capacity;
        }
    }

    public void add(int value) {
        return;
    }

    public boolean remove(int element) {
        return true;
    }

    public boolean removeIndex(int index) {
       return true;
    }

    public boolean set(int index,int element){
        return true;
    }

    public int get(int index){
        return 0;
    }

    public int size() {
        return this.size;
    }
}
