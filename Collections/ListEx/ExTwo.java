package ListEx;

import java.util.ArrayList;
import java.util.Collections;

public class ExTwo {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        s.add("ganesh");
        s.add("Sanket");
        s.add("apple");
        s.add("mango");
        Collections.sort(s);
        System.out.println(s);
    }
}
