import java.util.Scanner;
public class copy_2Darray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter dimensions: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();                               
        int arr1[][] = new int[rows][cols];    // declare array 1
        
        System.out.println("enter array : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){               //input for array 1
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Original array");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){                //print array 1
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        int arr2[][] = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){             //copy array 1 and 2
                arr2[i][j]=arr1[i][j];
            }
        }
        System.out.println();
        System.out.println("Copied Array");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){               //print the copied array (array 2)
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
