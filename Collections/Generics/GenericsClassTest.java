package Generics;

class UniversalContainer<T>{
    private T value;
    public UniversalContainer(T value){
        this.value = value;
    }
    public void printType(){
        System.out.println("Value : " + value + " | Type: " + value.getClass().getName());
    }
}

public class GenericsClassTest {
    public static void main(String[] args) {
        UniversalContainer<String> c1 = new UniversalContainer<>("Hello Java");
        c1.printType();

        UniversalContainer<Integer> c2 = new UniversalContainer<>(232);
        c2.printType();

        UniversalContainer<Boolean> c3 = new UniversalContainer<>(true);
        c3.printType();

    }
}
