package com.jirengu.java.arrayListDemo;


import static java.lang.System.*;

public class myArrayList {
    int size;
    int[] elementData;
    int capacity;
    private static final int DEFAULT_CAPACITY = 10;

    public myArrayList() {
        this.size = 0;
        this.capacity = DEFAULT_CAPACITY;
        elementData = new int[DEFAULT_CAPACITY];
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

    public int get(int index){
        isRange(index);
        return this.elementData[index];
    }
    public int set(int index,int element){
        isRange(index);
        int oldValue = this.elementData[index];
        this.elementData[index] = element;
        return oldValue;
    }

    /**
     * @deprecated 涉及动态扩容
     */
    public void add(int index, int element) {
        if(index < 0 || index > this.size){
            throw new RuntimeException("Index Error");
        }
        if(this.size == this.capacity){
            int[] temp = new int[this.capacity * 2];
            for(int i = 0;i < this.size;i++){
                temp[i] = this.elementData[i];
            }
            this.capacity *= 2;
            this.elementData = temp;
        }
        for(int i = this.size - 1;i >= index;i--){
            this.elementData[i + 1] = this.elementData[i];
        }
        this.elementData[index] = element;
        this.size++;
    }

    public void add(int element){
        this.add(this.size,element);
    }

    public int removeIndex(int index) {
       isRange(index);
       elementData[index] = 0;
       for(int i = index;i < this.size - 1;i++){
            this.elementData[i] = this.elementData[i + 1];
        }
       return 0;
    }

    public int remove(int element){
        for(int i = 0;i < this.size;i++){
            if(this.elementData[i] == element){
                return this.removeIndex(i);
            }
        }
        return -1;
    }


    public void isRange(int index){
        if(index < 0 || index > this.size){
            throw new RuntimeException("size");
        }
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean contains(int element){
        for(int i = 0;i < this.size;i++){
            if(this.elementData[i] == element){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        myArrayList myArrList = new myArrayList();
        for(int i =0 ; i < 30;i++ ){
            myArrList.add(i);
            out.println(myArrList.get(i));
        }
    }
}
