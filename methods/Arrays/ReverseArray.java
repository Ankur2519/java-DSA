package methods.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the size of the array");
         int n = sc.nextInt();
         int [] arr = new int [n];
    
    
    System.out.println("enter the arr elements");
    for(int i=0; i<=n-1;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("array elements are:");
    for(int i = 0; i<n;i++){

        System.out.println(arr[i]);
    }
    System.out.println("Reverse arr elements are");
    int i=0;
    int j=n-1;
    while(i<j){
        
       int temp =arr[i];
       arr [i] = arr[j];
       arr[j] = temp;
       i++;
       j--;
    }
    System.out.println("Reverse array elements are:");
    for(int k=0;k<n;k++){
        System.out.println(arr[k]);
    }

        
    }
    
    
}
