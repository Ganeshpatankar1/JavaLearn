import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TypeOfSetMap {
    public static void main(String[] args) {
        System.out.println("========Set Exmple========");
        //HashSet   (Random)
        HashSet<String> hSet = new HashSet<String>();
        hSet.add("Banana");
        hSet.add("Apple");
        hSet.add("Mango");
        hSet.add("Grav");
        System.out.println("\nHashSet (Random) \n" + hSet);

        //LinkedHash Set (Jo pehale aye wahi jayega)
        LinkedHashSet<String> lhSet = new LinkedHashSet<String>();
        lhSet.add("Banana");
        lhSet.add("Apple");
        lhSet.add("Mango");
        lhSet.add("Grav");
        System.out.println("\nOrder Wahi he \n" + lhSet);

        //TreeSet (Sorted A to Z)
        TreeSet<String> tSet = new TreeSet<String>();
        tSet.add("Banana");
        tSet.add("Apple");
        tSet.add("Mango");
        tSet.add("Grav");
        System.out.println("\nTreeSet (Sorted) \n" + tSet);
    }
}
