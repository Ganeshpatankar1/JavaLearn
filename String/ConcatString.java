package String;

public class ConcatString {
    public static void main(String[] args) {
        String fName = "Ganesh";
        String sName = "Patankar";
        int age = 23;

        System.out.println("Concatenation " + fName + " " + sName);

        System.out.println("Concatenation " + fName + " " + sName + " And age Is " + age);

        //Using Concat Method
        System.out.println(fName.concat(sName));
        String a = "Java";
        String b = "is";
        String c = "fun";
        String result = a.concat(b).concat(c);
        System.out.println(result);

        //Number Concat
        int x = 3;
        int y = 4;
        System.out.println(x+y);

        String first = "20", Second = "34";
        String merge = first + Second;  // merge will be 2034 (a String)

        //Special Character Done
        String text = "Hello my Name Is \"Genesh\" From Nippani";
        String textTwo = "It\'s alright";
        String msg = "It is \\ Backlash";
        System.out.println(text);
        System.out.println(textTwo);
        System.out.println(msg);


    }
}
