import java.util.Scanner;
public class sumOfn{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;                           //assign sum = 0
		System.out.println("Enter the number: ");
	    int n = sc.nextInt();                  //n sirf essliye liya kyuki hume define krna tha loop kab tak chlega
		for (int i= 1; i<=n ; i++){            //i =1, i tab tak chlega jab tak uski value n ya n se choti na ho jaye  
			sum +=i;                           //sum = sum + i
		}
		System.out.println("Sum: " + sum);
	}
}
