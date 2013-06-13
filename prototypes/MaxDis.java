// Author : Indrajith K L
// Date Written : 14-06-2013 12:34AM

import java.awt.*;
import java.awt.event.*;

class MaxDis extends Frame
{
	Button b1,b2;
	Panel p1,p2;
	TextField username,password;
	MaxDis()
	{
		p1 = new Panel();
		p2 = new Panel();
		b1 = new Button("Register");
		b2 = new Button("Login");
		
		
		username = new TextField(10);		
		password = new TextField(10);
		password.setEchoChar('*');
		
		
		this.setTitle("Login : Student Attendance");
		setResizable(false);
		setSize(200,200);
		setLayout(new GridLayout(2,1));
		
		/*add(username);
		add(password);
		add(b1);
		add(b2);*/
		p1.add(new Label("User Name"));
		p1.add(username);
		p1.add(new Label("Password  "));
		p1.add(password);
		p2.add(b1);
		p2.add(b2);
		add(p1);
		add(p2);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		MaxDis mn = new MaxDis();
	}
}