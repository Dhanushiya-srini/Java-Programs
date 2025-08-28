import java.util.Scanner;

public class J_057_Basic_CheckMatricesEqual {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col= scan.nextInt();
        int [][] arr1 = new int[row][col];
        int row1 = scan.nextInt();
        int col1= scan.nextInt();
        int [][] arr2 = new int[row1][col1];
        int c=0;
        for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    arr1[i][j]=scan.nextInt();
                }
        }
        for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    arr2[i][j]=scan.nextInt();
                }
        } 
        if(row==row1 && col==col1){
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                   if(arr1[i][j]==arr2[i][j])
                         c++;
                }
            }
            if(c==row*col)
                System.out.println("The given two matrices are equal.");
            else
                System.out.println("The given two matrices are not equal.");
        }
        else
            System.out.println("The given two matrices are not equal.");
        scan.close();
    }
}
