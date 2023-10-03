import java.awt.*;
import java.awt.event.*;

public class ManualLayout extends Frame 
{
	Label lbl1,lbl2,lbl3;
	public ManualLayout ( )
	{
		setLayout(null); 
		setBackground(Color.pink);
		lbl1= new Label("Label1:");
		lbl2= new Label("Label2:");
		lbl3= new Label("Label3:");
		//lbl1.setBounds(100,100,40,10);
		//lbl2.setBounds(200,200,40,10);
		//lbl3.setBounds(300,300,40,10);

		lbl1.setBounds(1500,100,40,10);
		lbl2.setBounds(1100,500,40,10);
		lbl3.setBounds(700,900,40,10);

		add(lbl1);
		add(lbl2);
		add(lbl3);

		setTitle("Null Layout Demo");
		setSize(400,450);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new ManualLayout();
	}
}