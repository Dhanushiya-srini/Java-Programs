import java.util.Scanner;

public class J_062_Basic_CheckStringPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Sen = scan.nextLine();
        StringBuffer sb = new StringBuffer();
        for(int i=Sen.length()-1;i>=0;i--){
            char ch=Sen.charAt(i);
            sb.append(ch);
        }
        if(sb.toString().equals(Sen))
            System.out.println("The Given String is Palindrome.");
        else    
             System.out.println("The Given String is not a Palindrome.");
        scan.close();
    }
}
