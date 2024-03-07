package com.jirengu.java.sort;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraySortDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("pear");
        list.add("grape");
        list.add("pineapple");
        list.add("watermelon");
        list.add("kiwi");
        list.add("mango");
        list.add("peach");
        list.add("plum");
        Comparator<String> comp = new StringComparator();
        list.sort(comp);
        list.forEach(System.out::println);

        Student[] students = new Student[5];
        students[0] = new Student(3, "张三", 100);
        students[1] = new Student(1, "李四", 99);
        students[2] = new Student(3, "王五", 98);
        students[3] = new Student(4, "赵六", 97);
        students[4] = new Student(5, "孙七", 96);
        for (Student item : students) {
            System.out.println("pre" + item.id);
        }
        Arrays.sort(students, Comparator.comparingInt(Student::getScore));
        //Arrays.sort(students, (o1, o2) -> o1.getScore() - o2.getScore());
        for (Student item : students) {
            System.out.println("after" + item.id);
        }
    }

    public static class StringComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }
}
