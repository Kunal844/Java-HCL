//Program to implement the Array List 

import java.util.ArrayList;

public class Main{
    public static void main(String[]args){
        ArrayList<String> names=new ArrayList<>();

        names.add("Kunal");
        names.add("rahul");
        names.add("honey");

        System.out.println(names);
//To delete an element using the index
        names.remove(2);
        
        System.out.println("names after deleteion"+names);
        //to delete an element using the exact name
        names.remove("rahul");
        System.out.println("Names after second removal"+names);

        names.add("rahul");
        names.add("priya");
        //Updating a value
        names.set(2,"Khyati");
        

        System.out.println("Names after setting a value"+names);
        System.out.println(names.size());
    }
}