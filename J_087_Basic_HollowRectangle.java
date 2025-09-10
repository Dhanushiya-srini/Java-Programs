import java.util.Scanner;

public class J_087_Basic_HollowRectangle {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int wid = scan.nextInt();
        for(int i=1;i<=wid;i++){
            for(int j=1;j<=len;j++){
                if(i==1||i==wid)
                    System.out.print("* ");
                else{
                    if(j==1||j==len)
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
