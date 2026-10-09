class A{


static{
    System.out.println("Hi , i'm static block , i will be printed firstly when a class is loaded");

}

    public  A(){
        System.out.println("Inside Constructor");
    }

}

public class Staticblock{
    public static void main(String[]args){
        A obj=new A();
        
    }
}