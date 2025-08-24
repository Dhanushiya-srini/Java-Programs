public class J_021_Basic_PrimeNumbersInRange {
    public static void main(String[] args) {
        for(int j=2;j<=100;j++){
            int count=0;
            for (int i = 2; i <=Math.sqrt(j); i++) {
                if(j%i==0)
                    count++;
            }
            if(count==0)
                System.out.print(j+" ");
        }
    }
}
