import java.util.Scanner;
public class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n>1){
			int a = 0;
			int b = 1;
			int c = 1;
			System.out.println(a);
			System.out.println(b);
			
			for(int i=1; i<=n-2; i++){
				c = a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
		}
		else if(n==1){
			System.out.println("0");
		}
		else{
			System.out.println("Wrong input");
		}	
	}
}
