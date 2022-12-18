import java.util.ArrayList;

public class Assignment5 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(5);
        l1.add(-4);
        l1.add(0);
        l1.add(8);
        l1.add(-3);
        l1.add(-2);
        System.out.print("Given List: "+l1);
        System.out.println();
        for (int i=0;i< l1.size();i++){
            if (l1.get(i)>=0){
                l1.add(i);
            }
            if (l1.size()==0){
                System.out.println("NA");
            }
        }
        System.out.print("Updated List: "+l1);

    }
}
