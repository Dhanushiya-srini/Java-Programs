import java.util.Scanner;
public class J_041_Basic_ArraySumAndAverage {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] arr = new int[size];
        int sum=0,avg;
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        avg=sum/size;
        System.out.println("The Sum and Average for the given Numbers are "+sum+" and "+avg);
        scan.close();
     }
}
