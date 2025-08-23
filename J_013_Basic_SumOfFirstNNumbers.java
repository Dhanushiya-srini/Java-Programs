import java.util.Scanner;

public class J_013_Basic_SumOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("The Sum of the first "+num+" natural number is "+sum);
        scan.close();
    }
}
