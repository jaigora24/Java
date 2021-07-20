import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();        //taking input for size of array
		int array[] = new int[n];    //declare new array
		
		for(int i=0; i<n; i++){
			array[i] = sc.nextInt();        //for loop for input first array
		}
		System.out.println("ORIGINAL ARRAY"); 
		for(int i=0; i<array.length; i++){
			System.out.print(" "+array[i]);  //for loop for print first array
		}
		 System.out.println();               // for next line
		int array2[] = new int[array.length];          //declare new array2 (second array)
		for (int i = 0; i < array.length; i++) {        //for loop for copy array to array2
            array2[i] = array[i];     
        }
		System.out.println("REVERSED ARRAY OR ARRAY 2");
		for(int i= array.length-1; i>=0; i--){
		    System.out.print(" "+array2[i]);     //for loop for reverse and print array2
		}
		
	}
}
