import java.util.*;
class Employee {
    int empId;
    String empName;
    String empAddress;
    String empDesignation;
    String empDepartment;
    String empPhoneNo;
    double empBasicPay;
    double empHRA;
    double empDA;
    double empTA;
    double empSalary;
    public Employee(int empId, String empName, String empAddress, String empDesignation, String empDepartment, String empPhoneNo, double empBasicPay) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empDesignation = empDesignation;
        this.empDepartment = empDepartment;
        this.empPhoneNo = empPhoneNo;
        this.empBasicPay = empBasicPay;
        calculateSalary();
    }
    private void calculateSalary() {
        this.empHRA = 0.1 * empBasicPay; // HRA is 10% of Basic Pay
        this.empDA = 0.02 * empBasicPay; // DA is 2% of Basic Pay
        this.empTA = 0.02 * empBasicPay; // TA is 2% of Basic Pay
        this.empSalary = empBasicPay + empHRA + empDA + empTA; // Total Salary
    }
    @Override
    public String toString() {
        return "Employee ID: " + empId + ", Name: " + empName + ", Department: " + empDepartment + ", Total Salary: " + empSalary;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Employee Name: ");
            String empName = scanner.nextLine();
            System.out.print("Employee Address: ");
            String empAddress = scanner.nextLine();
            System.out.print("Employee Designation: ");
            String empDesignation = scanner.nextLine();
            System.out.print("Employee Department: ");
            String empDepartment = scanner.nextLine();
            System.out.print("Employee Phone No: ");
            String empPhoneNo = scanner.nextLine();
            System.out.print("Employee Basic Pay: ");
            double empBasicPay = scanner.nextDouble();
            scanner.nextLine(); 
            employees.add(new Employee(empId, empName, empAddress, empDesignation, empDepartment, empPhoneNo, empBasicPay));
        }
        Map<String, Employee> highestSalaryByDept = new HashMap<>();
        for (Employee emp : employees) {
            String dept = emp.empDepartment;
            if (!highestSalaryByDept.containsKey(dept) || emp.empSalary > highestSalaryByDept.get(dept).empSalary) {
                highestSalaryByDept.put(dept, emp);
            }
        }
        for (Map.Entry<String, Employee> entry : highestSalaryByDept.entrySet()) {
            System.out.println("Department: " + entry.getKey() + ", Highest Salary Employee: " + entry.getValue());
        }
        scanner.close();
    }
}
