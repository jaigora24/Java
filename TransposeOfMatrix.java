package practise;
import java.util.Scanner;
public class TransposeOfMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int arr1[][] = new int[rows][cols];
		int arr2[][] = new int[cols][rows];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				arr2[j][i]=arr1[i][j];
			}
		}
		
		for(int i=0; i<cols; i++) {
			for(int j=0; j<rows; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		
		sc.close();
		
	}
}
