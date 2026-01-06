package Generics;
class MyBox<T> {
    private T content;
    public void add(T content){
        this.content = content;
    }
    public T get(){
        return content;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        MyBox<String> stringBox = new MyBox<>();
        stringBox.add("Mera Secret Message");
        System.out.println("Message : " + stringBox.get());
    }
}
