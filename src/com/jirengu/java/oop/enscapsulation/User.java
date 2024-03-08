package com.jirengu.java.oop.enscapsulation;

//java bean
public class User {
    private String userName;

    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void login(String userName, String password) {
        //对于boolean方法的话，我们一般都是使用is开头
        if (userName.equals(this.userName) && password.equals(this.password)) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }
}
