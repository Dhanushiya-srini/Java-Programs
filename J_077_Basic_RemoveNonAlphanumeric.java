import java.util.Scanner;

public class J_077_Basic_RemoveNonAlphanumeric {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sen = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<sen.length();i++){
            char ch=sen.charAt(i);
            if(!Character.isLetter(ch)&&!Character.isDigit(ch)){
                sb.append(ch);
            }
        }
        System.out.println(sb);
        scan.close();
    }
}
