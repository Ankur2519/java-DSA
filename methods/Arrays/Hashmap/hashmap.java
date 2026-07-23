package methods.Arrays.Hashmap;
import java.util.HashMap;


public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map = new HashMap<>();
        //for inserting values in hashmap;
        map.put(1,20);
        map.put(2,30);
        map.put(3,40);
        map.put(4,60);
        map.put(7,8);
        System.out.println(map);
       System.out.println(map.get(1));//getting values in Hashmap
       System.out.println(map.get(2)); //getting values in Hashmap
       System.out.println(map.get(1)); 
       //traversa in Hashmap;
       for(int ele:map.keySet()){
        if(map.containsKey(1)){
        System.out.println("True");
        map.put(1,map.get(1)+1);
        System.out.println(map.get(1));

        }
       }
       
    }
    
}
