import java.util.Scanner;

public class J_036_Basic_PerfectNumberCheck {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num = scan.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(num==sum)
            System.out.println("The given Number "+num+" is a Perfect Number");
        else
            System.out.println("The given Number "+num+" is not a Perfect Number");
        scan.close();
    }
}
