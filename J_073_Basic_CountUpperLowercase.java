import java.util.Scanner;
public class J_073_Basic_CountUpperLowercase{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String sen=scan.nextLine();
        int u=0,l=0;
        for(int i=0;i<sen.length();i++){
            char ch=sen.charAt(i);
            if(Character.isUpperCase(ch))
                u++;
            else if(Character.isLowerCase(ch))
                l++;
        }
        System.out.println("No of UpperCase in the given String is :"+u);
        System.out.println("No of LowerCase in the given String is :"+l);
        scan.close();
    }
}