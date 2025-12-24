package ListEx;

import java.util.HashSet;
import java.util.TreeSet;
public class TreeSett {
    public static void main(String[] args) {
        System.out.println("Hash Set Random Order");
        HashSet<String> hash = new HashSet<String>();
        hash.add("Zebra");
        hash.add("Apple");
        hash.add("Manggo");
        hash.add("Apple");  // Duplicate
        System.out.println(hash);

        TreeSet<String> tset = new TreeSet<String>();
        tset.add("Zebra");
        tset.add("Apple");
        tset.add("Mango");
        tset.add("Apple");
        System.out.println("\n" + tset);

        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(213);
        tree.add(212);
        tree.add(534);
        tree.add(312);
        tree.add(122);
        tree.add(123);
        System.out.println("\n Sorted numbers " + tree);
    }
}
