//Jagged Array Implementation
public class Jagged
{
    public static void main(String[]args)
    {
        int arr[][]=new int [3][];
        arr[0]=new int[3];
        arr[1]=new int[4];
        arr[2]=new int[5];

        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=(int)(Math.random()*10);
            }
        }

        for (int x[]:arr){
            for (int m:x){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}