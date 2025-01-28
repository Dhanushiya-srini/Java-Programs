public class Methods {
    static void MET() {    //Create a Method
        System.out.println("Hello");
    }
    static void MET1(String Name) {    //Create a Method with parameters
        System.out.println("Hello "+ Name);
      }
      static int add(int x, int y) {    //Create a Method with parameters and return type
        return x + y;
      }
    public static void main(String[] args) {
        MET();  //Call a Method
        MET();    // Methods called multiple times
        MET1("John");
        MET1("Jeni");
        System.out.println(add(3, 5));    //Call a Method with parameters and return type
      }
}
// Output:
   /*Hello
     Hello
     Hello John
     Hello Jeni
     8  */