import java.util.Arrays;
import java.util.Scanner;
public class J_048_Basic_ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] arr = new int[size];
        for(int i= 0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Before Reversing: "+Arrays.toString(arr));
        for(int i=0;i<size/2;i++){
           int swap=arr[i];
           arr[i]= arr[size-1-i];
           arr[size-1-i]=swap;
        }
       System.out.println("After Reversing: "+Arrays.toString(arr));
        scan.close();
     }
}
