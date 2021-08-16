package com.company;

public class Homework {

    public static void main(String[] args) {
        Stack example=new Stack();
        for(int i=0;i<10;i++){
            example.push(i);
        }
        System.out.println(example.peek());
        example.push(6);
        System.out.println(example.peek());
    }
}
