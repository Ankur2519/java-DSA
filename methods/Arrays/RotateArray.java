package methods.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6}; //d=2;
        int i = 0;
        int n = arr.length;
        int j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k=0;k<n;k++){
            System.out.println(arr[k]);
        }

        
    }
    

    
}
