package strings;

public class BuiltinMethods {
    public static void main(String[] args) {
        String s = "Arpit";
        String t = "Harshita";
        System.out.println(s.indexOf('A'));
        System.out.println(s.lastIndexOf('A'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(t.contains("Harsh"));
        System.out.println(s.startsWith("Arpi"));
        System.out.println(t.compareTo(s));
        System.out.println(s.concat(t));
    }
    
}
