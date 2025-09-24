import java.util.Scanner;
public class 103_Basic_NumberPyramid{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int j,k,a;
        for(int i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(k=i;k<2*i;k++){
                System.out.print(k+" ");
            }
            k--;
            for(a=1;a<i;a++){
                k--;
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}