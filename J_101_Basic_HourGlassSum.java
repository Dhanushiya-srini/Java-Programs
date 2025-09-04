import java.util.Scanner;
public class J_101_Basic_HourGlassSum{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int greater=0,sum;
        int [][] arr = new int[num][num];
         for(int i=0;i<num;i++){
           for(int j=0;j<num;j++){
                arr[i][j]=scan.nextInt();
           }  
        }
        for(int i=0;i<num-2;i++){
           for(int j=0;j<num-2;j++){
                sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(sum>greater)
                    greater=sum;
           }  
        }
        System.out.println(greater);
        scan.close();
    }
}