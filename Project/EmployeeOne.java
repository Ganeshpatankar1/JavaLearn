public class EmployeeOne {
    private String empName;
    private String designation;
    private double salary;

    public void setEmployeeDetails(String empName, String designation, double salary){
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
    }

    public void getEmployeeDetails(){
        System.out.println("========= Employee Details =========");
        System.out.println("Employee Name : " + empName);
        System.out.println("Designation : " + designation);
        System.out.println("Employee Salary : " + salary);
    }
}
