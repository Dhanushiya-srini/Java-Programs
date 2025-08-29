import java.util.Scanner;

public class J_059_Basic_CountSentencesInParagraph {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Paragraph = scan.nextLine();
        String [] Sentence =Paragraph.split("[!.?]");
        int count=Sentence.length;
        System.out.println("The Number of Sentences in the Given Paragraph are: "+count);
        scan.close(); 
    }
}
