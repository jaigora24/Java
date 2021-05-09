import java.util.Scanner;
public class AreaOfCircle{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the radius for the circle: ");
		float radius = sc.nextFloat();
		System.out.println(3.141592653589793238 * radius * radius);
	}
} 
