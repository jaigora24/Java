import java.util.Scanner;
public class percentage_calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No. of sujects: ");
		int n = sc.nextInt();
		float marks[]=new float[n];
		
		System.out.println("Now enter the marks of the subjects ");
		for(int i=0; i<n; i++){
			marks[i]=sc.nextFloat();
		}
		float average = 0;
		for(int i=0; i<n; i++){
			average = average + marks[i];
		}
		average = average/n;
		System.out.println("Your percentage is: "+average);
	}
}
