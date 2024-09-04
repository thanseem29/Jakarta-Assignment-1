import java.util.Scanner;
class Student {
    private String name;
    private String regNo;
    private String dept;
    private int year;
    private int semester;
    private int mark1, mark2, mark3, mark4, mark5, mark6;
    private int total;
    private float average;
    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Registration No.: ");
        regNo = sc.nextLine();
        System.out.print("Enter Department: ");
        dept = sc.nextLine();
        System.out.print("Enter Year: ");
        year = sc.nextInt();
        System.out.print("Enter Semester: ");
        semester = sc.nextInt();
        System.out.print("Enter Mark1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter Mark2: ");
        mark2 = sc.nextInt();
        System.out.print("Enter Mark3: ");
        mark3 = sc.nextInt();
        System.out.print("Enter Mark4: ");
        mark4 = sc.nextInt();
        System.out.print("Enter Mark5: ");
        mark5 = sc.nextInt();
        System.out.print("Enter Mark6: ");
        mark6 = sc.nextInt();
        total = mark1 + mark2 + mark3 + mark4 + mark5 + mark6;
        average = total / 6.0f;
        sc.close();
    }
    public void display() {
        System.out.println("\n--- Student Mark Statement ---");
        System.out.println("Student Name: " + name);
        System.out.println("Registration No.: " + regNo);
        System.out.println("Department: " + dept);
        System.out.println("Year: " + year);
        System.out.println("Semester: " + semester);
        System.out.println("Marks: ");
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
        System.out.println("Mark3: " + mark3);
        System.out.println("Mark4: " + mark4);
        System.out.println("Mark5: " + mark5);
        System.out.println("Mark6: " + mark6);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + average + "%");
    }
}
public class StudentMarks {
    public static void main(String[] args) {
        Student student = new Student();
        student.getDetails();
        student.display();
    }
}
