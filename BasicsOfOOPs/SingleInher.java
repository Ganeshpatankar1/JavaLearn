class Employee{
    void salary(){
        System.out.println("Salary = 70000");
    }
}
class Hr extends  Employee{
    void bonus(){
        System.out.println("Bonus = 20000");
    }
}
public class SingleInher {
    public static void main(String[] args) {
        Hr h = new Hr();
        h.salary();
        h.bonus();
    }
}
