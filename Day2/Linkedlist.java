import java.util.LinkedList;

public class Linkedlist{
    public static void main(String []args){
        LinkedList<String> fruits=new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Leechi");
        fruits.add("Kiwi");
        fruits.add("Pineapple");

        System.out.println(fruits);
        //Add at the last and at first index
        fruits.addFirst("Orange");
        fruits.addLast("DragonFruit");

        System.out.println("After Using add First and last"+fruits);
//Functions are .add .addFirst .addLast .remove .removeFirst .removeLast
// .getFirst . getLast
        fruits.removeFirst();
        fruits.removeLast();
        System.out.println("Name after using remove "+fruits);
    }
}


