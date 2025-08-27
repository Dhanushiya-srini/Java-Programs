import java.util.Scanner;

public class J_053_Basic_RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] arr = new int[size];
        int [] org =new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        } 
        int k=0;
        for(int i=0;i<size;i++){
            boolean bool=true;
            for(int j=0;j<k;j++){
                if(org[j]==arr[i]){
                    bool=false;
                    break;
                }
            }
            if(bool){
                org[k]=arr[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
           System.out.print(arr[i]+" ");
        } 
    scan.close();
    }
}
