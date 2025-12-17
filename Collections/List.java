import java.util.ArrayList;
import java.util.Arrays;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(43);
        list.add(23);
        list.add(42);
        list.add(94);
        list.add(42);

//        List listone = Arrays.asList("Monday", "Tuesday", "Wensday");



        list.remove(4); //remove ho jayega
        list.set(3,32);        // add karega 3 index par 32


        System.out.println(list.get(2));    //dikhega

        System.out.println(list.size());    //total of size dikhega

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));    //all list print hogi
        }


        for (int x : list){
            System.out.println(x);
        }

        System.out.println(list.contains(43));

        System.out.println(list.contains(32));


    }
}