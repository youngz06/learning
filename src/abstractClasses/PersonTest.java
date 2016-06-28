package abstractClasses;

/**
 * Created by youngz on 16-6-25.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("yangzhao", 50000, 1994,12, 1);
        people[1] = new Employee("Yuxingxing", 50000, 1996, 06, 1);

        for (Person p : people) {
            System.out.println(p.getName()+","+p.getDescription());
        }
    }
}