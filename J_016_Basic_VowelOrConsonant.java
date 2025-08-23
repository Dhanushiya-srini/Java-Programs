import java.util.Scanner;

public class J_016_Basic_VowelOrConsonant {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char letter = scan.nextLine().charAt(0);
        letter = Character.toLowerCase(letter);
        if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
           System.out.println("The Given Character is Vowel");
        }
        else if(Character.isLetter(letter)){
            System.out.println("The Given Character is Consonant");
        }
        else{
             System.out.println("The Given Character is Neither Vowel nor Consonant");
        }
        scan.close();
    }
}
