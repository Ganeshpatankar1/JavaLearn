class Father{
    String car = "Benz";
    int price = 6000000;

}
class Son extends Father{
    String car = "Mercedes";
    int price = 3000000;

    void showDetails(){
        System.out.println("kiske Pass Kya he Dekho\n");
        System.out.println("My Car :" + car);
        System.out.println("My Money :" + price+"\n");
        System.out.println("Father Car :" + super.car);
        System.out.println("Father's Money :" + super.price);


    }
}
public class SuperDemo {
    public static void main(String[] args) {
        Son s = new Son();
        s.showDetails();
    }
}
