class ParentClass{
    void Display(){
        System.out.println("Parent Class Function");
    }
}
class ChildClass extends ParentClass{
    void Show(){
        System.out.println("Child Class Function");
    }
}
public class InheritancePrg {
    public static void main(String[] args) {
    ChildClass Chid = new ChildClass();
    Chid.Show();
    Chid.Display();

    }
}
