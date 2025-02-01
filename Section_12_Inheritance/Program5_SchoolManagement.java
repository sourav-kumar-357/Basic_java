package Section_12_Inheritance;

// Base Class: Person
class Person {
    String name;
    int age;

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived Class: Student
class Student extends Person {
    String grade;
    int studentId;

    // Parameterized Constructor
    public Student(String name, int age, String grade, int studentId) {
        super(name, age); // Call the constructor of the base class
        this.grade = grade;
        this.studentId = studentId;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the base class method
        System.out.println("Grade: " + grade);
        System.out.println("Student ID: " + studentId);
    }
}

// Derived Class: Teacher
class Teacher extends Person {
    String subject;
    double salary;

    // Parameterized Constructor
    public Teacher(String name, int age, String subject, double salary) {
        super(name, age); // Call the constructor of the base class
        this.subject = subject;
        this.salary = salary;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the base class method
        System.out.println("Subject: " + subject);
        System.out.println("Salary: $" + salary);
    }
}

// Main Class: SchoolManagement
public class Program5_SchoolManagement {
    public static void main(String[] args) {
        // Create Student object
        Student student = new Student("Alice", 16, "10th Grade", 101);

        // Create Teacher object
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics", 55000.0);

        // Display details of Student
        System.out.println("Student Details:");
        student.displayDetails();

        System.out.println("\nTeacher Details:");
        // Display details of Teacher
        teacher.displayDetails();
    }
}
