import java.util.Scanner;
public class bubbleSort_descending{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of array");
		int num = sc.nextInt();
		int a[] = new int[num];
		
		System.out.println("enter the array");
		for(int i=0; i<num; i++){
			a[i]=sc.nextInt();
		}
		int n = a.length;
		
		for(int i=0; i<n-1; i++){
			for(int j=0; j<n-1; j++){
				
				if(a[j+1]>a[j]){
					int temp = a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Sorted array in descending order");
		for(int item: a){
			System.out.print(item+" ");
		}
	}
} 
