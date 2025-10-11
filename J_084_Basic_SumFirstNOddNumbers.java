import java.util.Scanner;

public class J_084_Basic_SumFirstNOddNumbers {
     public static void main(String[] args) {
        int sum=0;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i =1;i<=2*num;i=i+2){
            sum+=i;
        }
        System.out.println("The Sum of the First n Odd Number is "+sum);
        scan.close();
    }
}
