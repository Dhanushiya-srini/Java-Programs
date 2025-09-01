import java.util.Scanner;

public class J_067_Basic_StringToInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int num = Integer.parseInt(text);
        System.out.println(num);
        scan.close();
    }
}
