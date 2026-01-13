import java.util.Random;
import java.util.Scanner;

public class PassGen2 {
    public static void main(String[] args) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";

//        String combination = upper + lower + num + specialChar;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password Length : ");
        int len = sc.nextInt();
        char[] password = new char[len];

        Random r = new Random();

        for (int i=0; i < len; i++){
            password[i] = chars.charAt(r.nextInt(chars.length()));
        }
        System.out.println("Generated Password " + new String(password));
    }
}
