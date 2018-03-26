package com.javapractice;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Sajj on 12/06/2017.
 */

public class Head {

    private String name;
    private int head;
    private int body;
    private int size;
    private int weight;

    public Head(String name, int head, int body, int size, int weight) {
        this.name = name;
        this.head = head;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void consume(){
        System.out.println("Head.consume() called");

    }

    public void move(int pace){
        System.out.println("Head.move(). Head is moving at " + pace);
    }

    public String getName() {
        return name;
    }

    public int getHead() {
        return head;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

}
