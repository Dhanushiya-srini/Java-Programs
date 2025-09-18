import java.util.Scanner;
public class J_099_Basic_PowerUsingRecursion{
    public static int power(int num,int exp){
        if(exp==0)
            return 1;
        else
            return num*power(num,exp-1);
    }

    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int exp = scan.nextInt();
    System.out.println(power(num,exp));
    scan.close();
}
}