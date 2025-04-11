package Experiment5;

// Base class Person
class Person {
    protected String name;
    protected int age;
    protected String address;
    
    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Unknown";
    }
    
    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

// Staff class extending Person
class Staff extends Person {
    protected String staffId;
    protected String department;
    
    // Default constructor
    public Staff() {
        super();
        this.staffId = "Unknown";
        this.department = "Unknown";
    }
    
    // Parameterized constructor
    public Staff(String name, int age, String address, String staffId, String department) {
        super(name, age, address);
        this.staffId = staffId;
        this.department = department;
    }
    
    // Override displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }
}

// Professor class extending Staff
class Professor extends Staff {
    private String specialization;
    
    // Default constructor
    public Professor() {
        super();
        this.specialization = "Unknown";
    }
    
    // Parameterized constructor
    public Professor(String name, int age, String address, String staffId,
                    String department, String specialization) {
        super(name, age, address, staffId, department);
        this.specialization = specialization;
    }
    
    // Method to conduct lecture
    public void conductLecture() {
        System.out.println("Professor " + name + " is conducting a lecture in " + specialization);
    }
    
    // Override displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}

// Student class extending Person
class Student extends Person {
    protected String studentId;
    protected String course;
    
    // Default constructor
    public Student() {
        super();
        this.studentId = "Unknown";
        this.course = "Unknown";
    }
    
    // Parameterized constructor
    public Student(String name, int age, String address, String studentId, String course) {
        super(name, age, address);
        this.studentId = studentId;
        this.course = course;
    }
    
    // Override displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}

// GraduateStudent class extending Student
class GraduateStudent extends Student {
    private String researchTopic;
    
    // Default constructor
    public GraduateStudent() {
        super();
        this.researchTopic = "Unknown";
    }
    
    // Parameterized constructor
    public GraduateStudent(String name, int age, String address, String studentId,
                          String course, String researchTopic) {
        super(name, age, address, studentId, course);
        this.researchTopic = researchTopic;
    }
    
    // Method to submit thesis
    public void submitThesis() {
        System.out.println("Graduate Student " + name + " is submitting thesis on " + researchTopic);
    }
    
    // Override displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Research Topic: " + researchTopic);
    }
}

// Main class to test the university system
public class UniversitySystem {
    public static void main(String[] args) {
        System.out.println("Testing University Personnel System\n");
        
        // Create an array of Person objects
        Person[] universityPersonnel = new Person[2];
        
        // Initialize with Professor and GraduateStudent instances
        universityPersonnel[0] = new Professor("Dr. Smith", 45, "123 Academic Ave",
                                              "PROF001", "Computer Science", "Artificial Intelligence");
        universityPersonnel[1] = new GraduateStudent("Jane Doe", 25, "456 Research Hall",
                                                    "GS001", "Computer Science", "Machine Learning");
        
        // Demonstrate polymorphism
        for (Person person : universityPersonnel) {
            System.out.println("\nDetails for University Personnel:");
            person.displayDetails();
            
            // Use instanceof to call specific methods
            if (person instanceof Professor) {
                ((Professor) person).conductLecture();
            } else if (person instanceof GraduateStudent) {
                ((GraduateStudent) person).submitThesis();
            }
        }
    }
}