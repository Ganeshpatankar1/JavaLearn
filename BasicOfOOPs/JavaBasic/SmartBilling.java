package JavaBasic;

import java.util.Scanner;

public class SmartBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalBill = 0;
        int itemCount = 0;

        System.out.println("--- WelCome To My Shop ----");
        System.out.println("Price Dalo or Khatam Karne ke liye -1 Button Click karo");

        while (true){
            System.out.println("Item " + (itemCount + 1) + " ka price batao :");

            double price = sc.nextDouble();

            if (price == -1) {
                System.out.println("Shopping Khatam Ho Gaya he, Bill Tayar Ho raha he!");
                break;
            }

            if (price < 0){
                System.out.println("Are! Price Negative nahi ho sakta. Dobara Daalo");
                continue;
            }


        }
        double finalAmount = totalBill;
        double discount = 0;

        if (totalBill  > 2000){
                discount = totalBill * 10.0;
                finalAmount = totalBill - discount;
                System.out.println("\nBadhai ho! 2000 se zyada shopping pe 10% OFF mila.");
        } else {
                    System.out.println("\n(Tip: Agar 2000 ki shopping karte toh discount milta!)");
                }

        //Final Bill Printing
        System.out.println("\n--------------------");
        System.out.println("Total Item : " + itemCount);
        System.out.println("Total Bill : Rs"+totalBill );
        System.out.println("Discount : Rs"+discount);
        System.out.println("-----------------------");
        System.out.println("Final Pay Bill Rs"+ finalAmount);
        System.out.println("-----------------------");
        System.out.println("Thank You! Please Visit Again");
    }
}
