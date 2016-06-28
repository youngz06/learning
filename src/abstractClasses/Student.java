package abstractClasses;

/**
 * Created by youngz on 16-6-25.
 */
public class Student extends Person {
    private String major;

    public Student(String n, String m) {
        super(n);
        major = m;
    }

    public String getDescription() {
        return "a student majoring in "+major;
    }
}
