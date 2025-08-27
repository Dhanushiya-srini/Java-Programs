import java.util.Scanner;

public class J_051_Basic_CheckArraySorted {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] arr = new int[size];
        int c=0;
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
       for(int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1]){
                c++;
               System.out.println("The Given Array is not in Ascending order."); 
               break;
            }
        }
        if(c==0)
            System.out.println("The Given Array is in Ascending order."); 
        scan.close();
     }
}
