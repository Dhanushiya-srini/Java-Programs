import java.util.Scanner;

public class J_098_Basic_FibonacciUsingRecursion {
    public static int Fibonacci(int num) {
        if(num == 0)
            return 0;
         else if (num == 1) 
            return 1;
         else 
            return Fibonacci(num - 1) + Fibonacci(num - 2);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num =scan.nextInt(); 
        for (int i = 0; i< num; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
    scan.close();
    }
}
