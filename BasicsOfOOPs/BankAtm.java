import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 5674;

    public void checkpin(){
        System.out.print("Enter Your PIN : ");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();
        if(PIN == enterpin){
            menu();
        } else {
            System.out.println("Enter Valid PIN! OK");
        }
    }
    public void menu(){
        System.out.println("Enter Your Coice: ");
        System.out.println("1. Check Your Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkBalance();
        } else if(opt == 2){
            withdraMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter A Valid Choice! OK");
        }
        menu();
    }
    public void checkBalance(){
        System.out.println("Balance: " + Balance);
        menu();
    }
    public void withdraMoney(){
        System.out.print("Enter Amount To Withdraw : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount >Balance){
            System.out.println("Insufficient Balance");
        } else {
            Balance = Balance - amount;
            System.out.println("Money Withdraw Successfully");
        }
        menu();
    }
    public void depositMoney(){
        System.out.print("Enter The Amount : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposit SuccessFully ! Ok");
        menu();
    }
}

public class BankAtm {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
