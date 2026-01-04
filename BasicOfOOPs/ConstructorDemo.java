class Building{
    Building(){
        System.out.println("1. First Building Structure (Parent Constructor)\n");
    }
    Building(String type){
        System.out.println("1." + type +" building Ready\n");
    }
}
class MyRoom extends Building{
    MyRoom(){
        System.out.println("2. Later My Room Color (Child Constructor)\n");
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        System.out.println("House Become To Ready\n");

        MyRoom r = new MyRoom();
        System.out.println("Home Is Ready");
    }
}
