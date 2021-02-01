import java.util.Scanner;
public class copy_array{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();        //taking input for size of array
		int array[] = new int[n];    //declare new array
		
		for(int i=0; i<n; i++){
			array[i] = sc.nextInt();        //for loop for input first array
		}
		System.out.println("ORIGINAL ARRAY");
		for(int i=0; i<array.length; i++){
			System.out.print(" "+array[i]);  //for loop for print first array
		}
		System.out.println();                 // for next line
		int array2[] = new int[array.length];          //declare new array2 (second array)
		for (int i = 0; i < array.length; i++) {        //for loop for copy array to array2
            array2[i] = array[i];     
        }
		System.out.println("COPIED ARRAY");
		for(int i=0; i<array2.length; i++){
		    System.out.print(" "+array2[i]);          // for loop for print second array
		}
		
	}
}
