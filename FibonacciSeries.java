import java.util.Scanner;
public class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		if(n>=2){
			System.out.println(a);
			System.out.println(b);
			
			for(int i=1; i<=n-2; i++){
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
		}
		if(n==1){
			System.out.println(a);
		}
	}
}
