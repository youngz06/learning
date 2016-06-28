package inheritance;
/**
 * Created by youngz on 16-6-25.
 */

public class ManagerTest {
    public static void main(String[] args) {
        //construct manager object
        Manager boss = new Manager("Carl Cracker", 80000, 1982, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        //fill the staff array with manager and Employee objects
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);
        //output information
        for (Employee e : staff) {
            System.out.println("name = "+e.getName()+",salary="+e.getSalary());
        }
    }
}
