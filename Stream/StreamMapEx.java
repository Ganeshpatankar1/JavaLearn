import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapEx {
    public static void main(String[] args) {
        List<String> namess = Arrays.asList("amit", "rahul", "sanket");
        System.out.println("Original : " + namess);

        List<String> UpperCase = namess.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Changed : " + UpperCase);

    }
}
