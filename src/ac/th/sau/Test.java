package ac.th.sau;

public class Test {
    public static void main(String[] args) {
        MyClass01 ob1 = new MyClass01();

        ob1.setDataA(100);
        ob1.setDataB("Hello...");

        System.out.println(ob1.getDataB()   );

        //-----------------------------------------------------
        MyClass04 ob2 = new MyClass04();
        MyClass03 ob3 = new MyClass03();
        //ถ้ามีการ Override จะใช้ค่าใหม่ ไม่ใช้ค่าเดิม หรือก็คือใช้แบบเดิมแค่เปลี่ยนไส้ใน
    }

}

