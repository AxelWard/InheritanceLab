package container;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class MyInheritanceFrame extends JFrame {

    JPanel panel = new JPanel();

    MyInheritanceFrame(String title) {

        super(title);

        setSize(300, 600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.addMouseListener(mouse);

        setVisible(true);
    }

    MouseListener mouse = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {

            Random rand = new Random();

            int R = rand.nextInt(256);
            int G = rand.nextInt(256);
            int B = rand.nextInt(256);

            Color c = new Color(R, G, B);

            panel.setBackground(c);
        }

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {
            Color c = new Color(255, 255, 0);

            panel.setBackground(c);
        }
    };

}
