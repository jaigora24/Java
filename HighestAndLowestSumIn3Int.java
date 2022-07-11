import java.util.Scanner;
public class HighestAndLowestSumIn3Int{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int temp1 = a;
		int max1 = 9;
		int min1 = 0;
		
		int temp2 = b;
		int max2 = 9;
		int min2 = 0;
		
		int temp3 = c;
		int max3 = 9;
		int min3 = 0;
		
		
		while(temp1>0){
			int last = temp1%10;
			if(last<max1){
				max1=last;
			}
			if(last>min1){
				min1=last;
			}
			temp1/=10;
		}
		while(temp2>0){
			int last = temp2%10;
			if(last<max2){
				max2=last;
			}
			if(last>min2){
				min2=last;
			}
			temp2/=10;
		}
		while(temp3>0){
			int last = temp3%10;
			if(last<max3){
				max3=last;
			}
			if(last>min3){
				min3=last;
			}
			temp3/=10;
		}
		int maximum = max1+max2+max3;
		int minimum = min1+min2+min3;
		System.out.println(maximum);
		System.out.println(minimum);
		
	}
}
