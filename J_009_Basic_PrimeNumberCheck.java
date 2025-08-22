import java.util.Scanner;

public class J_009_Basic_PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num =scan.nextInt();
        int count=0;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num%i==0)
                count++;
        }
        if(count==0)
            System.out.println("The given Number is a Prime number");
        else
            System.out.println("The given Number is not a Prime number");
        scan.close();
    }
}
