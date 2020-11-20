import java.util.Scanner;
public class SwapTwoNumbers{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");   
		int firstNumber = sc.nextInt();              //Taking First Number Input
		System.out.println("Enter the second number: ");
		int secondNumber = sc.nextInt();             //Taking Second Number Input
		System.out.println("--BEFORE SWAPPING--");
		System.out.println(firstNumber +" "+ secondNumber);
		int temp = firstNumber;         // Swapping Criteria i.e How to swap with using third variable
		firstNumber = secondNumber;
		secondNumber = temp;
		System.out.println("--AFTER SWAPPING--");
		System.out.println(firstNumber +" "+ secondNumber);
	}
}
