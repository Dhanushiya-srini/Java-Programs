public class J_037_Basic_PerfectNumbersInRange {
     public static void main(String[] args) {
        for(int j=1;j<=1000;j++){
            int sum=0;
            for(int i=1;i<j;i++){
                if(j%i==0){
                    sum+=i;
                }
            }
            if(j==sum)
                System.out.print(j+" ");
            }
    }
}
