import javax.swing.*;
import java.awt.*;

public class Gridlay2{
    JFrame F;
    Gridlay2() {
        F = new JFrame();
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");


        F.add(b1);
        F.add(b2);
        F.add(b3);
        F.add(b4);
        F.add(b5);
        F.add(b6);
        F.add(b7);
        F.add(b8);
        F.add(b9);

        F.setLayout(new GridLayout(3, 3));


        F.setSize(600, 500);
        F.setVisible(true);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public  static void main(String args[]){
        new Gridlay2();
    }
}
