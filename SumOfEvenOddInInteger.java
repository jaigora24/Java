import java.util.Scanner;
public class SumOfEvenOddInInteger{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int s1 = 0;
		int s2 = 0;
		int temp = n;
		while(temp>0){
			if(temp%2==0){
				s1=s1+temp%10;
			}
			else{
				s2=s2+temp%10;
			}
			temp=temp/10;
		}
		System.out.println(s1);
		System.out.println(s2);
	}
}
