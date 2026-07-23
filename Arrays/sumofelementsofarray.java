package Arrays;
import java.util.Scanner;

public class sumofelementsofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        //input
        System.out.println("Enter the array elements");
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        //output
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
        //printing sum of the arrayelements;
        for(int i =0; i<n; i++){
            sum+=arr[i];
            

            
        }
        System.out.println(sum);
        
        
        

        

    }
    
}
