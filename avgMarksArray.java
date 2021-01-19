import java.util.Scanner;
public class avgMarksArray{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of students: ");
		int n = sc.nextInt();
		
		int marks[] = new int[n];
		for (int i=0; i<marks.length;  i++){
			marks[i] = sc.nextInt();
		}
		
		int average = 0;                       //average
		for (int i=0; i<n; i++){
			average = average + marks[i];
		}
		average = average / n;
		System.out.println("Average marks: "+average);
	}
}
