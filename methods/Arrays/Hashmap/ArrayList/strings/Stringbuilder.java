package methods.Arrays.Hashmap.ArrayList.strings;
import java.util.ArrayList;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Raghav");
        System.out.println(sb);
        sb.append("garag");
        System.out.println(sb);
        sb.setCharAt(1,'0');
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.insert(1,'e');
        System.out.println(sb);
    }
    
}
