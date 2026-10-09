//using String Buffer 

public class Stringbf{
    public static void main(String[]args){
        StringBuffer sb= new StringBuffer("Kunal");
        sb.append(" Honey");

        System.out.println(sb);
        sb.deleteCharAt(6);
        System.out.println(sb);
    }
}