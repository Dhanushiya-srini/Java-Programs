import java.util.Scanner;

public class J_070_Basic_CountCharacterOccurrences{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        char ch = scan.next().charAt(0);
        int c=0;
        char [] arr=sentence.toCharArray();
        for(char element:arr ){
            if(element==ch)
                c++;
        }
        System.out.println("The Given character occurs "+c+" times in the String.");
        scan.close();
    }
}