import java.util.Scanner;

public class J_045_Basic_CountEvenAndOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        int even=0,odd=0;
        for(int i=0;i<size;i++){
           if(arr[i]%2==0)
                even++;
           else
                odd++;
        }
        System.out.println("There are Totally "+even+" Even Number and "+odd+" Odd Numbers in the Given Array");
        scan.close();
     }
}
