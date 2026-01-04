package JavaBasic;

public class Concept {
    public static void main(String[] args) {
        System.out.println("Entry Controlled Loop (for and While\n");
        for (int i=0; i<=10; i++){
            if (i == 3){
                System.out.println("\nSkipped 3\n");
                continue;
            }
            if (i == 8){
                System.out.println("\nStoping at 8\n");
                break;
            }
            if (i % 2 == 0){
                System.out.println(i + " isEven");
            } else {
                System.out.println(i + " isOdd\n");
            }
        }
        System.out.println("Exit Controlled Loop\n");
        int k=100;
        do {
            System.out.println("Me To ek hi Bar Chalunga Value " + k +"\n");
            k++;
        } while (k < 10);
        System.out.println("Switch case with fall through\n");
        int option = 2;
        switch (option){
            case 1 :
                System.out.println("Option 1");
                break;
            case 2 :
                System.out.println("Option 2");
                break;
            case 3 :
                System.out.println("Option 3");
                break;
            default:
                System.out.println("Error");
        }
    }
}
