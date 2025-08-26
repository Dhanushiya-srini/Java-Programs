import java.util.Scanner;

public class J_025_Basic_SwapTwoNumbersNoTemp {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Before Swapping Number1 and Number2 are: "+num1+" and "+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After Swapping Number1 and Number2 are: "+num1+" and "+num2);
        scan.close();
    }
}
