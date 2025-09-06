import java.util.Scanner;

public class J_075_Basic_PrintAllSubstrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sen = scan.nextLine();
        String [] arr=sen.split(" ");
        System.out.println("The Substrings in the Strings are: ");
        for(String sub:arr){
            System.out.println(sub);
        }
        scan.close();
    }
}
