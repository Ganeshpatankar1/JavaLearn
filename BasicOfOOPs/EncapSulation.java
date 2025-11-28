//ek capsul he jiska nam car he
 class TataCar{
    //data ko private rakhna he koi  badal na kar sake
    private String color;
    private int speed;

    //public method, jiski color ki value li ja sakte he(Getter)
    public String getColor(){
        return color;
    }
    //public method, jisse color ki value  set ki ja sakti he (setter)
    public void setColor(String newColor){
        //Yaha hum Condition bhi laga sakte he jese , color ki value null na ho
        this.color = newColor;
    }
}
public class EncapSulation {
    public static void main(String[] args) {
        TataCar car = new TataCar();
        car.setColor("Red");
        System.out.println(car.getColor());
    }
}
