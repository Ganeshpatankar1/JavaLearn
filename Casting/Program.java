public class Program {
    public static void main(String[] args) {
        //set the maximum possible score  in  the game to 500
        int maxScore = 500;

        //the actual score of the user
        int userScore  = 423;

        double percentage = (double) userScore / maxScore * 100.0d;

        System.out.println("User's Percentage is " + percentage);

    }
}
