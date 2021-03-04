import java.util.Scanner;
public class FahrenheitToCelsius{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature (in fahrenheit): ");
		float fahrenheit = sc.nextFloat();
        double celsius = ( (fahrenheit)-32)* 0.5555555555555556;
        System.out.println(celsius);
	}
}
