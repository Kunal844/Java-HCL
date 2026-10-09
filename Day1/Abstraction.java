//Through Abstract Class
//Abstract class consist of Abstarct methods and concrete methods

abstract class Animal{
    abstract void sound();
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog is Barking");
    }
}
interface Payment{
    void pay();
    static void info(){//static method can be called w/o making obejct of that class
        System.out.println("Payment Done by user");
    }
}
class UPI implements Payment{
    public void pay(){
        System.out.println("Payment done using UPI");
    }
}

public class Abstraction{
    public static void main(String []args){
        Dog d= new Dog();
        d.sound();
        d.sleep();

        Payment p=new UPI();
        p.pay();
        Payment.info();//Called directly using the interface name 
    }
}