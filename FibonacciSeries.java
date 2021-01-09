import java.util.Scanner;
public class p2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fc = 0;
		int a = 0;
		int b = 1;
		
		System.out.println(a);
		System.out.println(b);
		
		for (int i=1; i<=n-2; i++){
			fc = a + b;
			System.out.println(fc);
			a=b;
			b=fc;
		}
	}
}

			
