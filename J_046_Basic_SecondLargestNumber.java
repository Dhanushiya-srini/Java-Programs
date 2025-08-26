import java.util.Scanner;
public class J_046_Basic_SecondLargestNumber {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1;j++){
                if(arr[j+1]>arr[j]){
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
        int c=0,first=arr[0];
         for(int i=0;i<size;i++){
            if(arr[i]==first){
                c++;
            }
        }
        int sec_gre=arr[c];
        System.out.println("The Second Greatest Number in the given Numbers is "+sec_gre);
        scan.close();
     }
}
