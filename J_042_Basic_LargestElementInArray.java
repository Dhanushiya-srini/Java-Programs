import java.util.Scanner;

public class J_042_Basic_LargestElementInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        int great=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>great)
                great=arr[i];
        }
        System.out.println("The Greatest Number in the given Numbers is "+great);
        scan.close();
     }
}
