import java.util.ArrayList;
import java.util.List;

public class List {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ganesh");
        names.add("Parth");
        names.add("Ganesh");    //Duplicate Allowed

        System.out.println(names);
        System.out.println("Pehala Name : " + names.get(0));    //Fast acess
    }
}
