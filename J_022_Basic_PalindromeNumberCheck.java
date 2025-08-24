import java.util.Scanner;

public class J_022_Basic_PalindromeNumberCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rev=0,num1=num;
        while(num>0){
            int r=num%10;
            rev=(rev*10)+r;
            num/=10;
        }
        if(num1==rev)
            System.out.println("The Given Number is Palindrome Number.");
        else
            System.out.println("The Given Number is not a Palindrome Number.");
        scan.close();
    }
}
