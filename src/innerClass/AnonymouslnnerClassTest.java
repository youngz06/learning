package innerClass;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
/**
 * Created by youngz on 16-6-28.
 */
public class AnonymouslnnerClassTest {
    public static void main(String[] args) {
        TalkingClock2 clock = new TalkingClock2();
        clock.start(1000, true);
        JOptionPane.showMessageDialog(null, "Quit!");
        System.exit(0);
    }
}

class TalkingClock2 {
    public void start(int interval, final boolean beep) {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                System.out.println("At the tone,the time is " + now);
                if(beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer t = new Timer(interval, listener);
        t.start();
    }
}
