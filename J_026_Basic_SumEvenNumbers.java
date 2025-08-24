
import java.util.Scanner;

public class J_026_Basic_SumEvenNumbers {
    public static void main(String[] args) {
        int sum=0;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=2;i<=num;i=i+2){
            sum+=i;
        }
        System.out.println("The Sum of the Even Numbers from 1 to "+num+" is "+sum);
        scan.close();
    }
}
