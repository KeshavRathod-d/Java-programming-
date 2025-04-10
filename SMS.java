import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private String registrationNumber;
    private String dob;
    private int age;
    private double cgpa;

    public Student(String name, String registrationNumber, String dob, int age, double cgpa) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.dob = dob;
        this.age = age;
        this.cgpa = cgpa;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0 && cgpa <= 10) {
            this.cgpa = cgpa;
        } else {
            throw new IllegalArgumentException("CGPA must be between 0 and 10");
        }
    }

    
    public String toString() {
        return name + "\t" + registrationNumber + "\t" + dob + "\t" + age + "\t" + cgpa;
    }

    public String getData() {
        return "NAME: " + name + 
               "\nRegistration Number: " + registrationNumber + 
               "\nDOB: " + dob + 
               "\nAGE: " + age + 
               "\nCGPA: " + cgpa;
    }
}

public class SMS {
    private Scanner scanner;
    private ArrayList<Student> students;

    public SMS() {
        scanner = new Scanner(System.in);
        students = new ArrayList<>();
    }

    public static void main(String[] args) {
        SMS obj = new SMS();
        obj.run();
    }

    void run() {
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student Data");
            System.out.println("3. View All Students");
            System.out.println("4. Search Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int num = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (num) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    deleteData();
                    break;
                case 3:
                    viewAllStudents();
                    break;
                case 4:
                    searchStudent();
                    break;
                case 5:
                    System.out.println("Exiting Student Management System...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    private void addStudent() {
        System.out.println("\nAdd New Student");
        System.out.print("Enter Student Full Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Registration Number: ");
        String regNum = scanner.nextLine();
        
        System.out.print("Enter Date of Birth (DD/MM/YYYY): ");
        String dob = scanner.nextLine();
        
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter CGPA (0-10): ");
        double cgpa = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Student student = new Student(name, regNum, dob, age, cgpa);
        students.add(student);
        System.out.println("Student data added successfully!");
    }

    private void deleteData() {
        System.out.print("\nEnter Registration Number to delete: ");
        String regNum = scanner.nextLine();
        
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRegistrationNumber().equals(regNum)) {
                students.remove(i);
                System.out.println("Student data deleted successfully!");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Student with Registration Number " + regNum + " not found.");
        }
    }

    private void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
        
        System.out.println("\nList of All Students");
        System.out.println("Name\tRegNo\tDOB\tAge\tCGPA");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void searchStudent() {
        System.out.print("\nEnter Registration Number to search: ");
        String regNum = scanner.nextLine();
        
        boolean found = false;
        for (Student student : students) {
            if (student.getRegistrationNumber().equals(regNum)) {
                System.out.println("\nStudent Found:");
                System.out.println(student.getData());
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Student with Registration Number " + regNum + " not found.");
        }
    }
}
