import java.util.Scanner;

public class J_081_Basic_PerfectSquareCheck {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int div = (int)Math.pow(num, 0.5);
        int square = (int)Math.pow(div,2);
        if(num==square)
            System.out.println("The Given Number is perfect square.");
        else
            System.out.println("The Given Number is not perfect square.");
        scan.close();
    }
}
