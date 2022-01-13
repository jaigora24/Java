import java.util.Scanner;
public class PrimeNumberInRange{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=a; i<=b; i++){
			if(i==0 || i==1){
				continue;
			}
			int flag=1;
			for(int k=2; k<i; k++){
				if(i%k==0){
					flag=0;
					break;
				}
			}
			if(flag==1){
				System.out.print(i+" ");
			}
		}
	}
}
