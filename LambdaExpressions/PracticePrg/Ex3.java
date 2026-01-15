package PracticePrg;
@FunctionalInterface
interface CheckNumber{
    boolean check(int n);
}
public class Ex3 {
    public static void main(String[] args) {
        CheckNumber isEven = (n) ->{
            if (n % 2 ==0){
                return true;
            } else {
                return false;
            }
        };
        boolean bln = isEven.check(20);
        System.out.println("Is 20 Even : " + bln);
    }
}
