import java.util.ArrayList;
import java.util.Collections;

public class problem_02 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(0);
        l1.add(10);
        l1.add(3);
        l1.add(5);
        l1.add(22);
        l1.add(10);
        System.out.print("Original List: "+l1);
        System.out.println();
        Collections.sort(l1);
        System.out.print("Sorted List: "+l1);
    }
}
