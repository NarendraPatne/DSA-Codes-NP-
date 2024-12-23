import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class Exxx {
    public static void main(String[] args) {
        // JFrame frame = new JFrame("GridLayout Example");
        // frame.setLayout(new GridLayout(2, 3)); // 2 rows, 3 columns

        // frame.add(new JButton("Button 1"));
        // frame.add(new JButton("Button 2"));
        // frame.add(new JButton("Button 3"));
        // frame.add(new JButton("Button 4"));
        // frame.add(new JButton("Button 5"));
        // frame.add(new JButton("Button 6"));

        // frame.setSize(400, 200);
        // frame.setVisible(true);
        // JFrame frame = new JFrame("BorderLayout Example");
        // frame.setLayout(new BorderLayout());

        // frame.add(new JButton("North"), BorderLayout.NORTH);
        // frame.add(new JButton("South"), BorderLayout.SOUTH);
        // frame.add(new JButton("East"), BorderLayout.EAST);
        // frame.add(new JButton("West"), BorderLayout.WEST);
        // frame.add(new JButton("Center"), BorderLayout.CENTER);

        // frame.setSize(400, 300);
        // frame.setVisible(true);
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20)); // Center aligned with gaps

        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));

        frame.setSize(400, 200);
        frame.setVisible(true);

    }
}
