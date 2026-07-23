package BASICSDSA;
import java.util.Scanner;


public class patternprinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        System.out.println("enter no of columns");
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i =0; i<=row;i++){
            for(int j = 0;j<=col;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
    }

    
}
