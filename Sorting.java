import java.util.ArrayList;
import java.util.Collections;
public class Sorting {
    public static void main(String[] args)
    {
        ArrayList<Integer> num = new ArrayList<>(5);
        num.add(50);
        num.add(30);
        num.add(20);
        num.add(25);
        num.add(40);
        System.out.println("Elements of the ArrayList before" + " sorting : " + num);
        Collections.sort(num, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
        System.out.println("Elements of the ArrayList after" + " sorting : " + num);
    }  
}
