interface Radio{
    void switchOn();    //body nah he sirf nam
}
interface Television {
    void switchOn();    //yahi bhi body nah he
}

// ata smartspeaker dono implements karu shakto

class SmartSpeaker implements Radio, Television {

    //ab smartspeaker ko dono interface ke switchOn() method ko
    //khud ka body dena jaruri he

    @Override
    public void switchOn(){

        //Yaha confusion nahi he ki , kunki smartspeaker khud bata raha he
        //kiswitchOn() karne par kya karna jaruri he.

        System.out.println("Smart Speaker is now On. You can Choose Tv or Radio.");
    }

}
class MultipleInher{
    public static void main(String[] args) {
        SmartSpeaker ss = new SmartSpeaker();
        ss.switchOn();
        //Java interface ka use karke Multiple Inheritance achieve karta hai.
    }
}