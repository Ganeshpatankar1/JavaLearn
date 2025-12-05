// Step 1: Apni khud ki Exception class banao
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message); // Parent class (Exception) ke constructor ko call kiya
    }
}

//step 2 throw ko instamal karo
 class BankAccount{
    private int balance = 1000;
    int amount;
    public void withdraw(int withdraw) throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException("Balance kam hai! Aap itne paise nahi nikal sakte.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }
}

public class ProgramNew {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        try{
            bank.withdraw(1500);
        } catch (InsufficientFundsException e){
            System.out.println("Error" + e.getMessage());
        }
    }
}
