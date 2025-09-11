import java.util.Scanner;

public class J_094_Basic_SumOfCubes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int sum=0;
        for(int i=1;i<=size;i++){
            int cube = i*i*i;
            sum+=cube;
                }
        System.out.println("The Sum of the Cubes of the numbers are: "+sum);
        scan.close();
    }
}
