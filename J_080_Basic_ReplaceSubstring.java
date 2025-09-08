import java.util.Scanner;

public class J_080_Basic_ReplaceSubstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sen = scan.nextLine();
        System.out.println("Enter the Substring for replacement: ");
        String rep=scan.nextLine();
        System.out.println("Enter the Substring to be Replaced: ");
        String org = scan.nextLine();
        String result = sen.replace(org, rep);
        System.out.println(result);
        scan.close();
    }
    
}
