package com.sau.aa;

public class Hi {
    //data member
    public int aa = 10;

    //method member
    public void showA(){
        System.out.println(aa);
    }

    public void show(){
        System.out.println("Wow...");
    }

    //constructor
    public Hi(){
        System.out.println("Woo...");
    }
    public Hi(int aa){
        this.aa = aa;
    }
}
