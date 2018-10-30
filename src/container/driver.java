package container;

import java.awt.*;

public class driver {

    public static void main(String[] args) {

        MyInheritanceFrame myFrame = new MyInheritanceFrame("232 Frame");

        Color myColor = new Color(255, 255, 0);

        myFrame.panel.setBackground(myColor);

        myFrame.getContentPane().add(myFrame.panel);
    }
}
