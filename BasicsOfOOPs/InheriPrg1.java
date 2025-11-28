class Vehical{
    double Price;
    double Mileage;
    String Color;

    void Display(){
        System.out.println("Pice of Car " + Price);
        System.out.println("Mileage of Car " + Mileage);
        System.out.println("Color of Car" + Color);
    }
}
class Car extends Vehical{
    String Ftype;
    boolean SunRoof;
    String Brand;
}
public class InheriPrg1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.Brand = "Tata";
        car1.Price = 1840000;
        car1.Mileage = 18.5;
        car1.Ftype = "Diesel";
        car1.Color = "Red";
        car1.SunRoof = true;
        car1.Display();
        System.out.println("Car Fuel Type " + car1.Ftype);
    }
}
