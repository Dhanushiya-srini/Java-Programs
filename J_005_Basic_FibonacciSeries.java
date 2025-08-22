import java.util.Scanner;

public class J_005_Basic_FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first=0,second=1,swap;
        int num=scan.nextInt();
        for(int i=0;i<num;i++){
            System.out.println(first);
            swap=first;
            first=second;
            second=swap+second;
            
        }
        scan.close();
    }
}
