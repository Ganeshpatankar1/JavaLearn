public class CarOne {
    private String carName;
    private String model;
    private double price;

    public void setCarDetails(String carName, String model, double price){
        this.carName = carName;
        this.model = model;
        this.price = price;

    }
    public void getCarDetails(){
        System.out.println("======== Car Details ========");
        System.out.println("Car Name : " + carName);
        System.out.println("Car Model : " + model);
        System.out.println("Car Price : " + price);
    }
}
