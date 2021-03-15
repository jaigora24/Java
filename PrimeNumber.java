import java.util.Scanner;
public class primenumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean isPrime = true;
		
		for (int i=2; i<n; i++){
			if(n%i==0){
				isPrime = false;;
				break;
			}
		}
		if (n<2){
			isPrime = false;
		}
		if (isPrime == true){
			System.out.print("It is prime number");
		}
		else if (isPrime == false){
			System.out.print("It is not prime");
		}
	}
} 
