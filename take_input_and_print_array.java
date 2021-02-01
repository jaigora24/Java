import java.util.Scanner;
public class take_input_and_print_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
