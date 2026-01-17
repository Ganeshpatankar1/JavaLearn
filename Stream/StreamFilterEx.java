import java.util.Arrays;
import java.util.List;

public class StreamFilterEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zoya", "Amit", "Sanjay", "Aman", "Sanket", "Amol");
        System.out.println("--- Magic PipeLine ---");

        names.stream()
                .filter(n -> n.startsWith("A"))
                .map(n -> n.toUpperCase())
                .sorted()
                .forEach(n -> System.out.println(n));
    }
}
