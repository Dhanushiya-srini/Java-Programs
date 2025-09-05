import java.util.Scanner;

public class J_072_Basic_FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Words = scan.nextLine();
        char [] arr=Words.toCharArray();
        int a=0;
        char element;
        for(int j=0;j<arr.length;j++){
             int c=0;
            for(int i=0;i<arr.length;i++){
                if(arr[j]==arr[i])
                    c++;
            }
            if(c==1){
                a++;
                element =arr[j];
                System.out.println("The First Non-Repeating Character is "+element);
                break;
            }
        }
        if(a==0)
            System.out.println("All the Characters in the String are repeating Characters");
        scan.close();
    }
}
