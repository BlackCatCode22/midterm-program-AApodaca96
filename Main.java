import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome to Angelo's Zoo Practice!");

        // Create some Student objects
        Student student1 = new Student("John", "Doe", 3.5);
        Student student2 = new Student("Jane", "Doe", 3.7);
        Student student3 = new Student("Jim", "Taylor", 2.9);

        ArrayList<Student> students = new ArrayList<>();

        // Add the students to the ArrayList
        students.add(student1);
        students.add(student2);
        students.add(student3);

        // Output the student names
        for (Student student : students) {
            System.out.println("Student name is: " + student.name);

        }

        System.out.println();

        myNewStudent.name = "First Last";


        /* // Create an animal
        Animal myAnimal = new Animal();

        myAnimal.name = "Banzai";

        // Create a new student
        Student myNewStudent = new Student();

        myNewStudent.name = "First Last";
        System.out.println("\n The new student's name is: " + myNewStudent.name);
        */





    }
}