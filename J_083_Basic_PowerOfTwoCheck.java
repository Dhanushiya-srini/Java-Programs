import java.util.Scanner;

public class J_083_Basic_PowerOfTwoCheck {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int num = Scan.nextInt();
        int i=1;
        while(i<num){
            i*=2;
        }
        if(i==num)
            System.out.println("The Given Number is Power of two.");
        else
            System.out.println("The Given Number is not Power of two.");
        Scan.close();
    }
}
