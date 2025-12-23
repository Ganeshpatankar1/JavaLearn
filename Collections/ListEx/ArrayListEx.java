package ListEx;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> name = new ArrayList<Integer>();
        name.add(42);
        name.add(54);
        name.add(42);
        name.add(93);
        name.add(83);
        name.add(48);
        name.add(83);

        for (Integer i : name){
            System.out.println("Number He jo ki = " + i);
        }

        Iterator<Integer> it = name.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        if (name.contains(83)){
            System.out.println("Are Wah 83 to list me he Ok!");
        }
    }
}
