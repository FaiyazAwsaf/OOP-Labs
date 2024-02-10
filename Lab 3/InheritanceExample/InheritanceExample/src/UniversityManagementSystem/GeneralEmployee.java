package UniversityManagementSystem;
import java.util.Random;

public class GeneralEmployee extends Personnel{

    private int room;
    private String designation;

    public GeneralEmployee(String name, String address, int birthYear, int joiningYear, int room, String designation) {
        super(name, address, birthYear, joiningYear);
        this.room = room;
        this.designation = designation;
    }

    @Override
    public String  generateID() {
        Random rand = new Random();
        int low = 5;
        int high = 20;
        int randomID = rand.nextInt(high - low) + low;


        return String.valueOf(birthYear) + joiningYear + randomID;
    }

    @Override
    public void displayPersonnelinfo() {
        super.displayPersonnelinfo();
        System.out.println("Unique ID:" + generateID());
        System.out.println("Room No.: " + room);
        System.out.println("Designation: " + designation);
    }
}
