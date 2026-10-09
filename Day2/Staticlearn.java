class Device{
    String os;
    int price;
    //static variable
    static String name="SmartPhone";

    Device(String o, int p){
        this.os=o;
        this.price=p;
    }
    //static methods
    public static void show(Device obj){
        System.out.println(obj.os+" Price= "+obj.price+" "+name);
    }
}

public class Staticlearn{
    public static void main(String []args){
        Device obj1=new Device("Android",1000);
        Device obj2=new Device("Ios",2000);
        Device.show(obj1);
        Device.show(obj2);
        
    }
}