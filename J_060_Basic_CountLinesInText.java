import java.util.Scanner;
public class J_060_Basic_CountLinesInText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        System.out.println("Enter text (type 'END' in a new line to finish the Paragraph):");
        while (true) {
            String line = scan.nextLine();
            if (line.equalsIgnoreCase("END")) {
                break; 
            }
            text.append(line).append("\n"); 
        }
        String[] lines = text.toString().split("\\r?\\n");
        System.out.println("Number of lines entered: " + lines.length);
    scan.close();
    }
}

