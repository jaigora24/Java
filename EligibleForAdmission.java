import java.util.Scanner;
public class Admission{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks in Physics: ");  //taking yout physics marks
		float physics = sc.nextFloat();
		System.out.println("Enter the marks in Chemistry: ");    //taking yout chemistry marks
		float chemistry = sc.nextFloat();
		System.out.println("Enter the marks in Mathematics: ");    //taking yout maths marks
		float maths = sc.nextFloat();
		float result = (physics + chemistry + maths)/3;    //calculate average marks
		if (result >=60 ){                   // check if you are eligibl or not
			System.out.println("Congrats !! You are eligible to take admission in SMVDU,Katra :)");
		} else {
			System.out.println("Sorry !! You are not eligible to take admissionin SMVDU,Katra");
			System.out.println("Best of luck for future :)");
		}
	}
} 
