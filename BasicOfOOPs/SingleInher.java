class Employee{
    void salarye(){
        System.out.println("Salary = 70000");
    }
}
class Hr extends EmployeeOne {
    void bonus(){
        System.out.println("Bonus = 20000");
    }
}
public class SingleInher {
    public static void main(String[] args) {
        Hr h = new Hr();
//        h.salarye();
        h.bonus();
    }
}
