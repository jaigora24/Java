package practise;
import java.util.*;
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		int find = sc.nextInt();
		System.out.println(binarySearch(arr,find));
		sc.close();
		
	}
    
	public static int binarySearch(int [] a, int k) {
		int min = 0;
		int max = a.length-1;
		
		while(min<=max) {
			int mid = (min+max)/2;
			if(k<a[mid]) max=mid-1;
			else if(k>a[mid]) min=mid+1;
			else return mid;
		}
		return -1;
	}
}
