import java.util.Arrays;
import java.util.Scanner;

public class J_050_Basic_MergeArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
       int size2 = scan.nextInt();
       int [] arr2 =new int[size2];
       for(int i=0;i<size2;i++){
            arr2[i]=scan.nextInt();
        }
        int [] arr3 =new int [size+size2];
        for(int i= 0;i<size;i++){
            arr3[i]=arr[i];
        }
        for(int i=0;i<size2;i++){
            arr3[i+size]=arr2[i];
        }
        System.out.println("Merge Array: "+Arrays.toString(arr3));
        scan.close();
     }
}
