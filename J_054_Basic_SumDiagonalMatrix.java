import java.util.Scanner;
public class J_054_Basic_SumDiagonalMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
            int [][] arr = new int[size][size];
            for(int i=0;i<size;i++){
                 for(int j=0;j<size;j++){
                     arr[i][j]=scan.nextInt();
                 }
            } 
        int sum =0;
        for(int i=0;i<size;i++){
            sum+=arr[i][i];
        }
        for(int i=0;i<size;i++){
            int c=size-1-i;
            if(i!=c)
                sum+=arr[i][c];
        }
        System.out.println("The Sum of the Diagonals are: "+sum);
        scan.close();
    }
}
