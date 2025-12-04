import java.io.FileReader;
import java.io.IOException;

public class ThrowsPrg {
        void readFile() throws IOException{
        FileReader fr = new FileReader("data.txt");
        }
        void check() throws ArithmeticException, NullPointerException{
            int a = 10/0;   //ArithmeticException
        }

    public static void main(String[] args) {

            ThrowsPrg tr = new ThrowsPrg();
            try{
                tr.check();
            } catch (Exception e) {
                System.out.println("Handle : " + e);
            }
            //Read File Exceptions
            try{
                tr.readFile(); //handle here
            } catch (IOException e ){
                System.out.println("File not Found");
            }
    }
}
