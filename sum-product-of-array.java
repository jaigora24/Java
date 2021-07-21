import java.util.Scanner;
public class sum-product-of-array{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int array[]= new int[n];
		for(int i=0; i<n; i++){
			array[i]=sc.nextInt();
		}
		int sum = 0;
		int product = 1;
		for(int i=0; i<n; i++){
			sum = sum + array[i];
			product = product * array[i];
		}
		System.out.println("SUM: "+sum);
		System.out.println("PRODUCT: "+product);
	}
} 
