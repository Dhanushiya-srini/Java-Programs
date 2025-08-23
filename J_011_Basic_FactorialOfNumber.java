import java.util.Scanner;

public class J_011_Basic_FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int fact=1;
        for(int i=num;i>=1;i--){
            fact*=i;
        }
        System.out.println("The Factorial of "+num+" is "+fact);
        scan.close();
    }
}
