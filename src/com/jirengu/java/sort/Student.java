package com.jirengu.java.sort;

public class Student implements Comparable<Student>{
    int id;
    String name;
    int score;
    public Student(){
    }

    public Student(int id,String name,int score){
        this.id=id;
        this.name=name;
        this.score=score;
    }

    @Override
    public int compareTo(Student o) {
        if(this.id>o.id){
            return this.id - o.id;
        } else if(this.id<o.id){
            return this.id - o.id;
        } else {
            return 0;
        }
    }

    public int getScore() {
        return score;
    }
}
