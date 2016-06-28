package innerClass;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * Created by youngz on 16-6-28.
 */
public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        //keep program runig until user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit");
        System.exit(0);
    }
}
class TalkingClock {
    private int interval;
    private boolean beep;

    //construct
    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }
    //start clock
    public void start() {
        ActionListener listener =new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }

    public class TimePrinter implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            Date now = new Date();
            System.out.println("At the tone,the time is " + now);
            if (beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}
