import java.util.Arrays;
import java.util.Scanner;

public class J_049_Basic_CopyArray {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
       int [] arr2 =arr;
       System.out.println("Copy Array: "+Arrays.toString(arr2));
        scan.close();
     }
}
