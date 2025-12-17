import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(43);
        list.add(21);
        list.add(1);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(20));
        list.remove(2);
        System.out.println(Integer.valueOf(10));
        System.out.println(list);
        System.out.println("\n");

        List<Integer> list2 = new ArrayList<>();
        list2.add(42);
        list2.add(1);
        list2.add(41);
        list2.add(94);
        list.addAll(list2);
//        list.removeAll(list2); // Removed Common Value
//        list.retainAll(list2);
//        System.out.println(list);

        //  List Interface
        List<Integer> listOne = new LinkedList<>();
        listOne.add(90);
        listOne.add(55);
        listOne.add(45);
        listOne.add(33);
        listOne.get(1);
        listOne.set(1,300);
        System.out.println(listOne);
        listOne.add(2, 343);
        System.out.println(listOne);

        System.out.println("\n");


        // List Interface String
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Kevi");
        fruits.add("Apple");
        //  Iterate
        for (int i=0; i<fruits.size(); i++){
            System.out.println("Fruits is " + fruits.get(i));
        }
        System.out.println("\n");
        for (String fruit : fruits){
            System.out.println("For each Fruits " + fruit );
        }
        System.out.println("\n");

        Iterator<String> fe = fruits.iterator();
        while (fe.hasNext()){
            System.out.println(fe.next());
        }
    }
}
