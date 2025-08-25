import java.util.Scanner;

public class J_033_Basic_LCMOfTwoNumbers{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int lcm = num1*num2;
        boolean bool = true;
        if(num1>num2){
            while(bool){
                int rem=num1%num2;
                num1=num2;
                num2=rem;
                if(num2==0)
                    bool=false;
            }
            lcm=lcm/num1;
        }
        else{
            while(bool){
                int rem=num2%num1;
                num2=num1;
                num1=rem;
                if(num1==0)
                    bool=false;
            }
            lcm/=num2;
        }
        System.out.println("The LCM of the Given two Numbers are: "+lcm);
        scan.close();
    }
}