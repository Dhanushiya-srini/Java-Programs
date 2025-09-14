import java.util.Scanner;

public class J_092_Basic_CompoundInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        double r = scan.nextDouble();
        int n= scan.nextInt();
        int t=scan.nextInt();
        double mul=n*t;
        double q =(1+(r/n));
        double pow =Math.pow(q, mul);
        double CI =p*pow-p;
        int Com =(int)CI;
        System.out.println("The compound Interest is :"+Com);
        scan.close();
    }
}
