package Mytest;
import sun.util.resources.cldr.en.CalendarData_en_UM;

import java.lang.reflect.Method;
import  java.util.*;
/**
 * Created by youngz on 16-6-25.
 */
public class enumtest {
    public static void main(String[] args){
      /*  Scanner in = new Scanner(System.in);
        System.out.print("Enter a size:(Small,Medium,Large,Ex_large)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE) {
            System.out.println("Good job--you paid attention to the_.");
        }
    }*/
        Method m[]=String.class.getDeclaredMethods();
        for (int i = 0;i<m.length;i++ ) {
            System.out.println(m[i].toString());
        }
        }
}

enum Size{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
    private Size(String abbreviation){
        this.abbreviation = abbreviation;}
    public String getAbbreviation(){return abbreviation;}
    private String abbreviation;
}
