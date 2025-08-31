import java.util.Arrays;
import java.util.Scanner;

public class J_063_Basic_CheckAnagrams {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Sen1 = scan.nextLine();
        String Sen2 = scan.nextLine();
        char [] arr1 =Sen1.toCharArray();
        char [] arr2 =Sen2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2))
            System.out.println("The Given two Strings are Anagram.");
        else
            System.out.println("The Given two Strings are not an Anagram.");
        scan.close();
     }
}
