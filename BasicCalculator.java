import java.util.Scanner;
public class BasicCalculator{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		float firstNumber = sc.nextFloat();
		System.out.println("Enter the second number: ");
		float secondNumber = sc.nextFloat();
		System.out.println("---READ THIS---");
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for multiplication");
		System.out.println("Press 4 for divide");
		int result = sc.nextInt();
		if (result == 1){
			System.out.println(firstNumber + secondNumber);
		}
		else if (result==2) {
			System.out.println(firstNumber - secondNumber);
		}
		else if (result==3) {
			System.out.println(firstNumber*secondNumber);
		}
		else if (result==4) {
			System.out.println(firstNumber/secondNumber);
		}
		else {
			System.out.println("Warning !! Please enter the appropriate number");
		}
	}
}
