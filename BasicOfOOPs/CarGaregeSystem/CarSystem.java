package CarGaregeSystem;

import java.util.Scanner;

class Vehical{
    String brand;
    double price;

    Vehical(String brand, double price){
        this.brand = brand;
        this.price = price;

    }
    void displayInfo(){
        System.out.println("Brand :" + brand);
        System.out.println("Price :" + price + "Lakh");
    }
}

class Car extends Vehical{
    String fuelType;

    Car(String brand, double price, String fuelT) {
        super(brand, price);
        this.fuelType = fuelType;
    }
    @Override
    void displayInfo(){
        System.out.println("===== Car details =====");

        super.displayInfo();
        System.out.println("fuelType : " + this.fuelType);
//        this.fuelType = fuelType;
        System.out.println("=====================");
    }
}
public class CarSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Welcome To My Motor ===");
        System.out.print("Gadi Name Brand : ");
        String brandName = sc.nextLine();
        System.out.print("Price : ");
        double carPrice = sc.nextDouble();
        System.out.print("Fuel Type Bata do : ");
        String fuelT = sc.nextLine();

        Car myNewCar = new Car(brandName, carPrice, fuelT);
        System.out.println("bill ban raha he");
        myNewCar.displayInfo();
        sc.close();

    }
}
