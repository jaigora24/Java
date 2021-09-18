package practise;
import java.util.*;
public class FS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 3;
		fs(n);
		sc.close();
		
	}
	
	public static void fs(int n) {
		if(n==1) {
			System.out.println("0");
		}
		else {
			int a=0;
			int b=1;
			int c=0;
			System.out.println(a);
			System.out.println(b);
			for(int i=2; i<n; i++) {
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
		}
	}
	
}
