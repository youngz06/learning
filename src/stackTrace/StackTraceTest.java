package stackTrace;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
/**
 * Created by youngz on 16-6-29.
 */
public class StackTraceTest {
    public static int factorial(int n) {
        System.out.println("Factorial(" + n + "):");
        Throwable t = new Throwable();
        StackTraceElement[] frams = t.getStackTrace();
        for (StackTraceElement f : frams) {
            System.out.println(n);
        }
        int r ;
        if (n <= 1) r = 1;
        else r = n*(factorial(n - 1));
        System.out.println("return " + r);
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = in.nextInt();
        factorial(n);
    }
}
