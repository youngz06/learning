package Mytest;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.*;
import inheritance.Employee;
/**
 * Created by youngz on 16-6-25.
 */
public class test {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int i=1;
        Employee oneemp = new Employee("yangzhoa", 50000, 1994, 12, 1);
        test mytest=new test();
        String information=mytest.toString(oneemp);
        //System.out.println(information);

        //After defined the toString method
        System.out.println("the information:"+oneemp);
        System.out.print("input the you want to add:");
        int arrlistlong=in.nextInt();
        ArrayList<Employee> stafflist = new ArrayList<>(arrlistlong);
        while (i <= arrlistlong) {
            stafflist.add(new Employee());
            i=i+1;
        }
        for(Employee e:stafflist)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());

    }
    public String toString(Employee employee) {
        return  getClass().getName()
                +",Salary="+employee.getSalary()
                +",hireDay="+employee.getHireDay()
                +"]";
    }


}

