public class StringEx {
    public static void main(String[] args) {
        //String's Behaviour (Immutable)
        String s = "Hello";
        s.concat("World");
        System.out.println("String Result = " + s); //sirf hello ayega ok

        //Right Way s = s.concat("World");

        //String Builder (Mutable and Fast)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("world");
        System.out.println("\nStringBulder Concat = " + sb);
    }
}
