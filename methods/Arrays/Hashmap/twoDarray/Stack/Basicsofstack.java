package methods.Arrays.Hashmap.twoDarray.Stack;
import java.util.Stack;

public class Basicsofstack {
    public static void main(String[] args) {
        Stack <String> s1 = new Stack <>();
        s1.push("Ankur");
        s1.push("Raushani");
        s1.push("saruabh");
        s1.push("deepak");
        s1.push("mani");
        s1.push("karunesh");
         System.out.println(s1);
          System.out.println(s1.size());
           System.out.println(s1.pop());
          // while(s1.size()>0){ // traversing the stack from top one by one...
            //System.out.println(s1.pop()); //printing the stack element one by one from top...

          //}//
            Stack <String> s2 = new Stack <>(); // second stack
            while(s1.size()>0){ 
                String top = s1.pop(); // stack 1 ka elemnt top mein dalna
                System.out.println(top); // stack 1 ke element ko top mein daal ke print karna
                s2.push(top); // stack 1 ke element ko stack 2 mein dalna
            }
                System.out.println(s2); // stack 2 ke element ko prin karna..
                 





       
        
    
    
}
}