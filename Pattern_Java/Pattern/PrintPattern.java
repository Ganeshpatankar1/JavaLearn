package Pattern;

import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {
        //Hollow Rectangle
        System.out.print("Enter the No of A : ");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        System.out.print("Enter the No of B: ");
        int B = sc.nextInt();

        for (int i=1; i<=A; i++){
            for (int j=1; j<=B; j++){
                if (i==1 || j==1 || i==A || j==B){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
