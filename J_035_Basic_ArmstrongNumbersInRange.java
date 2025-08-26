public class J_035_Basic_ArmstrongNumbersInRange {
    public static void main(String[] args) {
        for(int i=1;i<=500;i++){
            int num=i,count=0,sum=0;
            while(num>0){
                num/=10;
                count++; 
            }
            num=i;
            while(num>0){
                int r=num%10;
                sum+=Math.pow(r,count);
                num/=10;
            }
            if(sum==i)
                System.out.print(i+" ");   
        }
    }
}
