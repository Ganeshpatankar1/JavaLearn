import java.util.Random;
import java.util.Scanner;

public class NumGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int computerNumber = r.nextInt(100)+1;

        int koshish = 5;
        int guess;

        System.out.println("=== NUMBER GUESSING GAME (HARD MODE) ===");
        System.out.println("Maine 1 se 100 ke beech ek number socha hai.");
        System.out.println("Jeetne ke liye aapke paas sirf 5 chances hain.\n");

        while (koshish > 0){
            System.out.print("Guess The Number (Remaining Chance : " + koshish + "): ");
            guess = sc.nextInt();

            //logic check
            if (guess == computerNumber){
                System.out.println("\n🎉 BILLIANT! Aapne sahi pakda! Number tha: " + computerNumber);
                break; // Game se bahar niklo
                
            } else if (guess > computerNumber) {
                System.out.println("❌ Galat! Mera number isse CHHOTA (Smaller) hai.");
            }
            else {
                System.out.println("❌ Galat! Mera number isse BADA (Greater) hai.");
            }
            koshish --;
            if (koshish == 0){
                System.out.println("\n😔 Game Over! Aap haar gaye.");
                System.out.println("Sahi Number tha: " + computerNumber);
            }
        }
            sc.close();
    }
}
