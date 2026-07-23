package Arrays;
import java.util.Scanner;

public class inputoutputarrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // array size input;
        int [] arr = new int[n];//array created;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(); //arr elements input taken here
        }
        for(int  i =0; i<n; i++){
            System.out.println(arr[i]+ " ");
        }



    }
    
}
