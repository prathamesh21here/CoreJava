public class EmployeeDetails {

    int employeeId;
    String employeeName;
    String department;
    String designation;
    double salary;

    public EmployeeDetails(int employeeID, String employeeName, String department, String designation, double salary) {
        this.employeeId = employeeID;
        this.employeeName = employeeName;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("---------------------------");
        System.out.println("Employee Details");
        System.out.println("---------------------------");
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Department    : " + department);
        System.out.println("Designation   : " + designation);
        System.out.println("Salary        : " + salary);
        System.out.println("---------------------------");
    }

}

class EmployeeDetailsDemo {
    public static void main(String[] args) {
        EmployeeDetails employee = new EmployeeDetails(101, "John Doe", "IT", "Software Engineer", 75000.0);
        employee.displayDetails();

        // Update details
        EmployeeDetails employee2 = new EmployeeDetails(102, "Jane Smith", "HR", "HR Manager", 85000.0);
        employee2.displayDetails();
    }
}
