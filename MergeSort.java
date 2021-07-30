package sorting_algo;

public class MergeSort {

	public static void main(String[] args) {
		
		int arr[] = mergeSort(new int[] {34,6,78,34,87,98,56,98,0,-76,-54,-65,999}, 0, 12);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static int[] mergeSort(int[] a, int l, int r) {
		if(l<r) {
			int mid = (l+r)/2;
			mergeSort(a, l, mid);
			mergeSort(a, mid+1, r);
			merge(a, l, mid, r);
		}
		return a;
		
	}
	public static int[] merge(int[] a, int l, int mid, int r) {
		int b[] = new int[a.length];
		
		int i = l;
		int j = mid+1;
		int k = l;
		while(i<=mid && j<=r) {
			if(a[i]<a[j]) {
				b[k]=a[i];
				i++;
			}
			else {
				b[k]=a[j];
				j++;
			}
			k++;
		}
		if(i>mid) {
			while(j<=r) {
				b[k]=a[j];
				k++;
				j++;
			}
		}
		else {
			while(i<=mid) {
				b[k]=a[i];
				k++;
				i++;
			}
		}
		for(k=l; k<=r; k++) {
			a[k]=b[k];
		}
		return a;
	}	
	
}
