import java.util.Scanner;

public class J_019_Basic_ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rev=0,num1=num;
        while(num>0){
            int r=num%10;
            rev=(rev*10)+r;
            num/=10;
        }
        System.out.println("The Reverse of the Number "+num1+" is "+rev);
        scan.close();
    }
}
