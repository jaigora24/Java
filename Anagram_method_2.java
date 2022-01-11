import java.util.Scanner;
public class Anagram_method_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        char chars1[] = s1.toCharArray();
        java.util.Arrays.sort(chars1);
        String sorted1 = new String(chars1);
        System.out.println(sorted1);
        
        char chars2[] = s1.toCharArray();
        java.util.Arrays.sort(chars2);
        String sorted2 = new String(chars2);
        System.out.println(sorted2);
        
        if(chars1 == chars2){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
