package searching_algo;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int find = 89;
		System.out.println(binarySearch(arr,find));

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
