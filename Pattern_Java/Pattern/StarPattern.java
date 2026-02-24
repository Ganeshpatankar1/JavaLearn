package Pattern;

public class StarPattern {
    public static void main(String[] args) {
    /*  Inverted_Half_Pyramid
    Rotated by 180deg   */
        int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
