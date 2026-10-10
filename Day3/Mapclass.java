import java.util.*;

public class Mapclass{
    public static  void main(String[]args){
        Map<Integer,String> m=new HashMap<>();
        m.put(1,"A");
        m.put(2,"B");
        m.put(3,"C");
        m.put(4,"D");
        System.out.println(m);
        System.out.println(m.get(2));
        System.out.println(m.remove(3));
        System.out.println(m);
    }
}