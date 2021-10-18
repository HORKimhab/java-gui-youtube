
import javax.swing.*;
import java.awt.image.*; 

public class Main {

    public static void main(String[] args) {
        // JFrame = a GUI window to add components to 
        JFrame frame = new JFrame(); // create a new frame 
        frame.setTitle("JFrame title here");
        // frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420, 420);
        frame.setVisible(true);
        
        // Add image icon
        // More: https://docs.oracle.com/javase/tutorial/uiswing/components/icon.html
        ImageIcon icon = new ImageIcon("image/ubuntulogo.png");
        frame.setIconImage(icon.getImage());
    }
}

// https://www.javatpoint.com/java-jframe

