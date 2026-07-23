package Arrays;

public class oddandevenques {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70,80};
        print(arr);
    }
    public static void print(int [] arr){
        for(int i=0; i<arr.length;i++){
            if(i%2==0){
                arr[i]=10+arr[i];
                System.out.println(arr[i]+" ");
                
            }
            else{
                System.out.println(2*arr[i]+" ");
            
            }
        }
    }
    
}
