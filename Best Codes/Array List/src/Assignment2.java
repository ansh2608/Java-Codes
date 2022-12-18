import java.util.ArrayList;

public class Assignment2 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(5);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        System.out.print("Given List: "+l1);
        System.out.println();
        l1.remove(2);
        System.out.print("Updated List: "+l1);

    }
}
