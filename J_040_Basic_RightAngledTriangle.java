import java.util.Scanner;
public class J_040_Basic_RightAngledTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i=1;i<=num;i++){
            for ( int j=1;j<=i;j++) {
                System.out.print(j+" ");
                }
            System.out.println();
            }
            scan.close();
        }
}
