package com.sau.aa;

public class Hey {
    public int a = 10; //instance variable
    public static int b = 20; //class variable

    public void showHi(){ //instance method
        System.out.println("Hi...");
    }

    public static void showHey(){ //class method
        System.out.println("Hey...");
    }

    public void metA(){ //ถ้าไม่มี static ใส่ไรก็ได้เลย
        a = 11;
        b = 22;
        showHi();
        showHey();
    }

    public static void metB(){ //ถ้าเป็น static ใช้ได้กับที่เป็น static ด้วยกันเท่านั้น
        //a = 11; error
        b = 22;
        //showHi(); error
        showHey();

        //ไม่มี constructor = ob เหมือนกันทุกประการ
        //static ใช้ค่าร่วมกันไม่ว่าจะเปลี่ยนตรงไหน
        //constructor มีปีกกา มีวงเล็บ ชื่อเดียวกับชื่อคลาส

    }
}
