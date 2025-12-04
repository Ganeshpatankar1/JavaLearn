public class ThrowPrg {
    static class Bankk{
        void withdraw(int amount){
            if (amount > 5000){
                throw new RuntimeException("Limit Exceeded");
            }
            System.out.println("Withdraw Successfully");
        }
    }
    public static void main(String[] args) {
        Bankk bank = new Bankk();
        bank.withdraw(7000);
        int age = 15;
        if(age < 18){
            //Manually exception create kar raha he
            throw new ArithmeticException("Your Are under in 18");

        }
        System.out.println("You are Eligible!");
    }
}
