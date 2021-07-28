package string;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Jai Gora";
		String revStr = "";
		char arr[] = str.toCharArray();
		for(int i=str.length()-1; i>=0; i--) {
			revStr = revStr + arr[i];
		}
		System.out.print(revStr);

	}

}
