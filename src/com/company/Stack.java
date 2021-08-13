package com.company;

public class Stack {

    private final int[] mass=new int[5];
    private int top=-1;

    public void push(int value){
        if(top>3){
            for(int i=0;i<mass.length-1;i++){
                mass[i]=mass[i+1];
            }
            mass[mass.length-1]=value;
        }
        else{
            mass[++top]=value;
        }
    }
    public void pop(){
        System.out.println(mass[top--]);
    }
    public void peek(){
        System.out.println(mass[top]);
    }

}
