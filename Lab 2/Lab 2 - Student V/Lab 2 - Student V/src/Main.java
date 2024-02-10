public class Main {
    public static void main(String[] args) {
        // Create an instance of the Student class
        Student student1 = new Student("Faiyaz Awsaf", 20, 220042111);

        // Create an instance of the Course class
        Course course1 = new Course("SWE", 4202);
        // Create an instance of the Grade class
        Grade grade1 = new Grade(10, 10, 20, 30);
        // Display information using methods

        student1.displayStudentInfo();
        course1.displayCourseInfo();
        grade1.displayStudentGrade();

     }
}
