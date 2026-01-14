import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Amit");
        names.add("Samit");
        names.add("Priya");
        names.add("Sahil");

        System.out.println("--- Printing Using Lambda ---");
        names.forEach(n-> System.out.println(n));
    }
}
