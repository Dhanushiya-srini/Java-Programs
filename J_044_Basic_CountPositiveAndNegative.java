import java.util.Scanner;

public class J_044_Basic_CountPositiveAndNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        int pos=0,neg=0;
        for(int i=0;i<size;i++){
           if(arr[i]>0)
                pos++;
           else
                neg++;
        }
        System.out.println("There are Totally "+pos+" Positive Number and "+neg+" Negative Numbers in the Given Array");
        scan.close();
     }
}
