import javax.swing.*;
import java.awt.*;

public class TrafficIntersectionScenario {
    private JPanel panel1;
    private JPanel rootJpanel;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JPanel blackline1;
    private JPanel blackline2;

    public  TrafficIntersectionScenario(){
        blackline1.setBackground(Color.BLACK);
        blackline2.setBackground(Color.black);



    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TrafficIntersectionScenario");
        frame.setContentPane(new TrafficIntersectionScenario().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
