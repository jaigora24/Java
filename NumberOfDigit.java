import java.util.Scanner;
public class NumberOfDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int numberOfDigit = (int)Math.log10(n)+1;
        System.out.println(numberOfDigit);
    }
}
