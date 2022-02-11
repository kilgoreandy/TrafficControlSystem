import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lightEasy extends JFrame implements ActionListener {
    private JFrame mainFrame;
    private JPanel jpanel1;
    private JButton SpawnCar1;
    private JLabel jlabel1;
    private JPanel jpanel2;
    private JLabel jlabel2;
    private JButton SpawnCar2;
    private JPanel jpanel3;
    private JLabel jlabel3;
    private JButton SpawnCar3;
    private JPanel jpanel4;
    private JLabel jlabel4;
    private JButton SpawnCar4;


    private TrafficPanel trafficPanel;
    private TrafficPanel trafficPanel2;
    private TrafficPanel trafficPanel3;
    private TrafficPanel trafficPanel4;

    /**
     * This constructor initialize the state of the traffic light.
     */
    public lightEasy() {
        mainFrame = new JFrame("Traffic Light");
        jpanel1 = new JPanel();
        jlabel1 = new JLabel("Red Light 1");
        SpawnCar1 = new JButton("Spawn Car at Light");
        jpanel2 = new JPanel();
        jlabel2 = new JLabel("Red Light 2");
        SpawnCar2 = new JButton("Spawn Car at Light");
        jpanel3 = new JPanel();
        jlabel3 = new JLabel("Red Light 3");
        SpawnCar3 = new JButton("Spawn Car at Light");
        jpanel4 = new JPanel();
        jlabel4 = new JLabel("Red Light 4");
        SpawnCar4 = new JButton("Spawn Car at Light");
    }

    /**
     * Method to add the GUI components to the frame, arrange them,
     * and makes the frame visible to the user.
     */
    public void launchApp()	{
        mainFrame.setSize(200,350);

        // Centering the screen on the desktop
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = mainFrame.getSize();
        mainFrame.setLocation(((screenSize.width - frameSize.width) / 2),
                ((screenSize.height - frameSize.height) / 2));

        // Adding button controls to panel
        jpanel1.add(jlabel1);
        jpanel1.add(SpawnCar1);
        jpanel2.add(jlabel2);
        jpanel2.add(SpawnCar2);


        // Register Listeners with buttons
        SpawnCar1.addActionListener(this);
        SpawnCar2.addActionListener(this);
        SpawnCar3.addActionListener(this);
        SpawnCar4.addActionListener(this);

        // Adding the traffic light
        trafficPanel = new TrafficPanel();
        mainFrame.getContentPane().add(trafficPanel);
        mainFrame.getContentPane().add(trafficPanel2);


        // Adding panel to lower frame
        mainFrame.getContentPane().add(jpanel1, BorderLayout.SOUTH);
        mainFrame.getContentPane().add(jpanel2, BorderLayout.EAST);

        // Default close action		
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    /**
     * This the driver program
     */
    public static void main(String args[]) {
        lightEasy l1 = new lightEasy();
        l1.launchApp();

    }

    /**
     * This method traps the button click events
     */
    public void actionPerformed(ActionEvent e) {
        // Rotate button is clicked
        if (e.getSource() == SpawnCar1) {
            // Change the color displayed
            trafficPanel.changeColor();
        }
    }
} // End of class lightEasy

