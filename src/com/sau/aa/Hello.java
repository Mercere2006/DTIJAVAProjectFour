package com.sau.aa;

public class Hello {
    //data member
    public int a;
    public int b = 10;

    //method member
    public void showA(){
        System.out.println(a);
    }
    public void showB(){
        System.out.println(b);
    }
    public void showSumAB(){
        System.out.println(a+b);
    }
    //constructor
    //public Hello(){ }
    public Hello(int a){
        this.a = a; //this ใช้แทน class
        System.out.println("Hello...");
    }
    public Hello(){
        System.out.println("Hi...");
    }
    public Hello(String x){
        System.out.println("Hey..." + x);
    }
}
