@FunctionalInterface
interface GreetingOne{
    void sayHi(String name);
}
public class LambdaEx2 {
    public static void main(String[] args) {
        GreetingOne myGreeting = (n) -> System.out.println("Welcome : " + n);
        myGreeting.sayHi("Rahul");
        myGreeting.sayHi("Amit");
    }
}
