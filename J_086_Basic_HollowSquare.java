import java.util.Scanner;
public class J_086_Basic_HollowSquare {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==1||i==num)
                    System.out.print("* ");
                else{
                    if(j==1||j==num)
                       System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
