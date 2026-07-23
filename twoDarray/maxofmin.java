package twoDarray;

public class maxofmin {
    public static void main(String[] args) {
    int [] [] arr= {{2,3,4,5,6},{7,8,9,10,12},{4,5,6,7,8}};
    int min=Integer.MAX_VALUE;
    for(int i =0;i<3;i++){
        int max=0;
        for(int j=0;j<5;j++){
            if(arr[i][j]>max){  
                max=arr[i][j];
            }
             
            
        }
        min=Math.min(min,max);
       
        

    }
    System.out.println(min);
    
}
}
