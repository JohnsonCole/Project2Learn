
/********************************
 * 															*
 * 	Trendy Viddy's Program for 		*
 * 	Videos on Demand						*
 * 															*
 * 	Software Engineering					*
 * 	CSC - 445 - 01								*
 * 	Prof. Kehan Gao							*
 * 															*
 * 	Programmers :								*
 * 															*
 * 	Brian Gonzalez								*
 * 	Cole Johnson									*
 * 	Diana Lima Lopez							*
 * 	Marwan Youssef							*
 * 	Steve Cuff										*
 * 															*
 ********************************/

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")


public class LoginScreen extends JFrame implements ActionListener {
	
	
    protected String[] args;

	public LoginScreen() {
        initializeUI();
    }

	/**************************************
	 * 																		*
	 * 	Here we Create the "Login" Screen		*
	 * 																		*
	 **************************************/
	
    private void initializeUI() {
    	
    	/****************************
    	 * 													*
    	 * 		Creates and intializes		*
    	 * 		the Login Screen.				*
    	 * 													*
    	 ****************************/
    	
    	setTitle("Trendy Viddy Login Screen");
        setSize(350, 200);
        setLocation(650, 350);
        java.net.URL imgURL = LoginScreen.class.getResource("TrendyViddyLogo.jpg");
        setIconImage(new ImageIcon(imgURL).getImage());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(null);
        panel.setLocation(600, 300);
        
        JLabel Info = new JLabel("Username & Password 30 Characters Max.");
        Info.setBounds(40, 25, 300, 20);

        JLabel log = new JLabel("Username :");
        log.setBounds(50, 50, 150, 20);
        
        JTextField username = new JTextField(30);
        username.setBounds(125, 50, 150, 20);
        
        JLabel pass = new JLabel("Password :");
        pass.setBounds(50, 70, 150, 20);
        
        JButton create = new JButton("Create Account");
        create.setBounds(150, 90, 125, 20);
        create.addActionListener(new ActionListener()
        {
        	  public void actionPerformed(ActionEvent e)
        	  {
        		  if (e.getSource() == create) {
        		  createaccount();
        		  }
        	  }
        	});
       
        JPasswordField password = new JPasswordField(30);
        password.setBounds(125, 70, 150, 20);
        char c = '*';
        password.setEchoChar(c);

        JButton button = new JButton("Log in");
        button.setBounds(50, 90, 80, 20);
        button.addActionListener(new ActionListener()
        {
        	  public void actionPerformed(ActionEvent e)
        	  {
        		  String user1 = username.getText();
        		  String user2 = username.getText();
        		  String user3 = username.getText();
        		  String user4 = username.getText();
        		  @SuppressWarnings("deprecation")
        		  String pass1 = password.getText();
        		  @SuppressWarnings("deprecation")
				String pass2 = password.getText();
        		  @SuppressWarnings("deprecation")
				String pass3 = password.getText();
        		  @SuppressWarnings("deprecation")
				String pass4 = password.getText();
        		  if (user1.equals("Steve Cuff") && pass1.equals("Bonez1970") || user2.equals("Brian Gonzalez") && pass2.equals("Gonzo87") || 
        				  user3.equals("Cole Johnson") && pass3.equals("Johnson745") || user4.equals("Diana Lima Lopez") && pass4.equals("Lopez9456")) 
        		  {
        	    // Once Login is Accepted
        		// Open the Main Program for Continuation
        			  createAndShowGUI();
        		  }
        		  else // Throws Error Message Dialog 
        		  {
        			  JOptionPane.showMessageDialog(getParent(), "Incorrect Username or Password", 
        					  "Error", JOptionPane.ERROR_MESSAGE);
        		  } 
        	  }
        	});

        /**************************
         * 												*
         * 		These just add the		*
         * 		components to the		*
         * 		Login Window.				*
         * 												*
         **************************/
        
        panel.add(Info);
        panel.add(log);
        panel.add(username);
        panel.add(pass);
        panel.add(password);
        panel.add(button);
        panel.add(create);
        setContentPane(panel);
    }
    
    /************************************************
     * 																							*
     * 	Here we Create the "New User" Account Page		*
     * 	for when a user clicks on "Create Account"				*
     * 	from the "Login" Screen												*
     * 																							*
     ************************************************/
    
    public void createaccount() {
    	
    	  JDialog CreateAccount = new JDialog();
    	  JDialog.setDefaultLookAndFeelDecorated(false);
    	  CreateAccount.setTitle("Account Creation");
		  CreateAccount.setSize(500, 700);
		  CreateAccount.setLocation(600, 200);
		  CreateAccount.setVisible(true);
		  char e = '#';
		  
		  JLabel acct = new JLabel("Create New User Account");
		  acct.setBounds(155, 5, 150, 20);
		  CreateAccount.add(acct);
		  
		  JLabel firstName = new JLabel("First Name : *");
		  firstName.setBounds(122, 45, 80, 20);
		  CreateAccount.add(firstName);
		  
		  JTextField firstname = new JTextField();
		  firstname.setBounds(200, 45, 150, 20);
		  CreateAccount.add(firstname);
		  
		  JLabel lastName = new JLabel("Last Name : *");
		  lastName.setBounds(122, 75, 80, 20);
		  CreateAccount.add(lastName);
		  
		  JTextField lastname = new JTextField();
		  lastname.setBounds(200, 75, 150, 20);
		  CreateAccount.add(lastname);
		  
		  JLabel address1 = new JLabel("Address 1 : *");
		  address1.setBounds(125, 105, 75, 20);
		  CreateAccount.add(address1);
		  
		  JTextField address1_text = new JTextField();
		  address1_text.setBounds(200, 105, 150, 20);
		  CreateAccount.add(address1_text);
		  
		  JTextField address1_text1 = new JTextField();
		  address1_text1.setBounds(200, 125, 150, 20);
		  CreateAccount.add(address1_text1);
		  
		  JLabel address2 = new JLabel("Address 2 :");
		  address2.setBounds(125, 155, 75, 20);
		  CreateAccount.add(address2);
		  
		  JTextField address2_text = new JTextField();
		  address2_text.setBounds(200, 155, 150, 20);
		  CreateAccount.add(address2_text);
		  
		  JTextField address2_text1 = new JTextField();
		  address2_text1.setBounds(200, 175, 150, 20);
		  CreateAccount.add(address2_text1);
		  
		  JLabel city = new JLabel("City : *");
		  city.setBounds(162, 205, 75, 20);
		  CreateAccount.add(city);
		  
		  JTextField city_text = new JTextField();
		  city_text.setBounds(200, 205, 150, 20);
		  CreateAccount.add(city_text);
		  
		  JLabel state = new JLabel("State : *");
		  state.setBounds(155, 235, 75, 20);
		  CreateAccount.add(state);
		  
		  JTextField state_text = new JTextField();
		  state_text.setBounds(200, 235, 150, 20);
		  CreateAccount.add(state_text);
		  
		  JLabel country = new JLabel("Country : *");
		  country.setBounds(140, 265, 75, 20);
		  CreateAccount.add(country);
		  
		  JTextField country_text = new JTextField();
		  country_text.setBounds(200, 265, 150, 20);
		  CreateAccount.add(country_text);
		  
		  JLabel zip = new JLabel("Zip Code : *");
		  zip.setBounds(135, 295, 75, 20);
		  CreateAccount.add(zip);
		  
		  JTextField zip_text = new JTextField();
		  zip_text.setBounds(200, 295, 150, 20);
		  CreateAccount.add(zip_text);
		  
		  JLabel phone = new JLabel("Phone Number :");
		  phone.setBounds(100, 325, 100, 20);
		  CreateAccount.add(phone);
		  
		  JTextField phone_text = new JTextField();
		  phone_text.setBounds(200, 325, 150, 20);
		  CreateAccount.add(phone_text);
		  
		  JLabel email = new JLabel("Email Address : *");
		  email.setBounds(100, 355, 100, 20);
		  CreateAccount.add(email);
		  
		  JTextField email_text = new JTextField();
		  email_text.setBounds(200, 355, 150, 20);
		  CreateAccount.add(email_text);
		  
		  JLabel userName = new JLabel("User Name : *");
		  userName.setBounds(120, 385, 100, 20);
		  CreateAccount.add(userName);
		  
		  JTextField user_text = new JTextField(30);
		  user_text.setBounds(200, 385, 150, 20);
		  CreateAccount.add(user_text);
		  
		  JLabel password = new JLabel("Password : *");
		  password.setBounds(127, 415, 100, 20);
		  CreateAccount.add(password);
		  
		  JPasswordField pass_text = new JPasswordField(30);
		  pass_text.setBounds(200, 415, 150, 20);
		  CreateAccount.add(pass_text);
		  pass_text.setEchoChar(e);
		  
		  JLabel password2 = new JLabel("Confirm Password : *");
		  password2.setBounds(78, 435, 125, 20);
		  CreateAccount.add(password2);
		  
		  JPasswordField pass2_text = new JPasswordField(30);
		  pass2_text.setBounds(200, 435, 150, 20);
		  CreateAccount.add(pass2_text);
		  pass2_text.setEchoChar(e);
		  
		  /*********************************
		   * 																*
		   * 		These are just instructional 		*
		   * 		Labels for the user.						*
		   * 																*
		   *********************************/
		  
		  JLabel info = new JLabel("Fields with * are REQUIRED."); 
		  info.setBounds(125, 465, 300, 20);
		  CreateAccount.add(info);
		  
		  JLabel info1 = new JLabel("If you choose to create your new account");
		  info1.setBounds(125, 485, 300, 20);
		  CreateAccount.add(info1);
		  
		  JLabel info2 = new JLabel("Please click on Create button when finished");
		  info2.setBounds(125, 505, 300, 20);
		  CreateAccount.add(info2);
		  
		  JLabel info3 = new JLabel("filling out form. Otherwise, click Cancel.");
		  info3.setBounds(125, 525, 300, 20);
		  CreateAccount.add(info3);
		  
		  JLabel info4 = new JLabel("Thank You.");
		  info4.setBounds(125, 545, 80, 20);
		  CreateAccount.add(info4);
		  
		  JButton cancelCreate = new JButton("Cancel");
		  cancelCreate.setBounds(300, 600, 75, 20);
		  CreateAccount.add(cancelCreate);
		  cancelCreate.addActionListener(new ActionListener() {
				 @Override
				public void actionPerformed(ActionEvent e) {
					
					if (e.getSource() == cancelCreate) {
						CreateAccount.dispose();
					}
				}
			  });
		   
		  /*****************************
		   * 														*
		   * 		This is where the user's 		*
		   * 		account can be created		*
		   * 		and if it is the user will			*
		   * 		be automatically logged		*
		   * 		in.											*
		   * 														*
		   *****************************/
		  
		  JButton acctCreate = new JButton("Create");
		  acctCreate.setBounds(125, 600, 75, 20);
		  CreateAccount.add(acctCreate);
		  acctCreate.addActionListener(new ActionListener() {
			 @Override
			public void actionPerformed(ActionEvent e) {
				 
				// TODO
				 /*************************************************
				  * 																								*
				  * 		Finish this part to check for appropriate					*
				  * 		information. If information is missing or 					*
				  * 		incorrect type or form, throw and exception			*
				  * 		error dialog with accurate message							*
				  * 		pertaining to error type.												*
				  * 																								*
				  * 		Also need function that Creates the DATA				*
				  * 		File that will hold user's information !!!!!!!!				*
				  * 																								*
				  * 		I'm thinking a method to write file??????				*
				  * 																								*
				  * 		And then for Login a method to read file????			*
				  * 																								*
				  **************************************************/
				 
				if (e.getSource() == acctCreate) {
					
					//Maybe Write File method here???? 		i.e. (    makeUser();   )
					
					createAndShowGUI();
					CreateAccount.dispose();
					
				}
			}
		  });
    }

    /**************************************
     * 																		*
     * 	Here is the GUI Window Function			*
     * 	for the Main Window								*
     * 																		*
     **************************************/
    
private static void createAndShowGUI() {
    	
    	JFrame.setDefaultLookAndFeelDecorated(false);
    	
    	JFrame frame = new JFrame("Trendy Viddy's");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(450, 400));
        java.net.URL imgURL = LoginScreen.class.getResource("TrendyViddyLogo.jpg");
        frame.setIconImage(new ImageIcon(imgURL).getImage());
        frame.setLocation(600, 300);
        
        JLabel emptyLabel = new JLabel("Popular");
        emptyLabel.setPreferredSize(new Dimension(175, 100));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
 
        frame.pack();
        frame.setVisible(true);
    }
    
    /********************************
     * 															*
     * 	Here is the Main Function			*
     * 	for the Program in General			*
     * 															*
     ********************************/
    
    public static void main(String[] args) {
    	try {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    	}
        catch(Exception e)
        {
        	JOptionPane.showMessageDialog(null, e.getMessage());}
        }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}