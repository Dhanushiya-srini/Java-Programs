
import java.util.Scanner;

public class J_029_Basic_PrintASCIIValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letter = scan.next();
        char let=letter.charAt(0);
        int num=(int)let;
        System.out.println("The ASCIIValue of the Character "+let+" is "+num);
        scan.close();
    }
}
