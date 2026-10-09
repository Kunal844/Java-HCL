class Human{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String n){
        name=n;
    }
    public void setAge(int a){
        age=a;
    }

}

public class Encapsulation{
    public static void main(String []args){
        Human obj=new Human();
        obj.setName("Kunal");
        obj.setAge(22);

        System.out.println("Name : "+obj.getName()+", Age : "+obj.getAge());
    }
}