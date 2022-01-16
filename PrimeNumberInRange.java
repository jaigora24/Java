import java.util.Scanner;
public class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=a; i<=b; i++){
			if(i==0 || i==1){
				continue;
			}
			boolean isPrime=true;
			for(int j=2; j<i; j++){
				if(i%j==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime){
				System.out.print(i+" ");
			}
		}
	}
}
