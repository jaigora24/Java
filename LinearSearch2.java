package sorting_algo;
public class LinearSearch2 {
	public static void main(String[] args) {
		
		int arr[] = new int [] {4,6,8,9,2,1,7,5,0,3};
		int k = 8;
		System.out.println(binarySearch(arr, k));
		sc.close();
		
	}
	
	public static int binarySearch(int [] a, int k) {
		int found = -1;
		for(int i=0; i<a.length; i++) {
			if(a[i]==k) {
				found = i;
				break;
			}
		}
	
		return found;
	}
}
