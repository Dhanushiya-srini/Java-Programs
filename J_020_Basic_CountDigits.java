import java.util.Scanner;

public class J_020_Basic_CountDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count=0,num1=num;
        while(num>0){
            num/=10;
            count++;
           
        }
        System.out.println("The Number of Digits in "+num1+" is "+count);
        scan.close();
    }
}
