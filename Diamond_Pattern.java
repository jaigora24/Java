//     *
//   * * * 
// * * * * * 
//   * * * 
//     * 

import java.util.Scanner;
public class p2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int rows = 2*n-1;
		
		for (int i=1; i<=rows; i++){
			if(n>=i){
				for (int j=1; j<=rows-i; j++){
					System.out.print("  ");
				}
				for (int j=1; j<=i; j++){
					System.out.print("* ");
				}
                                for (int j=1; j<=i-1; j++){
                                       System.out.print("* ");
				}					
			}
			else{
				for (int j=1; j<=i-1; j++){
					System.out.print("  ");
				}
				for (int j=1; j<=rows-i+1; j++){
					System.out.print("* ");
				}
				for (int j=1; j<=rows-i; j++){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
