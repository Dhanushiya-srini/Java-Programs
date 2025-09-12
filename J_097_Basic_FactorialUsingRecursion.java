import java.util.Scanner;

public class J_097_Basic_FactorialUsingRecursion {
    public static int Factorial(int num){
        if(num==1)
            return 1;
        else
            return num*Factorial(num-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        int fact = Factorial(num);
        System.out.println("The Factorial of the Number "+num+" is "+fact);
        scan.close();
    }
}
