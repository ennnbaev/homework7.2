package com.company;

public class Homework {

    public static void main(String[] args) {
        Stack example=new Stack();
        for(int i=0;i<6;i++){
            example.push(i);
        }
        example.peek();
        example.push(6);
        example.peek();
    }
}
