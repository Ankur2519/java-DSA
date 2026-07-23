package methods.Arrays;
import java.util.Arrays;

public class sortarraysbuiltIN {
    public static void main(String[] args) {
        int [] arr = {8,7,6,5,4,3,2,1};
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
