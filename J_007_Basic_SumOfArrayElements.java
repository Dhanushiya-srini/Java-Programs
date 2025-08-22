import java.util.Scanner;

public class J_007_Basic_SumOfArrayElements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int sum=0;
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=scan.nextInt();
        }
        for(int element:arr){
            sum+=element;
        }
        System.out.println(sum);
        scan.close();
    }
}
