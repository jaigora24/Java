import java.util.Scanner;
public class sum_product_of_elements_in_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        int product = 1;
        
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            sum += a[i];
            product *= a[i];
        }
        System.out.println(sum);
        System.out.println(product);
        
    }
}
