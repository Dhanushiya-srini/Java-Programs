import java.util.Scanner;
public class J_068_Basic_IntegerToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String text = String.valueOf(num);
        System.out.println(num);
        scan.close();
    }
}