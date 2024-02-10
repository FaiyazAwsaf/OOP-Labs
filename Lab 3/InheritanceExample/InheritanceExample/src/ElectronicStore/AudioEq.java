package ElectronicStore;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AudioEq {
    Equipments eq1;
    String category;

    public AudioEq(Equipments eq1, String category) {
        this.eq1 = eq1;
        this.category = category;
    }

    public void displayInfo() {
        eq1.displayInfo();
        System.out.println("Type: " + category);

    }

}
