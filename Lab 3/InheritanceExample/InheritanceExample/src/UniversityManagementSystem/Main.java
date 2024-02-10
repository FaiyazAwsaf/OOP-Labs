package UniversityManagementSystem;

public class Main {
    public static void main(String [] args) {
        Student student1 = new Student("Awsaf", "Gazipur", 2003, 2023, "CSE", "SWE" );
        student1.displayPersonnelinfo();

        Faculty faculty1 = new Faculty("Farzana Mam", "Gazipur", 2000, 2022, "CSE", "Lecturer", 323);
        faculty1.displayPersonnelinfo();

        GeneralEmployee emp1 = new GeneralEmployee("Rahim", "Gazipur", 1973, 2014,223, "Medical Staff" );
        emp1.displayPersonnelinfo();

        Department dep1 = new Department("CSE", 34, 135, 35);
        dep1.displayInfo();
    }

}
