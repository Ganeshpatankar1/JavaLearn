package ListEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ExTwo {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        s.add("ganesh");
        s.add("Sanket");
        s.add("apple");
        s.add("mango");
        System.out.println(s);

        Collections.sort(s);
        System.out.println(s);
        System.out.println("Ab dekh le");
        Collections.sort(s, String.CASE_INSENSITIVE_ORDER);
        System.out.println(s);
    }
}
