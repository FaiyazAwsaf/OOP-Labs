package UniversityManagementSystem;

public class Department {
    private String name;
    private int id;
    private int studentNumbers;
    private int facultyMembers;

    public Department(String name, int id,int studentNumbers,int facultyMembers){
        this.name = name;
        this.id = id;
        this.studentNumbers = studentNumbers;
        this.facultyMembers = facultyMembers;
    }
    public void displayInfo(){
        System.out.println("Department info:");
        System.out.println("Name: " + name);
        System.out.println("ID:" + id);
        System.out.println("Number of Students: " + studentNumbers);
        System.out.println("Faculty Members: " + facultyMembers);


    }
}
