import java.util.Scanner;

public class J_065_Basic_RemoveSpaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Sen = scan.nextLine();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<Sen.length();i++){
            char ch=Sen.charAt(i);
            if (ch!=' ')
                sb.append(ch);
        }
        System.out.println(sb);
        scan.close();
    }
}
