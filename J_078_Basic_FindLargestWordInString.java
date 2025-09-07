import java.util.Scanner;

public class J_078_Basic_FindLargestWordInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sen = scan.nextLine();
        String [] arr=sen.split(" ");
        int large=arr[0].length();
        String word = arr[0];
        for(String sub:arr){
            if(sub.length()>large){
                large=sub.length();
                word = sub;
             }
        }
        System.out.println("The Largest Word in the String is : "+word);
        scan.close();
    }
}
