import java.util.Scanner;
public class difference_of_matrices{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter dimensions");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int a[][] = new int[rows][cols];
        
        System.out.println("enter elements of matrix A");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("enter elemts of matrix B");
        int b[][] = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                b[i][j]=sc.nextInt();
            }
        }
        
        int c[][] = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                c[i][j] = a[i][j]-b[i][j];
            }
        }
        
        System.out.println("difference of the above matrices is");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }
        
    }
}
