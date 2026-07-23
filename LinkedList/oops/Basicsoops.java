package LinkedList.oops;

public class Basicsoops {
   static class car{ //blueprint;//
        String color;
        int speed;
        String Brand;
        String name;
    }
    public static void main(String[] args) {
        car s1 = new car(); // 1st bject creation //;
        s1.color="red";
        s1.Brand="maruti";
        s1.name="nexon";
        System.out.println(s1.color);
         car s2 = new car(); // 2nd object creation;//
         s2.color="blue";
         System.out.println(s2.color);
    }
    
}
