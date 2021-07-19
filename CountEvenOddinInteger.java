package practise;
import java.util.*;
public class CountEvenOddinInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		String temp = Integer.toString(n);
		int arr[] = new int[temp.length()];
		int countEven = 0;
		int countOdd = 0;
		for(int i=0; i<temp.length(); i++) {
			arr[i]=temp.charAt(i)-'0';
		}
		for(int i=0; i<temp.length(); i++) {
			if(arr[i]%2==0) {
				countEven++;
			}
			else if(arr[i]%2==1){
				countOdd++;
			}
		}
		System.out.println("Even --> " + countEven);

		System.out.println("Odd --> " + countOdd);

		
		sc.close();
		
	}
}
