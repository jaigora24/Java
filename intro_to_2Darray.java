import java.util.Scanner;
public class intro_to_2Darray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the dimensions: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int array[][] = new int[rows][cols];
        System.out.println("Enter the array: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                array[i][j]= sc.nextInt();
            }
        }
        System.out.println("Resulted array: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
