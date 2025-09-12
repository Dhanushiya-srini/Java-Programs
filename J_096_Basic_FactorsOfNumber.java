import java.util.Scanner;

public class J_096_Basic_FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("The Factors of the Number are: ");
        for(int i=1;i<=num;i++){
            if(num%i==0)
                System.out.print(i+" ");
        }
        scan.close();
    }
}
