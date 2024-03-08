/**
 * @Author:chenyuxiang
 * @Date:2023/9/11
 * @LastEditTime:
 * @LastEditors: chenyuxiang
 * @Description: info  java集合 framework
 * List => ArrayList 动态数组
 * Set => hashSet 集合无重复元素
 * Map => hashMap 键值对:字典
*/
package com.jirengu.java.collection.info;

import java.util.ArrayList;

public class Info {
    //在 java 中，设计的时候是把 collect 接口和 map 接口分开的
    //collect 中有 set (hashSet) 和 list(ArrayList) 以及 map(hashMap)

    //在今后的开发过程中，请不要使用 stack 和 vector 推荐使用 queue
    //在操作队列的过程中请使用新的方法 pick 和 offer

    //collection是属于单值接口，而对于 Map
    //treeMap 是有序的，hashMap 是无序的
    //自顶向下
    //abstract class AbstractCollection<E> implements Collection<E>


    //abstrcat class AbstractList<E> extends AbstractCollection<E> implements List<E>
    //抽象的List继承了抽象的Collection，实现了List接口
    //提供了一个随机访问的方法 随机访问类似于数组，可以由index进行直接访问
    //使用index访问，叫做randomAccess
    //而顺序访问是通过迭代器进行访问的，类似于链表
    //如果想让abstract不可修改 只需要实现AbstractList中的size方法以及get方法
    //如果修改错误，会抛出异常

    //查找 indexOf =》 内部的实现是找lastIndexOf
    //内部都要实现一个迭代器 listIterator
    //Bulk Operations
    //AbstractList的方法都要支持线程安全，不支持并发访问
    //lastRet cursor  在remove中 lastRet = -1
    //内部有listItr
    //Itr主要就是迭代器
    //对于RandomAccess的实现，使用for loop的效率高
    //使用RandomAccess表示用户能接受随机访问
    //在AbstractList中，有向SubList的转化，这里使用偏移量来进行转化
    //底层equals的比较 还是使用迭代器，然后调用当前的equals的方法，进行比较，会带入两个的next

    //hashCode
    //hash算法需要解决冲突来进行比较
    //31 magicNumber DJB 首先为了防止冲突，不使用32，且为了方便实现位运算
    //java为了提高运算速度，这里选用了质数31
}

