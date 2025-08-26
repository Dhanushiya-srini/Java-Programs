import java.util.Scanner;
public class J_043_Basic_SmallestElementInArray {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        int small=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]<small)
                small=arr[i];
        }
        System.out.println("The Smallest Number in the given Numbers is "+small);
        scan.close();
     }
}
