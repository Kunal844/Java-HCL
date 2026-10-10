import java.util.*;



public class QueueClass{
    public static void main(String[]args){
        Queue<Integer> q=new LinkedList<>();

        q.add(30);
        q.add(20);
        q.add(10);

        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.offer(1));//Adds element at the end of queue.
        System.out.println(q);
        
    }
}