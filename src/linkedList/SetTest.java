package linkedList;
import java.util.*;
/**
 * Created by youngz on 16-7-1.
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        long totaltime = 0;

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String word = in.next();
            long calltime = System.currentTimeMillis();
            words.add(word);
            calltime = System.currentTimeMillis()-calltime;
            totaltime += calltime;
        }
        Iterator<String> iter = words.iterator();
        for(int i =1; i<= 20 && iter.hasNext();i++) {
            System.out.println(iter.next());
        }
        System.out.println("......");
        System.out.println(words.size()+" distinct words." + totaltime + " milliseconds.");
    }

}
