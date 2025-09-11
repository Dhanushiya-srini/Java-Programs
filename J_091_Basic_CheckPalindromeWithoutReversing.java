import java.util.Scanner;

public class J_091_Basic_CheckPalindromeWithoutReversing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int c=0,num=number;
        boolean check=true;
        while(number>0){
            number/=10;
            c++;
        }
        int [] arr = new int[c];
        for(int i=0;i<c;i++){
            arr[i]=num%10;
            num/=10;
        }
        for(int i=0;i<c/2;i++){
            if(arr[i]!=arr[c-i-1]){
                System.out.println("The Given Number is not a palindrome.");
                check=false;
                break;
            }
        }
        if(check)
            System.out.println("The Given Number is a palindrome.");
    scan.close();
    }
}
