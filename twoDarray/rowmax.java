package twoDarray;

public class rowmax {
    public static void main(String[] args) {
        int[][]arr= {{1,2,3},{3,4,5},{7,8,9}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
            int maxsum=0;
            
            for( int i=0;i<3;i++){
                int sum=0;
                for(int j=0;j<3;j++){
                    sum+=arr[i][j];
                        maxsum = Math.max(sum,maxsum);
                        
                        

                    }

                     }
                     System.out.println(maxsum);
  
            }
        }
    
    

