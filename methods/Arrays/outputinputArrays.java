package methods.Arrays;
import java.util.Scanner;

public class outputinputArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int[] arr = {5,6,7,8,9,10};
       // for(int i=0;i<=5;i++){
           // System.out.println(arr[i]+" ");
            //printin the length of array
            //System.out.println(arr.length);
        //}
        int[] karan = new int[7];
        //defaultvalues
        //for(int i=0; i<7; i++){
           // System.out.println(karan[i]+" ");
        //} 
        //input
        for(int i=0;i<7;i++){
            karan[i] = sc.nextInt();
        }
        //print
        for(int i=0;i<7;i++){
            System.out.println(karan[i]+" ");
        }
        
    }
    
}
