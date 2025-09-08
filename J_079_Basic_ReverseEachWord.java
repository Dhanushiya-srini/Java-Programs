import java.util.Scanner;

public class J_079_Basic_ReverseEachWord{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String sen = scan.nextLine();
        String [] arr = sen.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word:arr){
            char [] arr1 =word.toCharArray();
            for(int i=arr1.length-1;i>=0;i--){
                sb.append(arr1[i]);
            }
            sb.append(" ");
        }
        System.out.println(sb);
        scan.close();
    }
}