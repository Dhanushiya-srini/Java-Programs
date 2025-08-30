import java.util.Scanner;

public class J_061_Basic_ReverseWordsInSentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentences = scan.nextLine();
        String [] arr=sentences.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            if(i!=0)
                sb.append(" ");
        }
        System.out.println(sb);
        scan.close();
    }
}
