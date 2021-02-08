import java.util.Scanner;
public class selection_sort{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        
        System.out.println("enter the array");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        
        for(int i=0; i<n-1; i++){
            
            int minimun = i;
            
            for(int j=i; j<n; j++){
                
                if(a[j]<a[minimun]){
                    minimun = j;
                }
            }
            
            int temp = a[i];
            a[i] = a[minimun];
            a[minimun] = temp;
        }
        
        System.out.println("Sorted array");
        for(int e:a){
            System.out.print(e+" ");
        }
        
    }
}
