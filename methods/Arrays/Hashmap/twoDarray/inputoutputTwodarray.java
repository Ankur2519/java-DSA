package methods.Arrays.Hashmap.twoDarray;
import java.util.Scanner;


public class inputoutputTwodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//rows input
        int m = sc.nextInt();//column input
        int [] [] arr = new int[n] [m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt(); //input 2Darr elements...
            }
            System.out.println(); //for gap between each lines
        }
            for(int i =0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(arr[i][j]+ " ");//printing 2d array elemnts

                }
                System.out.println();
            }

            
        }
    }


    

