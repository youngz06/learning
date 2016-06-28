package inheritance;
/**
 * Created by youngz on 16-6-25.
 */
import sun.plugin.dom.exception.HierarchyRequestException;

import java.util.Date;
import java.util.DoubleSummaryStatistics;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Employee implements Comparable<Employee>,Cloneable{
    private String name;
    private double salary;
    private Date hireDay;

    //initial
    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay=calendar.getTime();
    }
    public Employee(){this.input();}

    public Employee(String n, double salary) {
        this.name = n;
        this.salary = salary;
    }
    //get method
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public Date getHireDay() {
        return hireDay;
    }
    //set method
    public void setName(String name){this.name=name;}
    public void setSalary(double salary){this.salary = salary;}
    public void setHireDay(Date hireDay){this.hireDay=hireDay;}

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent/100;
        salary += raise;
    }

    public String toString() {
        return  getClass().getName()
                +",Salary="+this.getSalary()
                +",hireDay="+this.getHireDay()

                +"]";
    }

    //Compare
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }

    //clone
    public Employee clone() throws CloneNotSupportedException {
        //call Object.clone
        Employee cloned = (Employee) super.clone();
        //clone mutable fields
        cloned.hireDay = (Date) hireDay.clone();

        return cloned;
    }
    //input method by myself
    public void input() {
        System.out.print("please input the name:");
        Scanner in = new Scanner(System.in);
        this.setName(in.next());
        System.out.print("please input the salary:");
        this.setSalary(in.nextInt());
       // System.out.print("pleae input the Date");
        //System.out.print(in.nextLine());
        //String mydate=in.next();
        System.out.println("year= " );
        int year =in.nextInt();
        System.out.print("month=");
        int month = in.nextInt();
        System.out.print("day=");
        int day = in.nextInt();
        GregorianCalendar cal =new GregorianCalendar (year, month, day);
       ;this.setHireDay(cal.getTime());
    }

}
