import java.util.Scanner;

public class J_030_Basic_ConvertToUppercase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letter = scan.next();
        String upper = letter.toUpperCase();
        System.out.println(upper);
        scan.close();
    }
}
