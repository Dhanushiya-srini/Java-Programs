import java.util.Scanner;

public class J_023_Basic_SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum=0,num1=num;
        while(num>0){
            int r=num%10;
           sum+=r;
            num/=10;
        }
        System.out.println("The Sum of the Digits of a Number "+num1+" is "+sum);
        scan.close();
    }
}
