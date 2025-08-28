import java.util.Scanner;
public class J_056_Basic_MultiplyMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col= scan.nextInt();
        int [][] arr1 = new int[row][col];
        int [][] arr2 = new int[row][col];
        int [][] mul = new int[row][col];
        for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    arr1[i][j]=scan.nextInt();
                }
        }
        for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    arr2[i][j]=scan.nextInt();
                }
        } 
        for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    int sum=0;
                    for(int k=0;k<col;k++){
                       sum+= arr1[i][k]*arr2[k][j];
                    }
                    mul[i][j]=sum;
                }
        }
        System.out.println("The Multiplied Array:");
         for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(mul[i][j]+" ");
                }
                 System.out.println();
        } 
         scan.close();
    }
}
