package assignment3.problem9;



public class Test {
    public static void main(String[] args) {
        // Test Person class
        Person person = new Person("John Doe", "123 Main St");
        System.out.println("Person: " + person);
        person.setAddress("456 Oak Ave");
        System.out.println("Person: " + person);

        // Test Student class
        Student student = new Student("Jane Smith", "789 Elm St", "Computer Science", 2, 5000.0);
        System.out.println("\nStudent: " + student);
        student.setProgram("Information Technology");
        student.setYear(3);
        student.setFee(6000.0);
        System.out.println("Student: " + student);

        // Test Staff class
        Staff staff = new Staff("Bob Johnson", "321 Pine Rd", "University of Example", 50000.0);
        System.out.println("\nStaff: " + staff);
        staff.setSchool("College of Example");
        staff.setPay(55000.0);
        System.out.println("Staff: " + staff);
    }
}
