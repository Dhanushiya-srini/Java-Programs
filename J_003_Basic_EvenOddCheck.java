import java.util.Scanner;

public class J_003_Basic_EvenOddCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        if (num%2==0)
            System.out.println("The Given number is even.");
        else
            System.out.println("The Given number is odd.");
        scan.close();
    }
}
