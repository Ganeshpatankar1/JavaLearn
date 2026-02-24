package Pattern;

public class NoPyramid {
    public static void main(String[] args) {
        //Inverted Number Pyramid
        int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
