import java.util.Scanner;
public class J_052_Basic_FrequencyOfElements {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] arr = new int[size];
        int [] org =new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        } 
        int k=0;
        for(int i =0;i<size;i++){
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
        for (int i = 0; i <k; i++) {
            int c=0;
            for (int j = 0; j< size; j++) {
               if(org[i]==arr[j]) 
                    c++;
            }
            System.out.println("The Element "+org[i]+" occurs "+c+" times.");
        }
        scan.close();
    }
}
