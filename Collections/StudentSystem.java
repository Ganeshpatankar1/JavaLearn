import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class StudentSystem {
    public static void main(String[] args) {
        //List Sirf Student Ke nam Store Karne ke liye
        ArrayList<String> studentName = new ArrayList<String>();
        studentName.add("Rahul");
        studentName.add("Priya");
        studentName.add("Amit");
        studentName.add("Sneha");

        //List ko sort kar dete he
        Collections.sort(studentName);
        System.out.println("\n Class Ke Student " + studentName);

        //Map Naam ke Sath Marks Store Karne Ke Liye
        HashMap<String, Integer> marksCard = new HashMap<String, Integer>();
        marksCard.put("Rahul", 45);
        marksCard.put("Priya", 92);
        marksCard.put("Amit", 25);
        marksCard.put("Sneha", 88);

        System.out.println("\n Result Anyalis Suru");
        //LOGiC har student ka result check karenge
        //hum List (studentName) pe loop lagayenge
        for (String naam : studentName){
            int mark = marksCard.get(naam);
            if (mark >= 35){
                System.out.println(naam + " Pass Ho gaya Marks : " + mark);
            } else {
                System.out.println(naam + " Fail Ho gaya ;( Marks : " + mark);
            }
        }
        //Topper Finde (Thoda Advance Logic)
        //hum Collection.max() use karenge value nikal ne ke liye
        int maxMarks = Collections.max(marksCard.values());
        System.out.println("\n Sabse jyada Marks Value " + maxMarks);

        //ab pata karte he ki marks he
        for (String naam : marksCard.keySet()){
            if (marksCard.get(naam) == maxMarks){
                System.out.println("🏆 TOPPER HAI: " + naam);
            }
        }

    }
}
