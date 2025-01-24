public class Patterns {
    public static void main(String[] args) {
        System.out.println("Increasing Triangle ");
        for (int i = 1; i<=5; i++) {
            for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println("Decreasing Triangle ");
    for (int i = 5; i>=1; i--) {
        for(int j=1;j<=i;j++){
        System.out.print("* ");
    }
    System.out.println();
}
System.out.println("Pyramid Triangle ");
for (int i= 1; i <= 5; i++) {
    for ( int j = 1;j<=5-i; j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print( "* ");
    }
    System.out.println();
}
}
}
// Output 
/* Increasing Triangle 
*
* *
* * *
* * * *
* * * * *
Decreasing Triangle
* * * * * 
* * * *
* * *
* *
*
Pyramid Triangle
    *
   * *
  * * *
 * * * *
* * * * *     */
