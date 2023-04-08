import javax.swing.*;

public class Example4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Area Example");
        JTextArea textArea = new JTextArea(5, 20); // 5 rows, 20 columns
        JScrollPane scrollPane = new JScrollPane(textArea); // add scroll bars to text area
        frame.getContentPane().add(scrollPane); // add scroll pane to frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
