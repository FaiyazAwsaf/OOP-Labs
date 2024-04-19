package UniversityManagementSystem;
import java.util.Random;


public class Student extends Personnel {
    private String dept;
    private String programme;
    private String uniqueID;

    public Student(String name, String address, int birthYear, int joiningYear, String dept, String programme){
        super(name, address, birthYear, joiningYear );
        this.dept = dept;
        this.programme = programme;
        //uniqueID = generateID();

    }
    @Override
    public String generateID(){
        Random rand = new Random();
        int randomID  = rand.nextInt(9);
        return dept + birthYear + joiningYear + randomID;

    }

    @Override
    public void displayPersonnelinfo() {
        super.displayPersonnelinfo();
        System.out.println("Unique ID: " + generateID());
        System.out.println("Department: " + dept);
        System.out.println("Programme: " + programme);
    }
}
