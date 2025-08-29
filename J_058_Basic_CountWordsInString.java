import java.util.Scanner;

public class J_058_Basic_CountWordsInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String [] words =sentence.split(" ");
        int count=words.length;
        System.out.println("The Number of Words in the Given Sentence are: "+count);
        scan.close(); 
    }
}
