import java.util.Scanner;

public class J_071_Basic_PrintUniqueCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Words = scan.nextLine();
        char [] arr=Words.toCharArray();
        for(int j=0;j<arr.length;j++){
            int c=0;
            for(int i=0;i<arr.length;i++){
                if(arr[j]==arr[i])
                    c++;
            }
            if(c==1){
                System.out.print(arr[j]+" ");
            }
        }
        scan.close();
    }
}
