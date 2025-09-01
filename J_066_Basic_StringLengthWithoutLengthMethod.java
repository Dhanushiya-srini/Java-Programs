import java.util.Scanner;

public class J_066_Basic_StringLengthWithoutLengthMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        char [] arr= sentence.toCharArray();
        int len=0;
        for(char ch:arr){
            len++;
        }
        System.out.println("The Length of the Given String is: "+len);
        scan.close();
    }
}
