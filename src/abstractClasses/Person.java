package abstractClasses;

/**
 * Created by youngz on 16-6-25.
 */
public abstract class Person {
    public abstract String getDescription();
    private String name;

    public Person(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
}
