import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckEx {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("non_existent_file.txt"); // Compiler ko pata hai yahan gadbad ho sakti he
        } catch (FileNotFoundException e){
            System.out.println("File Nahi Mili!");
        }
    }
}