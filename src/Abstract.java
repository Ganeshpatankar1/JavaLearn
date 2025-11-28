//abstract clas, iska object nahi ban sakta
abstract class Vehicals{
    //Abstract Method Iski Body Nahi He,
    //Ye he ek rule Ban gaya he ki jo isko inherit karega , use start() banana Padega.
    abstract void done();
}
class Cars extends Vehicals{
    //yaha done ki body deni padegi ok
    void done(){
        System.out.println("Car Start With Key");
    }
}
class Scooter extends Vehicals{
    //yaha bhi done() ko body deni padegi
    void done(){
        System.out.println("Scooter Start With Kick");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Cars car = new Cars();
        car.done();
        Scooter sc = new Scooter();
        sc.done();
    }
}
