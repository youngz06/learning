package abstractClasses;
import sun.util.calendar.Gregorian;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by youngz on 16-6-25
 */
public class Employee extends Person {
    private double salary;
    private Date hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        super(n);
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    public Date getSalary() {
        return hireDay;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getDescription()
    {
        return String.format("an employee with a salary of $%.2f",salary);
    }

    public void raseSalary(double byPercent) {
        double raise = salary *byPercent/100;
    }
}

