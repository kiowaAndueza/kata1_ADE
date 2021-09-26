package kata1_ade;
import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String name;
    private final LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getAge(){
        LocalDate now = LocalDate.now();
        Period dif = Period.between(birthdate, now);
        return dif.getYears();
        
    }
    
    
    
}
