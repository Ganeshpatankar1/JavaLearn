import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(43);
        list.add(23);
        list.add(42);
        list.add(94);
        list.add(42);
        System.out.println(list.get(2));
        System.out.println(list.size());
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        for (int x : list){
            System.out.println(x);
        }
        System.out.println(list.contains(43));
        System.out.println(list.contains(32));
    }
}