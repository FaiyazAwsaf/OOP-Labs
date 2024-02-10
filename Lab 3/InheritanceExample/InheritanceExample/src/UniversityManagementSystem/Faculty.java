package UniversityManagementSystem;
import java.util.Random;

public class Faculty extends Personnel {
    private String dept;
    private int room;
    private String designation;

    public Faculty(String name, String address, int birthYear, int joiningYear, String dept, String designation, int room) {
        super(name, address, birthYear, joiningYear);
        this.dept = dept;
        this.designation = designation;
        this.room = room;
    }
    @Override
    public String  generateID() {
        Random rand = new Random();
        int low = 10;
        int high = 20;
        int randomID = rand.nextInt(high - low) + low;
        return dept + birthYear + joiningYear + randomID;
    }

    @Override
    public void displayPersonnelinfo() {
        super.displayPersonnelinfo();
        System.out.println("Unique ID: " + generateID());
        System.out.println("Department: " + dept);
        System.out.println("Designation: " + designation);
        System.out.println("Room No.: " + room);
    }
}
