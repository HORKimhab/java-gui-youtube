
import javax.swing.JFrame;

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
    }
}

// https://www.javatpoint.com/java-jframe

