package timer;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
/**
 * Created by youngz on 16-6-28.
 */

public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();//接口变量必须引用实现了接口的对象
        Timer T = new Timer(1000, listener);
        T.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent evnet) {
        Date now = new Date();
        System.out.println("At the tone,the time is " + now);
        Toolkit.getDefaultToolkit().beep();
    }
}
