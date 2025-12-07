//import java.util.HashSet;
//import java.util.LinkedHashSet;
//
//public class Set {
//    public static void main(String[] args) {
//        // HashSet: Order ki guarantee nahi
//        Set<String> hashSet = new HashSet<>();
//        hashSet.add("Banana");
//        hashSet.add("apple");
//        hashSet.add("Cherry");
//        hashSet.add("apple");   //yeh add nahi hoga
//        System.out.println("HashSet : " + hashSet);
//
//        // LinkedHashSet: Insertion order
//        Set<String> linkedHashSet = new LinkedHashSet<>();
//        linkedHashSet.add("Banana");
//        linkedHashSet.add("Apple");
//        linkedHashSet.add("Cherry");
//        System.out.println("LinkedHashSet: " + linkedHashSet);
//
//        // TreeSet: Sorted order
//        Set<String> treeSet = new TreeSet<>();
//        treeSet.add("Banana");
//        treeSet.add("Apple");
//        treeSet.add("Cherry");
//        System.out.println("TreeSet: " + treeSet);
//
//    }
//}
