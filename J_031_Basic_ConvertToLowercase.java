import java.util.Scanner;
public class J_031_Basic_ConvertToLowercase{
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String letter = scan.next();
            String lower = letter.toLowerCase();
            System.out.println(lower);
            scan.close();
        }
  }