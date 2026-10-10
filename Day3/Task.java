import java.util.*;
class Student{
    String name;
    int roll ;
    int age;
    int marks;

    Student(String name,int roll,int age,int marks){
        this.name=name;
        this.roll=roll;
        this.age=age;
        this.marks=marks;
    }
}

public class Task{
    public static void main(String[]args){
        Student s1=new Student("A",1,20,90);
        Student s2=new Student("B",2,21,80);
        Student s3=new Student("C",3,22,70);
        Student s4=new Student("D",4,23,60);
        Student s5=new Student("E",5,24,50);
        Student s6=new Student("F",6,25,40);
        Student s7=new Student("G",7,26,30);
        Student s8=new Student("H",8,27,20);
        Student s9=new Student("I",9,28,10);
        Student s10=new Student("J",10,29,0);

        ArrayList<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);
        list.add(s9);
        list.add(s10);

        for(Student s:list){
            System.out.println(s.name+" "+s.roll+" "+s.age+" "+s.marks);
        }
        list.sort(Comparator.comparingInt((Student s) -> s.age).reversed());
        System.out.println("After sorting by age:");
        for(Student s:list){
            System.out.println(s.name+" "+s.roll+" "+s.age+" "+s.marks);
        }

    }
}