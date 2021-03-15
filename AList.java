import java.awt.*;
import java.awt.event.*;
class AList extends Frame implements ItemListener {
    String msg = "";
    List St;

    Mylist() {
        setLayout(new FlowLayout());
        St = new List(3, true);
        St.add("Indore");
        St.add("Bhopal");
        St.add("Rewa");
        St.add("Jabalpur");

        add(St);
        St.addItemListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Selected Language", 120, 130);
        msg = St.getSelectedItem();
        g.drawString(msg, 160, 220);
}
    
    public static void main(String args[]) {
        Alist ch = new Alist();
        ch.setTitle("Check bos status");
        ch.setSize(480, 450);
        ch.setVisible(true);
    }
}
