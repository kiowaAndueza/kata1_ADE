package kata1_ade;
import java.time.LocalDate;
public class Kata1_ADE {

    public static void main(String[] args) {

        
        LocalDate birthdate = LocalDate.of(2018, 10, 30);

        
        Person person = new Person("Antonio", birthdate);
        
        System.out.println(person.getName() + " tiene " + person.getAge() + ".");
        
    }
    
}