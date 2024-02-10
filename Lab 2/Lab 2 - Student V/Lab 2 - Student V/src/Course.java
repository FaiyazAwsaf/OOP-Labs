public class Course {
    private String courseName;
    private int courseCode;

    public Course(String courseName, int courseCode){
        this.courseName = courseName;
        this.courseCode =  courseCode;
    }

    public void displayCourseInfo(){
        System.out.println("\nThe Course name is: " + courseName);
        System.out.println("The Course code is: " + courseCode + "\n");
    }
}
