package PracticePrg;
@FunctionalInterface
interface Adder{
    int add(int a, int b);
}
public class Ex2 {
    public static void main(String[] args) {
        Adder ad = (a,b) -> a+b;
        int total = ad.add(20,32);
        System.out.println("Output is : " + total);
    }
}
