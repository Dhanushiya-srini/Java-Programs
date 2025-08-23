import java.util.Scanner;

public class J_014_Basic_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp=scan.nextInt();
        int fahren= (9*(temp/5))+32; 
        System.out.println("The Temperature in Fahrenheit is "+fahren);
        scan.close();
    }
}
