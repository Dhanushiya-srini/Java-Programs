import java.util.Scanner;
public class J_102_Basic_DelivaryHours{
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int [] arr = new int [size];
		int [] indices = new int [size];
		int [] Num = new int [size];
		int count=0;
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=1;i<size-1;i++) {
				if(arr[i-1]>arr[i] && arr[i+1]>arr[i]) {
					indices[count]=i;
					Num[count]=arr[i];
					count++;	
			}
		}
		System.out.println("Low-performance hours found: "+count);
		System.out.println("Indices: ");
		for(int i=0;i<count;i++) {
		System.out.print(indices[i]+" ");
		}
		System.out.println();
		System.out.println("Counts: ");
		for(int i=0;i<count;i++) {
			System.out.print(Num[i]+" ");
			}
		scan.close();
	}
}