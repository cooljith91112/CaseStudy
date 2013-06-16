package studentregister;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Main extends Frame implements ActionListener
{
	private Image image;
	Panel loginbox,dummy1,dummy2,dummy3,dummy4;
	TextField username,password;
	Button login;
	Main()
	{
		super("Attendance Register");
		setSize(800,600);
		setResizable(false);
		setLayout(new BorderLayout());
		
		loginbox = new Panel();
		loginbox.setLayout(new GridLayout(3,2));
		
		dummy1 = new Panel();
		dummy2 = new Panel();
		dummy3 = new Panel();
		dummy4 = new Panel();
		
		username = new TextField(16);
		password = new TextField(16);
		password.setEchoChar('*');
		login = new Button("Login");
		
		loginbox.add(new Label("User Name"));
		loginbox.add(username);
		loginbox.add(new Label("Password"));
		loginbox.add(password);
		loginbox.add(new Label(""));
		loginbox.add(login);

		image = Toolkit.getDefaultToolkit().getImage("studentregister/image.jpeg");
		
		add(loginbox,BorderLayout.CENTER);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
			
			public void windowOpened(WindowEvent we)
			{
			//	repaint();
			}
		});
		
		login.addActionListener(this);
		
		
	}
	

	public Insets getInsets()
	{
		return new Insets(300,240,240,240);
	}
	 
	public void paint( Graphics g ) { 
				g.drawImage(image, 0, 0,getWidth(),getHeight(),this);
	}
		
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==login)
		{
			if(username.getText().equals("") || password.getText().equals("") || username.getText().trim().equals(""))
			{
				System.out.println("Please enter the username and password correctly");
			}
			
			else
				System.out.println("User name: "+username.getText()+", Password: "+password.getText());
		}
	}
	
	
	
	public static void main(String[] args)
	{
		Main hmt= new Main();
		hmt.setVisible(true);
	}
}