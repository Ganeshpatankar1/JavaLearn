public class UncheckEx {
    public static void main(String[] args) {
        String name = null;
        //Compiler ko pata nahi ki name me 'null' he, runtime me pata chalega
        System.out.println(name.length());
    }
}
