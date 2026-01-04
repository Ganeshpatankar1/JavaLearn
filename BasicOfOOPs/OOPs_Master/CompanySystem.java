package OOPs_Master;
/* 1.Abstraction
 We Hide Implementation Details
 We Define a template "Employee" But we don't implement work() here */

abstract class Employee{
    /* 2.ENCAPSULATION
    data is private. Direct Accesses is blocked
     */
    private String name;
    private int id;
    private double salary;

    //construct to initialize data
    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    //Getter and Setter (The only way to access private data)
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    //validation Logic Inside setter (Security)
    public void setSalary(double salary){
        if (salary > 0){
            this.salary = salary;
        } else {
            System.out.println("Error : salary cannot be negative");
        }
    }
    //Abstract Method: every child MUST define how they work
    abstract void worK();

    //3.Polymorphism (METHOD Overloading - Compile-Time)
    //same method name 'printInfo', but different
    public void printInfo(){
        System.out.println("ID:" + id + ", Name " + name);
    }
    public void printInfo(String message){
        System.out.println(message + "-> ID: " + id + " , Name : " + name);
    }
    //A normal method that can be overridden
    public double calculateBonus(){
        return this.salary * 10.0; //Default Bonus is 10%
    }

    abstract void work();
}
// 4.Inheritance
// 'Manger' IS-A 'Employee'. It takes all Properties of Employee
class Manager extends Employee{
    public Manager(String name, int id, double salary){
        super(name,id,salary);  //calls the Prent class Constructor
    }

    @Override
    void worK() {
    }
    //define the abstract method (abstract implement)

    @Override
    void work() {
        System.out.println(getName() + " is Managing the Team");
    }
}
class Developer extends Employee{

    public Developer(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    void worK() {
        System.out.println(getName() + " is writing Java Code.");
    }

    @Override
    void work() {
    }
    //Developer user Default bonus logic (10%), so we don't override calculateBonus here.
}
//  Main Class
public class CompanySystem {
    public static void main(String[] args) {
        //creating object (Polymorphism: Reference is employee, object is manager/dev)
        Employee emp1 = new Manager("Amit", 101, 80000);
        Employee emp2 = new Developer("Rahul", 102, 50000);

        System.out.println("----- Employee Details -----");

        // Testing polymorphism (Overriding)
        emp1.printInfo("Manager Details");
        emp2.printInfo();   //without message

        System.out.println("\n---- Work Stetus (Abstraction) ----");
        emp1.worK();    //Calls Manager works
        emp2.worK();    //Calls Developer works

        System.out.println("\n----- Bonus Calculation (Overriding)");
        System.out.println(emp1.getName() + " Bonus: " + emp1.calculateBonus()); //20% Logic
        System.out.println(emp2.getName() + " Bonus: " + emp2.calculateBonus()); //10% Logic

        System.out.println("\n---- Incapsulation Test ----");
        //emp1.salary = -5000; //error: This line would fail because salary is private
        emp1.setSalary(-500);   //validation by Setter (will print error)
        emp2.setSalary(90000);  //valid update
        System.out.println("New Salary of Amit: " + emp1.getSalary());
    }
}
