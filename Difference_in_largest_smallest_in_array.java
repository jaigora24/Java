import java.util.Scanner;
public class Difference_in_largest_smallest_in_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[]=new int[n];
        
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        
        int largest = a[0];
        int smallest = a[0];
        
        for(int i=0; i<n; i++){
            if(a[i]>largest){
                largest = a[i];
            }
            if(a[i]<smallest){
                smallest=a[i];
            }
        }
        int result = largest-smallest;
        System.out.println("Difference between largest & smallest is : "+ result);
        
    }
} 
