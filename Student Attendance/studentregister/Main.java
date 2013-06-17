import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class backImage extends JComponent {
 
Image i;
 
//Creating Constructer
public backImage(Image i) {
this.i = i;
 
}

//Overriding the paintComponent method
@Override
public void paintComponent(Graphics g) {
 
g.drawImage(i, 0, 0, null);  // Drawing image using drawImage method
 
}
}

class Main extends JFrame
{
	JPanel login_box;
	JLabel userlabel,passwordlabel;
	JButton login;
	JTextField username;
	JPasswordField password;

	Main()
	{
		super("Student Attendance");
	try{
		
		setSize(800,600);
		setLayout(null);
		setResizable(false);

		login_box = new JPanel();
		login_box.setOpaque(false);
		username = new JTextField(16);
		password = new JPasswordField(16);
		userlabel = new JLabel("User Name");
		userlabel.setForeground (Color.white);
		passwordlabel = new JLabel("Password");
		passwordlabel.setForeground (Color.white);
		login = new JButton("Login");
		
			BufferedImage bf = ImageIO.read(new File("image.jpeg"));
		
		setContentPane(new backImage(bf));

		login_box.setLayout(new GridLayout(3,2));
		
		login_box.add(userlabel);
		login_box.add(username);
		login_box.add(passwordlabel);
		login_box.add(password);
		login_box.add(new JLabel(""));
		login_box.add(login);
		login_box.setSize(200,75);

		int x =(int)( (getWidth()/2)-(login_box.getWidth()/2));
		int y =(int)( (getHeight()/2)-(login_box.getHeight()/2));
		
		//login_box.setBounds(308,263,185,75);
		login_box.setBounds(x,y,200,75);
		//login_box.setLocation(x,y);
		
		
		//add(background);
		add(login_box);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	catch(IOException io){}
	}	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable()
			{
				public void run()
				{
					
					Main mn = new Main();
					mn.setVisible(true);
					
				}
			});
	}


}