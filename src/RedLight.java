import javax.swing.*;
import java.awt.*;

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

    /** Variable to store the current state of the traffic light.
     * @ lightState = 1 (Red)
     * @ lightState = 3 (Yellow)
     * @ lightState = 2 (Green)
     */
    private int lightState = 1;

    /**
     * This method repaints the light status
     */
    public void changeColor() {
        lightState++;

        if (lightState > 3) {
            lightState = 1;
        }
        repaint();
    }

    /**
     * This method draws the traffic light on the screen
     */

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draws the traffic light
        // Draw inner black frame
        g.setColor(new Color(0,0,0));
        g.fillRoundRect(35,15,120,225,30,30);
        //g.drawRoundRect(35,15,120,225,30,30);

        // RED bulb dim
        g.setColor(new Color(90,0,0));
        g.fillOval(70,40,50,50);

        // YELLOW bulb dim
        g.setColor(new Color(90,90,0));
        g.fillOval(70,100,50,50);

        // GREEN bulb dim
        g.setColor(new Color(0,60,0));
        g.fillOval(70,160,50,50);


        switch (lightState) {
            case 1:
                // RED bulb glows
                g.setColor(new Color(255, 0, 0));
                g.fillOval(70, 40, 50, 50);
                break;

            case 3:
                // YELLOW bulb glows
                g.setColor(new Color(255, 255, 0));
                g.fillOval(70, 100, 50, 50);
                break;

            case 2:
                // GREEN bulb glows
                g.setColor(new Color(0, 255, 0));
                g.fillOval(70, 160, 50, 50);
                break;

        }
    }
}


