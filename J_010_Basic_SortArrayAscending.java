import java.util.Arrays;
import java.util.Scanner;
public class J_010_Basic_SortArrayAscending {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] arr = new int [size];
        int swap;
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1;j++){
                if(arr[j+1]<arr[j]){
                    swap=arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        scan.close();
    }
}
