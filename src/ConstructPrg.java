class Student{
    int id;
    int age;
    Student(int id, int aage){
        this.id = id;
        this.age = aage;
        System.out.println("Parameterize Constructor");
    }
    Student(int id, String name, int age){
        System.out.println("Parameterize Constructor 2");
    }
    Student(){
        System.out.println("Default Constructor");
    }

}
public class ConstructPrg {
    public static void main(String[] args) {
        Student sd = new Student(2,"Gaensh",12);

    }
}
