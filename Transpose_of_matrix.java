import java.util.Scanner;
public class Transpose_of_matrix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int a[][] = new int[rows][cols];
		int b[][] = new int[rows][cols];
		
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				b[i][j]=a[j][i];
			}
		}
		
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
} 
