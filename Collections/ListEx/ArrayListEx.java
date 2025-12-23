package ListEx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
        System.out.println("\n");
        for (Integer i : name){
            System.out.println("Number He jo ki = " + i);
        }
        System.out.println("\n");

        Iterator<Integer> it = name.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("\n");

        if (name.contains(83)){
            System.out.println("Are Wah 83 to list me he Ok!");
        }
        System.out.println("\n");
        Collections.sort(name);
        System.out.println(name);
        Collections.sort(name, Collections.reverseOrder());
        System.out.println(name);
    }
}
