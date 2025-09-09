import java.util.Scanner;

public class J_085_Basic_SumFirstNEvenNumbers {
     public static void main(String[] args) {
        int sum=0;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=2;i<=2*num;i=i+2){
            sum+=i;
        }
        System.out.println("The Sum of the First n Even Number is "+sum);
        scan.close();
    }
}
