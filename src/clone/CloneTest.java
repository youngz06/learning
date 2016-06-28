package clone;
import  inheritance.Employee;
import java.util.GregorianCalendar;


/**
 * Created by youngz on 16-6-28.
 */
public class CloneTest {
    public static void main(String[] args) {
        try {
            Employee original = new Employee("John q.Public", 5000);
            GregorianCalendar cal1 =new GregorianCalendar (2000,1,1);
            GregorianCalendar cal2 =new GregorianCalendar (2002,12,1);
            original.setHireDay(cal1.getTime());
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(cal2.getTime());
            System.out.println("original = " + original);
            System.out.println("copy = " + copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}