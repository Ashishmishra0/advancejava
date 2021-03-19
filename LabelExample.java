import java.awt.*;
import java.awt.event.*;
class LabelExample{
    public static void main(String args[]){
        Frame f= new Frame("This is a Label Example");
        Label T,P,S;
        T=new Label("First Label.");
        T.setBounds(80,100, 120,40);
        P=new Label("Second Label.");
        P.setBounds(80,150, 120,40);
        S=new Label("Third Label.");
        S.setBounds(80,200, 120,40);
        f.add(T); f.add(P);f.add(S);
        f.setSize(400,480);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new rishi());
    }
}
class ashish extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}
