import java.util.Scanner;
public class EligibleForVote{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age of the candidate: ");
		int age = sc.nextInt();
		if (age >= 18){
			System.out.println("This candidate is eligible for voting :)");
		} else {
			System.out.println("Sorry this candidate is not eligible for voting");
		}
	}
}
