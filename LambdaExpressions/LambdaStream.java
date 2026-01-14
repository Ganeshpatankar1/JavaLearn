//Ek Function Interface Banate he
@FunctionalInterface
interface Greeting{
    void sayHello(String name);
}

public class LambdaStream {
    public static void main(String[] args) {
        //Lambda Expression
        //bina Class Banaye Method Define Kar diya
        Greeting g = (name) -> System.out.println("Hello " + name + ", Welcome to Java 8");
        g.sayHello("Rahul");
    }
}
