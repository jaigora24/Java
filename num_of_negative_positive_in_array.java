import java.util.Scanner;
public class num_of_negative_positive_in_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        int positive = 0;                       //declare each variable be zero
        int negative = 0;
        int nill = 0;
        
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();                  //taking array input
        }
        
        for(int i=0; i<n; i++){
            if(a[i]>0){
                positive++;                     //if no. is greater than 0 then add 1 in counting
            }
            if(a[i]<0){
                negative++;
            }
            if(a[i]==0){
                nill++;
            }
        }
        System.out.println(positive+" "+negative+" "+nill);         
        
    }
}
