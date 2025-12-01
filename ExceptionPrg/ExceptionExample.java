public class ExceptionExample {
    public static void main(String[] args) {

        // Step 1: try block - Woh code jismein problem aa sakti hai
        try {
            System.out.println("Program shuru hua.");
            int result = 10 / 0; // Yahan problem aayegi (Exception)
            System.out.println("Result hai: " + result); // Yeh line kabhi nahi chalegi
        }

        // Step 2: catch block - Jab 'try' block mein problem aati hai
        catch (ArithmeticException e) {
            // Humne problem (Exception) ko pakad liya
            System.out.println("Gadbad ho gayi! Aap zero se divide nahi kar sakte.");
            // e.printStackTrace(); // Yeh line exception ki poori technical detail print karti hai
        }

        // Step 3: finally block - Yeh hamesha chalega, chahe problem aaye ya na aaye
        finally {
            System.out.println("Program khatam hua. Yeh hissa hamesha chalega.");
        }
    }
}