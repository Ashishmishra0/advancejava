import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Bdrlyt extends Frame{
    Button buttons[];
    Bdrlyt() {
        buttons = new Button[5];
        for (int i = 0; i < 5; i++) {
            buttons[i] = new Button("BUTTON" + (i + 1));
            add(buttons[i]);
        }
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(100, 150);
        setVisible(true);
    }
    public static void main(String[] args){
        Bdrlyt ob=new Bdrlyt();
    }
    }
