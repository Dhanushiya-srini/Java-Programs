import java.util.Scanner;

public class J_004_Basic_LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int num1=scan.nextInt();
         System.out.println("Enter the number2: ");
        int num2 =scan.nextInt();
         System.out.println("Enter the number3: ");
        int num3 =scan.nextInt();
        if(num1==num2&&num2==num3){
            System.out.println("All the numbers are equals.");
        }
        else if (num1>num2&& num1>num3) {
            System.out.println(num1+" is the Greatest Number.");
        }
        else if (num2>num1&& num2>num3) {
            System.out.println(num2+" is the Greatest Number.");
        }
        else if (num3>num2&& num3>num1) {
            System.out.println(num3+" is the Greatest Number.");
        }
        scan.close();
    }
}
