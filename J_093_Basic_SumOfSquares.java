import java.util.Scanner;

public class J_093_Basic_SumOfSquares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int sum=0;
        for(int i=0;i<size;i++){
            int num=scan.nextInt();
            int sq = num*num;
            sum+=sq;
                }
        System.out.println("The Sum of the Squares of the numbers are: "+sum);
        scan.close();
    }
}
