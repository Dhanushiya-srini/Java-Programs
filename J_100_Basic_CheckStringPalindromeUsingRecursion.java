import java.util.Scanner;
public class J_100_Basic_CheckStringPalindromeUsingRecursion {
        public static boolean isPalin(String str, int start, int end) {
            if (start >= end) 
                return true;
            if (str.charAt(start) != str.charAt(end))
                return false;
            return isPalin(str, start + 1, end - 1);
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String input = scan.next();
            if (isPalin(input, 0, input.length() - 1)) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is NOT a palindrome.");
            }
            scan.close();
        }
    }
    
