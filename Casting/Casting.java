public class Casting {
    public static void main(String[] args) {
        //Widening Casting
            //smaller type into a larger type
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        System.out.println("==================");

        //Narrowing Casting
            //large type into a smaller but loss data
        double mydouble = 9.23d;
        int myint = (int) mydouble;  //manual casting double to int
        System.out.println(mydouble);
        System.out.println(myint);
    }
}
