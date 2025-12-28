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

        //String methods
        String str = " Java Programing ";

        System.out.println("Original: '" + str + "'");
        System.out.println("length " + str.length());
        System.out.println("Sapce Remove Trim : '" + str.trim() + "'");
        System.out.println("SubString Tukada : " + str.substring(2,6));
        System.out.println("Upper Case " + str.toUpperCase());
        System.out.println("Replace : " + str.replace("Java", "Python"));

        //Check Palindrom
        String world = "MADAM";
        StringBuilder ultra = new StringBuilder(world);
        ultra.reverse();

        if (world.equals(ultra.toString())){
            System.out.println(world + " is Palindrom");
        }
    }
}
