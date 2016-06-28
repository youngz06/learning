package inheritance;
import java.util.*;
/**
 * Created by youngz on 16-6-27.
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Yangzhao",35000);
        staff[1] = new Employee("YU", 24123);
        staff[2] = new Employee("saf",32412);

        Arrays.sort(staff);

        for (Employee e : staff) {
            System.out.println("name = " + e.getName() + ",salary = " + e.getSalary());
        }
    }
}

