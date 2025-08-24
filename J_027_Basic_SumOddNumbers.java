import java.util.Scanner;

public class J_027_Basic_SumOddNumbers {
    public static void main(String[] args) {
        int sum=0;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=1;i<=num;i=i+2){
            sum+=i;
        }
        System.out.println("The Sum of the Odd Numbers from 1 to "+num+" is "+sum);
        scan.close();
    }
}
