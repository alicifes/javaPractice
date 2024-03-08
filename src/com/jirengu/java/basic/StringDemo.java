package com.jirengu.java.basic;

public class StringDemo {
    public static void main(String[] args) {
        //创建字符串
        String s = "string";
        //new 使用构造器
        char[] s2 = {'H','E'};
        String s3 = new String(s2);

        //StringBuffer 线程安全
        //StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append('h');
        String s4 = sb.toString();

        //获取字符串长度
        int length1 = sb.length();
        //获取特定位置 -1 也是越界
        char c = sb.charAt(1);
        //字符串连接  +  & concat a.concat(b)
        //格式化字符串
        //String formate1 = String.format('')
        // %d 数字 %f 小数 %.3f 三位小数 %s 字符串
        //souf
        int intNum = Integer.parseInt("100"); //强制转换 ,使用包装类
        String numberStr2 = String.valueOf(123); //强制转换
        //iSEmpty indexOf(第一个) lastIndexOf equals toLowerCase toUpperCase
        //substring [start,end)  前闭后开
    }
}
