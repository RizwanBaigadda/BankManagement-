package com.Bank;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener{
	
JButton login, singup, clear;

JTextField cardfield;
JPasswordField pinfield;
	
	
	Login(){
		setTitle("AUTOMATED TELLER MACHONE");
		setSize(800,480);
		setVisible(true);
		setLocation(350,200);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg")); // giving path for icon
		Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);   // setting icon size
		ImageIcon i3 = new ImageIcon(i2);          // again changing image to imageicon 
		JLabel l1 = new JLabel (i3);            // for setting anything on template need JLabel
		add(l1);                                // to add that anythong on template need add
		l1.setBounds(70,10,100,100);            // setting postion of icon in template 
		setLayout(null);              // need to set layout null to change the position of an icon or image  
		
		getContentPane().setBackground(Color.white); // SETTING bg color 
		
		
		JLabel text = new JLabel("WELCOME TO ATM");
		add (text);
		text.setBounds(200,40,400,40);
		text.setFont(new Font ("Osward", Font.BOLD, 34));
		
		JLabel cardnum = new JLabel("Card No");
		add (cardnum);
		cardnum.setBounds(120, 150, 150, 30);
		cardnum.setFont(new Font ("Raleway", Font.BOLD, 28));
		
		 cardfield = new JTextField ();
		cardfield.setBounds(300, 150, 230, 30 );
        add(cardfield);	
		
		
		
		JLabel Pin = new JLabel("PIN");
		add (Pin);
		Pin.setBounds(120,220,250,30);
		Pin.setFont(new Font ("	Raleway", Font.BOLD, 28));
		
		
	   pinfield = new JPasswordField();
		pinfield.setBounds(300, 220, 230, 30 );
        add(pinfield);	
        
         login = new JButton("login ");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("clear");
        clear.setBounds(430	,300,100,30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);
		
        singup = new JButton("singup");
        singup.setBounds(300,350,230,30);
        singup.setBackground(Color.black);
        singup.setForeground(Color.white);
        singup.addActionListener(this);
        add(singup);
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		
		if(e.getSource() == clear) {
			
			cardfield.setText("");
			pinfield.setText("");
			
		}else if(e.getSource() == login) {
		 
			String cardnum = cardfield.getText();
			String pinnum = pinfield.getText();
			
			connect conn3 = new  connect();
			
		   String query4 = "select * from login where  AccountNumber = '"+cardnum+"' and pinNumber = '"+pinnum+"'"; 
			
				ResultSet rs =conn3.s.executeQuery(query4);
				
				if(rs.next()) {
					setVisible(false);
					new Transcation(pinnum).setVisible(true);
				}else {
				    JOptionPane.showMessageDialog(this, "Incorrect Card Number or Pin");
				}

				
			
			
		}else if(e.getSource()== singup) {
			setVisible(false);
			new singupone().setVisible(true);
			
		}
		}catch(Exception e5) {
			System.out.println(e5);
		}
	
		
	}
	
	public static void main (String args[]) {
		Login l1 = new Login();
		
		
		
	}

	

}
