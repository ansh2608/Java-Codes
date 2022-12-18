import java.util.ArrayList;
import java.util.Collections;

public class Assignment4 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(5);
        l1.add(3);
        l1.add(5);
        l1.add(1);
        l1.add(-4);
        l1.add(9);
        l1.add(0);
        l1.add(-2);
        System.out.print("Given List: "+l1);
        System.out.println();
        Collections.sort(l1);
        System.out.print("Updated List: "+l1);

    }
}
