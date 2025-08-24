
import java.util.Scanner;

public class J_024_Basic_SwapTwoNumbersTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int swap;
        System.out.println("Before Swapping Number1 and Number2 are: "+num1+" and "+num2);
        swap=num1;
        num1=num2;
        num2=swap;
        System.out.println("After Swapping Number1 and Number2 are: "+num1+" and "+num2);
        scan.close();
    }
}
