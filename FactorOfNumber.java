import java.util.Scanner;
public class FactorOfNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			if(n%i==0){
				System.out.print(i+" ");
			}
		}
	}
}
