import java.awt.*;
import javax.swing.*;

public class Calculator2 {
    public static void addComponentsToPane(Container pane) {
        pane.setLayout(new BoxLayout(pane, BoxLayout.LINE_AXIS));

        addAButton("1", pane);
        addAButton("2", pane);
        addAButton("3", pane);
        addAButton("4", pane);
        addAButton("5", pane);
        addAButton("6", pane);
        addAButton("7", pane);
        addAButton("8", pane);
        addAButton("9", pane);
        addAButton("0", pane);
        addAButton("=", pane);
        addAButton(".", pane);

    }

    static void addAButton(String text, Container container) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }


   static void createAndShowGUI() {

        JFrame frame = new JFrame("Calculator");
        frame.setSize(400,100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        addComponentsToPane(frame.getContentPane());


    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}