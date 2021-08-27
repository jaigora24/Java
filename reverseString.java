package practise;
import java.util.*;
public class reverseString {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "JAI GORA";
		reverse(str);
		sc.close();		
	}
        
	public static void reverse(String a) {
		String b = "";
		for(int i=a.length()-1; i>=0; i--) {
			b=b+a.charAt(i);
		}
		System.out.println(b);
	}
}
