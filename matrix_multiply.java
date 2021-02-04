import java.util.Scanner;
public class matrix_multiply{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("enter dimensions for A");
        int rowsA = sc.nextInt();
        int colsA = sc.nextInt();                                              //enter the dimensions of matrix A
        int a[][] = new int[rowsA][colsA];
        
        System.out.println("enter elements of A");
        for(int i=0; i<rowsA; i++){
            for(int j=0; j<colsA; j++){                                        //enter elements of matrix A
                a[i][j] = sc.nextInt();                         
            }
        }
        
        System.out.println("enter dimensions for B");
        int rowsB = sc.nextInt();
        int colsB = sc.nextInt();                                             //enter the dimensions of matrix B
        int b[][] = new int[rowsB][colsB];
        int c[][] = new int[rowsA][colsB];
        
        if(colsA != rowsB){
            System.out.println("These matrix can't be multiplied with each other.");            //if rows of matrix B != columns of matrix A then multiplication not possible
        } 
        else {
            System.out.println("enter the elements of B");
            for(int i=0; i<rowsB; i++){                                      //else enter the elements of matrix B
                for(int j=0; j<colsB; j++){
                    b[i][j] = sc.nextInt();
                }
            }
            
            for(int i=0; i<rowsA; i++){
                for(int j=0; j<colsB; j++){
                    for(int k=0; k<rowsB; k++){                            //logic for multiplication of 2 matrix
                        sum = sum + a[i][k]*b[k][j];
                    }
                    c[i][j] = sum;
                    sum = 0;
                }
            }
            System.out.println("matrix A * matrix B");
            for(int i=0; i<rowsA; i++){
                for(int j=0; j<colsB; j++){                              //print the multiplied matrix   
                    System.out.print(c[i][j]+"  ");
                }
                System.out.println();
            }
            
            
        }
        
    }
}
