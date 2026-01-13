import java.util.Random;
import java.util.Scanner;

public class PassGen {
    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String num = "1234567890";
        String specialChar = "<,.>/;':[]{}=-`~|!@#$%^&*()_+";

        String combination = upper + lower + num + specialChar;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password Length : ");
        int len = sc.nextInt();
        char[] password = new char[len];

        Random r = new Random();

        for (int i=0; i < len; i++){
            password[i] = combination.charAt(r.nextInt(combination.length()));
        }
        System.out.println("Generated Password " + new String(password));
    }
}
