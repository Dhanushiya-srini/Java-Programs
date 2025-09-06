import java.util.Scanner;

public class J_074_Basic_ConvertToTitleCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sen = scan.nextLine();
        char [] arr=sen.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(arr[0]));
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==' ')
                sb.append(Character.toUpperCase(arr[i]));
            else
                sb.append(Character.toLowerCase(arr[i]));
        }
        System.out.println(sb);
        scan.close();
    }
}
