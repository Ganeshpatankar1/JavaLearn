import java.io.PrintStream;

class Mobile{
    String name;
    int price;

    void setDetails(String name, int price){
        this.name = name;
        this.price=price;
    }
    void show(){
        System.out.println("Model " + name);
        System.out.println("Price " + price);
    }
}
public class This {
    public static void main(String[] args) {
        Mobile mob = new Mobile();
        mob.setDetails("Samsung", 20000);
        mob.show();
    }
}
