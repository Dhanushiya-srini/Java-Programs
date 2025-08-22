import java.util.Scanner;
public class J_006_Basic_ReverseString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.next();
        int size=word.length();
        int size2=size-1;
        char [] arr1=word.toCharArray();
        char [] arr2=new char[size];
        for(int i=size2;i>=0;i--){
            arr2[size2-i]=arr1[i];
        }
        String reversed=new String(arr2);
        System.out.println(reversed);
        scan.close();
    }
}
