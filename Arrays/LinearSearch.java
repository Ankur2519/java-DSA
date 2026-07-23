package Arrays;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int [] arr = new int [7];
        int target=9;
        System.out.println("Enter the elements");
        for(int i =0; i< 7; i++){
            arr [i]=sc.nextInt();

        }
        for( int i =0; i<7;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Enter the elements to be search");
        for(int i =0 ;i<7;i++){
            if(arr[i]==target){
                System.out.println("Elements found");
            
        }
        else{
            System.out.println("Elements not found");
        }

    }
        
        
    }    
    
        
}
    

