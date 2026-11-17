class Student {

    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class Exercise1_ClassAndObject {

    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 101, 89.5);
        Student s2 = new Student("Priya", 102, 92.0);

        s1.displayDetails();
        System.out.println();

        s2.displayDetails();
    }
}