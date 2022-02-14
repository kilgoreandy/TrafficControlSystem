import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class RedLight {
    private JPanel panel;
    private JPanel Light1;
    private JPanel Light2;
    private JPanel Light3;
    private JPanel Light4;
    private JPanel Light1Status;
    private JPanel Light2Status;
    private JPanel Light3Status;
    private JPanel Light4Status;
    private JButton spawnCarAtLightButton;
    private JButton spawnCarAtLightButton1;
    private JButton spawnCarAtLightButton2;
    private JButton spawnCarAtLightButton3;
    private TrafficPanel trafficPanel;
    public RedLight(){
        TrafficPanel t1 = new TrafficPanel();
        Light1.add(t1);
        TrafficPanel t2 = new TrafficPanel();
        Light2.add(t2);
        TrafficPanel t3 = new TrafficPanel();
        Light3.add(t3);
        TrafficPanel t4 = new TrafficPanel();
        Light4.add(t4);
        t1.Status = 1;
        t2.Status = 2;
        t3.Status = 1;
        t4.Status = 2;
        spawnCarAtLightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== spawnCarAtLightButton){
                    t1.colorChange();
                    t2.colorChange();
                    t3.colorChange();
                    t4.colorChange();
                }
            }
        });
        spawnCarAtLightButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== spawnCarAtLightButton1){
                    t1.colorChange();
                    t2.colorChange();
                    t3.colorChange();
                    t4.colorChange();
                }
            }
        });
        spawnCarAtLightButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== spawnCarAtLightButton2){
                    t1.colorChange();
                    t2.colorChange();
                    t3.colorChange();
                    t4.colorChange();
                }
            }
        });
        spawnCarAtLightButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== spawnCarAtLightButton3){
                    t1.colorChange();
                    t2.colorChange();
                    t3.colorChange();
                    t4.colorChange();
                }
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("RedLight");
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setContentPane(new RedLight().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    }

class TrafficPanel extends JPanel {

     int Status = 1;

    /**
     * This method repaints the light status
     */
    public void colorChange() {
        Status++;
        if (Status > 2) {
            Status = 1;
        }
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);

        //Set up the colors
        g.setColor(new Color(0,0,0));
        g.fillRoundRect(35,15,120,225,30,30);
        g.setColor(new Color(90,0,0));
        g.fillOval(70,40,50,50);
        g.setColor(new Color(90,90,0));
        g.fillOval(70,100,50,50);
        g.setColor(new Color(0,60,0));
        g.fillOval(70,160,50,50);
       //Switch the light color based on the status
        switch (Status) {
            case 1:
                g.setColor(new Color(255, 0, 0));
                g.fillOval(70, 40, 50, 50);
                break;
            case 2:
                g.setColor(new Color(0, 255, 0));
                g.fillOval(70, 160, 50, 50);
                break;
        }
    }

}


