package practise;
import java.util.*;
public class Swap2NumberWithoutThird {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		swap(n1,n2);
		sc.close();
		
	}
    //swapping without third variable
	public static void swap(int a, int b) {
		System.out.println("BEFORE" + " " + a + " " + b);
		a = a+b;
		b=a-b;
		a=a-b;
		System.out.println("AFTER" + " " + a + " " + b);
	}
}
