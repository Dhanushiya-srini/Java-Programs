import java.util.Scanner;

public class J_034_Basic_ArmstrongNumberCheck {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int num1=num,count=0,sum=0;
        while(num>0){
            num/=10;
            count++;
            
        }
        num=num1;
        while(num>0){
            int r=num%10;
            sum+=Math.pow(r,count);
            num/=10;
        }
        if(sum==num1){
            System.out.println("The Given Number is an Amstrong number.");
        }
        else{
            System.out.println("The Given Number is not an Amstrong number.");
        }
        scan.close();
    }
}
