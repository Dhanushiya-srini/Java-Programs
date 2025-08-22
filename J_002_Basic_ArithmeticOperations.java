import java.util.Scanner;
public class J_002_Basic_ArithmeticOperations{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int add=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        int div=num1/num2;
        System.out.println("Addition of two numbers are: "+add);
        System.out.println("Substraction of two numbers are: "+sub);
        System.out.println("Multiplication of two numbers are: "+mul);
        System.out.println("Division of two numbers are: "+div);
    scan.close();
    }
}