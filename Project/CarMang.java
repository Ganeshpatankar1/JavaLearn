import java.util.Scanner;

public class CarMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Showroom showroom = new Showroom();
        CarOne car = new CarOne();
        EmployeeOne employee = new EmployeeOne();

        int choice;
        do {
            System.out.println("============== Car Showroom Management System ==============");
            System.out.print("1. Add Showroom Details               ");
            System.out.print("2. Add Car Details                    ");
            System.out.print("3. Add Employee Details             \n");
            System.out.print("4. Get Showroom Details               ");
            System.out.print( "5. Get Car Details               ");
            System.out.print("6. Get Employee Details               \n");
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();

            switch (choice){
                case 1: sc.nextLine();
                    System.out.print("Enter Showroom Name : ");
                    String sName = sc.nextLine();

                    System.out.print("Enter Location :");
                    String loc = sc.nextLine();

                    showroom.setShowroomDetails(sName,loc);
                    break;

                case 2: sc.nextLine();
                    System.out.print("Enter Car Name : ");
                    String cName = sc.nextLine();

                    System.out.print("Enter Car Model : ");
                    String model = sc.nextLine();

                    System.out.print("Enter Car Price : ");
                    double price = sc.nextDouble();

                    car.setCarDetails(cName, model, price);
                    break;

                case 3: sc.nextLine();
                    System.out.print("Enter Employee Name : ");
                    String emp = sc.nextLine();

                    System.out.print("Enter Designation : ");
                    String desg = sc.nextLine();

                    System.out.print("Enter Salary : ");
                    double salary = sc.nextDouble();

                    employee.setEmployeeDetails(emp, desg, salary);
                    break;

                case 4:
                    showroom.getShowroomDetails();
                    break;

                case 5: car.getCarDetails();
                break;

                case 6: employee.getEmployeeDetails();
                break;

                case 0 :
                    System.out.println("===== Exiting ThankYou.... =====");
                    break;

                default:
                    System.out.println("Invalid Choose! Try Again");
            }
        } while (choice!=0);
        sc.close();
    }
}
