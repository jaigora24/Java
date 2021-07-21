package searching_algo;
import java.util.*;
public class LinearSearch {
	public static void main(String args[]){
		  Scanner sc = new Scanner(System.in);
	      int array[] = {10, 40, 50, 87, 45, 67, 45};
	      int size = array.length;
	      int value = 45;
	      int num = -1;

	      for (int i=0 ;i< size; i++){
	         if(array[i]==value){
	            num = i;
	            break;
	         }
	      }
	      if(num>=0) {
	    	  System.out.println("FOUND ON INDEX " + num);
	      }else {
	    	  System.out.println("NOT FOUND");
	      }
	 }
}
