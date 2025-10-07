import java.util.Scanner;

public class J_015_Basic_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int count=0,num1=num;
        while(num1>1){
            num1 =num1/2;
            count++;
        }
        count++;
        int [] arr = new int[count];
        for(int i=0;i<count;i++){
            arr[i]=num%2;
            num/=2;
       }
       for (int i =count-1; i>=0; i--) {
           System.out.print(arr[i]);
       }
       scan.close();
    }
}
