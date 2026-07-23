package BASICSDSA;
import java.util.Scanner;
public class Starprinting{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        System.out.println("enter no of columns");
        int n= sc.nextInt();
        for(int i =1; i<=n;i++){
            for(int j = 1;j<=i;j++){
               // System.out.print("*"+ " ");//
               // System.out.print(j+ " ");//
              // System.out.print((char)(j+64)+" ");//
             // if(i%2==0){//
               // System.out.print((char)(j+64));//
             // }
             // else{//
               // System.out.print(j);//
              if(i+j<=5){
                System.out.print("*");
              }
              System.out.println();
            }

        }
    }
    
}
