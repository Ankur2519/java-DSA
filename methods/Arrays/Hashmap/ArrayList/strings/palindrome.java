package methods.Arrays.Hashmap.ArrayList.strings;

public class palindrome {
    public static void main(String[] args) {
        String s= "mom";
        int i =0;
        int j=s.length()-1;
        while(i<j){
        if(s.charAt(i)==s.charAt(j)){
            i++;
            j--;
        }
        System.out.println("palindrome");
    }
}


    
}
