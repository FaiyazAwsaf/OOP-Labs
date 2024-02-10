package UniversityManagementSystem;

public class Personnel {
    public String name;
    public String address;
    //public int uniqueID;
    public int birthYear;
    public int joiningYear;

    public Personnel(String name, String address, int birthYear, int joiningYear) {
        this.name = name;
        this.address = address;
        this.birthYear = birthYear;
        this.joiningYear = joiningYear;

    }

    private int calculateAge() {

        return 2024 - birthYear; //use current year
    }

    public String generateID(){

        return "";

    }

    public void displayPersonnelinfo() {
        System.out.println("\nName: " + name);
        System.out.println("Address: " + address);
        //System.out.println("Unique ID: " + uniqueID);
        System.out.println("Age: " + calculateAge());
    }
}




