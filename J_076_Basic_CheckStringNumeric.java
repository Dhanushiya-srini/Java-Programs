import java.util.Scanner;

public class J_076_Basic_CheckStringNumeric {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sen = scan.nextLine();
        char [] arr=sen.toCharArray();
        boolean check=true;
        for( char ch:arr){
            if(!Character.isDigit(ch)){
                System.out.println("The Given String dosn't Contains only Digits.");
                check=false;
                break;
            }
        }
        if(check)
               System.out.println("The Given String Contains only Digits.");
        scan.close();
    }
}
