package Assessment;

class studentoops {
        String name;
        int rollNumber;
        float marks;

        studentoops(String name, int rollNumber, float marks) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------------");
    }
}
 public class student{
    public static void main(String[] args) {
        studentoops student1 = new studentoops("Alice", 101, 87.5f);
        studentoops student2 = new studentoops("Bob", 102, 91.0f);
        student1.displayDetails();
        student2.displayDetails();

        System.out.println("Student 1 Details:");
        student1.displayDetails();

        System.out.println("Student 2 Details:");
        student2.displayDetails();
    }
}
