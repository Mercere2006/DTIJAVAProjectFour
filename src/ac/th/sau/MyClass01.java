package ac.th.sau;

public class MyClass01 {
    //Encapsulation ซ่อนข้อมูล (data member)
    public int dataA;
    public String dataB;

    //ให้ใช้งาน data ผ่านเมธอด Getter/Setter
    //Set = กำหนด , Get = เอามาใช้

    public int getDataA(){
        return dataA;
    }
    public String getDataB(){
        return dataB;
    }
    public void setDataA(int dataA){
        this.dataA = dataA;
    }
    public void setDataB(String dataB){
        this.dataB = dataB;
    }
}
