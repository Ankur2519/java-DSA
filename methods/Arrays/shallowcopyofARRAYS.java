package methods.Arrays;

public class shallowcopyofARRAYS {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int [] x = arr;
        x[0] = 100;
        System.out.println(arr[0]);
    }
    
}
