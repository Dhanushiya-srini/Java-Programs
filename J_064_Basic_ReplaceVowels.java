import java.util.Scanner;

public class J_064_Basic_ReplaceVowels {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Sen = scan.nextLine();
        StringBuffer sb = new StringBuffer();
        String vowels = "aeiouAEIOU";
        for(int i=0;i<Sen.length();i++){
            char ch=Sen.charAt(i);
            if (vowels.indexOf(ch) != -1)
                sb.append("*");
            else
                sb.append(ch);
        }
        System.out.println(sb);
        scan.close();
    }
}
