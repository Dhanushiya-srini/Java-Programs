import java.util.Scanner;
public class J_008_Basic_CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word=scan.next();
        word=word.toLowerCase();
        int vowels=0,cons=0;
        char [] arr =word.toCharArray();
        for(char letter:arr){
            if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
                vowels++;
            }
            else if(Character.isLetter(letter)){
                cons++;
            }
        }
        System.out.println("Number of Vowels in the String: "+vowels);
        System.out.println("Number of Consonant in the String: "+cons);
        scan.close();
    }
}
