package practise;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("Reversed Array");
		for(int i=n-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}
		
		
		
		sc.close();
		
	}
}
