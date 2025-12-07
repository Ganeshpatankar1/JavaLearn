class Bank{
    public void RateOfInterest(){
        System.out.println("Generally Rate Of Interest is 5%");
    }
}
class PNB extends Bank{
    @Override
    public void RateOfInterest(){
        System.out.println("Generally Rate Of Interest is 6.6%");
    }
}
class HDFC extends Bank{
    @Override
    public void RateOfInterest() {
        System.out.println("Generally Rate Of Interest is 5.6%");
    }
}
public class OverridingFun {
    public static void main(String[] args){
        Bank obj = new Bank();
        PNB obj1 = new PNB();
        HDFC obj2 = new HDFC();
        obj.RateOfInterest();
        obj1.RateOfInterest();
        obj2.RateOfInterest();
    }
}
