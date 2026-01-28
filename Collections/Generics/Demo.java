import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(123);  //type safe

        List anotherList = new ArrayList();
        anotherList.add("Java");    //untype safe
        anotherList.add(123);
        anotherList.add(123.12);

        System.out.println(list);
        System.out.println(anotherList);
    }
}
