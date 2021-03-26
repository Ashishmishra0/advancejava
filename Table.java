import javax.swing.*;
public class Table{
	JFrame f;
	JLabel team;
	Table(){
	f=new JFrame();
	team=new JLabel("Students");
	String data[][]={{"456","Ashish","19"},
		{"457","Ashu","13"},
		{"458","Atharva","16"},
		{"459","Arya","20"},
		{"460","Anurag","17"}};
	String column[]={"ENROLLMENT","NAME","MARKS"};
	JTable jt=new JTable(data, column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);
	f.add(sp);
	f.setSize(300,400);
	f.setTitle("JTable");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
	}
	public static void main(String[] args){
	new Table();
	}
}
