public class J_082_Basic_SumPrimeNumbersInRange {
    public static void main(String[] args) {
        int sum=0;
        for(int j=2;j<=1000;j++){
            int count=0;
            for (int i = 2; i <=Math.sqrt(j); i++) {
                if(j%i==0)
                    count++;
            }
            if(count==0)
                sum+=j;
        
        }
        System.out.println("Sum of the Prime Numbers between 1 to 1000: "+sum);
    }
}
