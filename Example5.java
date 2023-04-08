import java.awt.*;

public class Example5 {
    public static void main(String[] args) {
        Frame frame = new Frame("Text Area Example");
        TextArea textArea = new TextArea(5, 20); // 5 rows, 20 columns
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.add(textArea); // add text area to scroll pane
        frame.add(scrollPane); // add scroll pane to frame
        frame.pack();
        frame.setVisible(true);
    }
}

