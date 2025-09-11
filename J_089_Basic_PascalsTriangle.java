import java.util.Scanner;
public class J_089_Basic_PascalsTriangle {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i=0;i<=num;i++){
            for(int k=0;k<=num-i-1;k++){
                System.out.print(" ");
            }
            for ( int j=0;j<=i;j++){
                int facti=1,factj=1,factd=1;
                for(int a=i;a>=1;a--){
                    facti*=a;
                }
                for(int b=j;b>=1;b--){
                    factj*=b;
                }
                for(int c=i-j;c>=1;c--){
                    factd*=c;
                }
                int value =facti/(factj*factd);
                System.out.print(value+" ");
                }
            System.out.println();
            }
            scan.close();
        }
}
