import java.util.Scanner;
public class SumOfEvenOddInteger{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp=n;
		int odd = 0;
		int even = 0;
		
		while(temp>0){
			int last = temp%10;
			if(last%2==0){
				even=even+last;
			}
			else{
				odd=odd+last;
			}
			temp=temp/10;
		}
		System.out.println("Sum of even "+even+" Sum of odd "+odd);
	}
}
