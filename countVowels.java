package practise;
import java.util.*;
public class countVowels {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String str = sc.nextLine();
		count(str);
		sc.close();
		
	}
	public static void count(String a) {
		char c = 'a';
		int count = 0;
		for(int i=0; i<a.length(); i++) {
			c = a.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i'|| c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'|| c == 'O' || c == 'U') {
				count++;
			}
		}
		System.out.println(count);
	}
}
