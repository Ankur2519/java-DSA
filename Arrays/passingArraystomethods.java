package Arrays;

public class passingArraystomethods {
    public static void main(String[] args) {
        int x[] ={1,2,3,4,5,6,7,8,9,10,11};
        change(x);//but it is not happenging in variable case
        System.out.println(x[2]);
        
    }
    public static void change(int [] x){ 
        x[2]=5;
    }
    
}
