import java.awt.*;
import java.awt.event.*;
class ashishf extends Frame
{
    public static void main(String args[])
    {
    ashishf f= new ashishf();
    f.setVisible(true);
    f.setSize(600,400);
    f.setTitle("Ashish frame");
    f.addWindowListener(new thisclass());
    }
}
class thisclass extends WindowAdapter
{
public void windowClosing(WindowEvent e)
{
    System.exit(0);

}
}
