//Compile Time Polymorphism (Method Overloading)
class Calculator{
    void add(int a, int b){
        System.out.println("Addition Of Two Integer : " + (a+b));
    }
    void add(double a, double b){
        System.out.println("Addition Of Two Double : " + (a+b));
    }
    void add(int a, int b, int c){ System.out.println("Addition Of Tree Int: " + (a+b+c));}
}   //same method name different parameter - overloading - compile-time polymorphism

//Run-Time Polymorphism (Method Overriding)
class VehicalCar {
    void start(){
        System.out.println("Vehical Is Starting");
    }
}
class CarNew extends VehicalCar{
    @Override
    void start(){
        System.out.println("Car Start with Key");
    }
}
class Bike extends VehicalCar{
    @Override
    void start(){
        System.out.println("Bike starts with self-start button.");
    }
}
public class PolyMorphism {
    public static void main(String[] args) {
        //Method Overloading
        Calculator cal = new Calculator();
        cal.add(43,53);
        cal.add(43.3,23.4);
        cal.add(23,12,2);

        System.out.println();
        //Method Overriding
        VehicalCar v;
        v = new VehicalCar();
        v.start();
        v = new CarNew();
        v.start();
        v = new Bike();
        v.start();

    }
}
