/**
 * @Author:chenyuxiang
 * @Date:2024/3/11
 * @LastEditTime:
 * @LastEditors: chenyuxiang
 * @Description:
 */
package com.jirengu.java.hashMapTest;

public class MyHashMap<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private int size;
    private int capacity;
    //装填因子
    private float loadFactor;
    private Node<K, V>[] table;
    public MyHashMap() {
        this.size = 0;
        this.capacity = DEFAULT_CAPACITY;
        this.loadFactor = DEFAULT_LOAD_FACTOR;
    }


    public MyHashMap(int size, int capacity, float loadFactor) {
        this.size = size;
        this.capacity = capacity;
        this.loadFactor = loadFactor;
    }


    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;

        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
    private int hash(K key) {
        return key == null ? 0 : key.hashCode() & (capacity - 1);
    }

    //put delete get 方法
    /**
     * @param key
     * @param value
     */
    public Node<K, V> put(K key, V value) {
        int index = hash(key);
        if(table[index] == null) {
            table[index] = new Node<>(key, value, null);
            size++;
        } else {
            Node<K, V> node = table[index];
            while (node != null) {
                if (node.getKey().equals(key)) {
                    node.setValue(value);
                    return node;
                }
                node = node.next;
            }
        }
    }

    public Node<K, V> delete(K key) {
        throw new RuntimeException();
    }

    public Node<K, V> get(K key) {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put("chen", 1);
        myHashMap.put("yu", 2);
        myHashMap.put("xiang", 3);
        System.out.println(myHashMap.get("chen"));
        System.out.println(myHashMap.get("yu"));
        System.out.println(myHashMap.get("xiang"));
    }
}
