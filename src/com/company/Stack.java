package com.company;
public class Stack {

    private final int[] mass=new int[7];
    private int top=-1;

    public void push(int value){
        int maxSize=mass.length-2;
        if(top>maxSize){
            for(int i=0;i<mass.length-1;i++){
                mass[i]=mass[i+1];
            }
            mass[mass.length-1]=value;
        }
        else{


            mass[++top]=value;
        }
    }
    public int pop(){
       return mass[top--];
    }
    public int peek(){
        return mass[top];
    }

}
