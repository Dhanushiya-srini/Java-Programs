import java.util.Scanner;

public class J_069_Basic_ConcatenateStrings{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text1 = scan.nextLine();
        String text2 = scan.nextLine();
        String text3 = text1.concat(text2);
        System.out.println("The Concatenate String is :"+text3);
        scan.close();
    }
}
