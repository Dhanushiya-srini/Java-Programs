import java.util.Scanner;

public class J_090_Basic_CountVowelsInEachWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sen = scan.nextLine();
        String [] arr = sen.split(" ");
        String vowels="AEIOUaeiou";
        for(String words :arr){
            char [] word=words.toCharArray();
            int count=0;
            for(char ch:word){
                if(vowels.indexOf(ch) != -1)
                    count++;
            }
            System.out.println(words+":"+count);
        }
        scan.close();
    }
}
