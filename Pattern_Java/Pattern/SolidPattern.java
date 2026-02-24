package Pattern;

import java.util.Scanner;

public class SolidPattern {
    public static void main(String[] args) {
        System.out.print("Enter the No of A : ");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        System.out.print("Enter the No of B: ");
        int B = sc.nextInt();

        for (int i =1; i<= A; i++){
            for (int j=1; j<=B; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
