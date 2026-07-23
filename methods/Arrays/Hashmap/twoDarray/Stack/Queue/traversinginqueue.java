package methods.Arrays.Hashmap.twoDarray.Stack.Queue;
import java.util.LinkedList;
import java.util.Queue;

public class traversinginqueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        int n = q.size();
        for(int i = 0;i<n;i++){
            System.out.println(q.peek()+" ");
            q.add(q.remove());
            
        }
        System.out.println(q);
        // ADD 35 at 3rd index;
        for(int i =0;i<3;i++){
            q.add(q.remove());
        }
        q.add(35);
        for(int i = 0;i<n-3;i++){
            q.add(q.remove());
            
        }
        System.out.println(q);
    }
    
}
