public class Program {
    public static void main(String[] args) {
        //set the maximum possible score  in  the game to 500
        int maxScore = 500;

        //the actual score of the user
        int userScore  = 423;

        double percentage = (double) userScore / maxScore * 100.0d;

        System.out.println("User's Percentage is " + percentage);

        int x = 10;
        x+= 5;
        System.out.println(x);

        int a=3, b=2;
        System.out.println(b!=a);

        int password = 5;
        System.out.println(password >=4);
        System.out.println(password < 3);

        int result1 = 1 + 2 * 23;
        int result2 = (1 + 2) * 23;
        System.out.println(result1);
        System.out.println(result2);

    }
}
