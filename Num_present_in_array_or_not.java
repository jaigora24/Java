package array;

import java.util.Scanner;
public class Num_present_in_array_or_not{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number to check: ");
        int check = sc.nextInt();
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        boolean checker = true;
        
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            
            if(a[i]==check){
                checker = true;
                break;
           
            }
            else{
                checker = false;
            }
        }
        if(checker==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
} 
