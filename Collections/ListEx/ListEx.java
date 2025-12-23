package ListEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ListEx {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(21);
        al.add(43);
        al.add(42);
        al.add(53);
        System.out.println(al);

        HashSet hset = new HashSet();
        hset.add(43);
        hset.add(43);
        hset.add(65);
        hset.add(94);
        hset.add(42);
        System.out.println(hset);

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1,"Ganesh");
        hmap.put(2,"Sanket");
        hmap.put(3,"Mangesh");
        hmap.put(4,"Sangram");
        System.out.println(hmap);
    }
}
