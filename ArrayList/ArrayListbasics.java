package ArrayList;
import java.util.ArrayList;

public class ArrayListbasics {
    public static void main(String[] args) {
     ArrayList<Integer> arr=new ArrayList<>();
    arr.add(90);
    arr.add(80);
    arr.add(70);
    arr.add(60);
    arr.add(50);
    arr.add(40);
    System.out.println(arr.get(2));
    arr.set(3,50);
    System.out.println(arr);
    int n=arr.size();//length in arraylist
    arr.remove(1);
    
}
}
