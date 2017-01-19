/**
 * Created by vanessamnoble on 1/19/17.
 */

import javax.swing.*;
import java.awt.*;




public class Panel1 {
    public static void main(String[] args) {
        Panel1 gui = new Panel1();
        gui.go();

    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JTextArea text = new JTextArea(10,20);
        JScrollPane scroller = new JScrollPane(text);
        text.setLineWrap(true);

        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

//        Font bigFont = new Font("serif", Font.BOLD, 28);
        panel.add(scroller);
        panel.setBackground(Color.ORANGE);
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        text.setText("you suck!"); //add text

//        text.append("button clicked"); //another way to add text

        text.selectAll();
        text.requestFocus();

        JButton button = new JButton ("Rock");
        JButton buttonTwo = new JButton ("Paper");
        JButton buttonThree = new JButton ("Scissors");
        JButton buttonFour = new JButton ("New Game");
        JButton buttonFive = new JButton ("Exit");




        panel.add(button);
        panel.add(buttonTwo);
        panel.add(buttonThree);
        panel.add(buttonFour);
        panel.add(buttonFive);

        frame.getContentPane().add(BorderLayout.EAST, panel);
//        frame.getContentPane().add(BorderLayout.WEST, panel);
//        frame.getContentPane().add(BorderLayout.NORTH, panel);
//        frame.getContentPane().add(BorderLayout.SOUTH, panel);
//        frame.getContentPane().add(BorderLayout.CENTER, panel);


        frame.setSize(350,300);
        frame.setVisible(true);
    }
}




