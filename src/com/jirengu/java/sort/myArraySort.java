package com.jirengu.java.sort;

import java.util.Arrays;

public class myArraySort {
    //排序主要在 Array ArrayList Collection 中使用

    //对基本类型结构的数组都实现了排序
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        for(int num : array){
            //System.out.println("past" + num);
        }
        Arrays.sort(array);
        for (int num : array){
            //System.out.println("cur" + num);
        }
        Student[] students = new Student[5];
        students[0] = new Student(3,"张三",100);
        students[1] = new Student(1,"李四",99);
        students[2] = new Student(3,"王五",98);
        students[3] = new Student(4,"赵六",97);
        students[4] = new Student(5,"孙七",96);
        for(Student item : students){
            System.out.println("pre"+item.id);
        }
        Arrays.sort(students);
        for(Student item : students){
            System.out.println("cur"+item.id);
        }
    }
}
