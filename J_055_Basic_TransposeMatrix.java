import java.util.Scanner;
public class J_055_Basic_TransposeMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int [][] arr = new int[row][col];
        int [][] trans = new int[row][col];
        for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    arr[i][j]=scan.nextInt();
                }
        } 
        for(int i=0;i<col;i++){
                for(int j=0;j<row;j++){
                    trans[j][i]=arr[i][j];
                }
        } 
        System.out.println("The given Array:");
         for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                   System.out.print(arr[i][j]+" ");
                }
                System.out.println();
        } 
        System.out.println("The Transpose Array:");
         for(int i=0;i<col;i++){
                for(int j=0;j<row;j++){
                    System.out.print(trans[i][j]+" ");
                }
                 System.out.println();
        } 
         scan.close();
        }
}
