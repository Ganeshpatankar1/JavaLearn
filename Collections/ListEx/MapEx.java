package ListEx;

import java.util.HashMap;

public class MapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(101, "Ganesh");
        map.put(102, "Sanket");
        map.put(103, "Dheeraj");
        map.put(104, "Chetan");
        map.put(105, "Nitin");
        System.out.println("Pura Register = " + map);
        System.out.println("\n");

        String name = map.get(103);
        System.out.println("Ye kon he " + name);
        System.out.println("\n");


        String nameOne  = map.get(300);
        System.out.println("Yaha pe " + nameOne); //Null
        System.out.println("\n");


        System.out.println("Only Roll No" + map.keySet());
        System.out.println("\n");
        if (map.containsKey(105)){
            System.out.println("Got It");
        }
    }
}
