package pair1;
import java.util.*;
/**
 * Created by youngz on 16-6-30.
 */
public class PairTest {
    public static void main(String[] args) {
        GregorianCalendar[] birthday = {
                new GregorianCalendar(1906, Calendar.DECEMBER, 9),
                new GregorianCalendar(1815, Calendar.DECEMBER, 10),
                new GregorianCalendar(1903, Calendar.DECEMBER, 3),
                new GregorianCalendar(1815, Calendar.JUNE, 22),
        };
        Pair<GregorianCalendar> mm = ArrayAlg2.minmax(birthday);
        System.out.println("min = " + mm.getFirst().getTime());
        System.out.println("max = " + mm.getSecond().getTime());
    }
}

class ArrayAlg2{
    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if(a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[1];
        for(int i = 1; i<a.length;i++) {
            if(min.compareTo(a[i])>0) min = a[i];
            if(max.compareTo(a[i])<0) max = a[i];
        }
        return new Pair<T>(min, max);
    }

}



