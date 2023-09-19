package com.Bank;

import java.awt.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

import javax.swing.*;

public class pinchange extends JFrame implements ActionListener  {
	JButton change, back;
	JTextField pintext, repintext;
	String pinnum;
	
	pinchange(String pinnum){
		this.pinnum = pinnum;
		setLayout(null);
		setVisible(true);
		setSize(900,900);
		setLocation(300,0);
		 ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		 Image l2 = l1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
		 ImageIcon l3 = new ImageIcon(l2);
		 JLabel image = new JLabel(l3);
		 image.setBounds(0,0,900,900);
		 add(image);
		 
		 
		 JLabel newpin = new JLabel("New Pin : ");
		 newpin.setFont(new Font("System" , Font.BOLD, 16));
		 newpin.setForeground(Color.white);
		 newpin.setBounds(165,320, 180, 25);
		 image.add(newpin);
		 
		 
		  pintext = new JTextField ();
		 pintext.setBounds(275, 320, 200, 30);
		 pintext.setFont(new Font("Raleway" , Font.BOLD, 16));
		image.add(pintext);
		 
		 

		 JLabel renewpin = new JLabel("	Re-Enter Pin :");
		 renewpin.setFont(new Font("Raleway" , Font.BOLD, 16));
		 renewpin.setForeground(Color.white);
		 renewpin.setBounds(165,360, 180, 25);
		 image.add(renewpin);
		 
		  repintext = new JTextField ();
		 repintext.setBounds(275, 360, 200, 30);
		 repintext.setFont(new Font("System" , Font.BOLD, 16));
		 image.add(repintext);
		 
		 
		 
		  change = new JButton("Change");
		 change.setBounds(355,485,150,30);
		 change.addActionListener(this);
		 image.add(change);
			

		  back = new JButton("Back");
		 back.setBounds(355,500,150,30);
		 back.addActionListener(this);
		 image.add(back);

		 
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e6) {
		if(e6.getSource()== change) {
			try {
				String npin = pintext.getText();
				String rnpin = repintext.getText();
				
				
				if(!npin.equals(rnpin)) {
					JOptionPane.showMessageDialog(null, "Please Enter New and Re-Enter pin Correctly");
					return;
				}
				if(npin.equals("") && rnpin.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter The Pin ");
					return;	
				}
				connect c6 = new connect();
				String query7 = "update bank set pin = '"+npin+"' where pin = '"+pinnum+"'" ;
				String query8 = "update login set PinNumber = '"+npin+"' where PinNumber = '"+pinnum+"'" ;
				String query9 = "update singupthree set PinNumber = '"+npin+"' where PinNumber = '"+pinnum+"'" ;
				
				c6.s.executeUpdate(query7);
				c6.s.executeUpdate(query8);
				c6.s.executeUpdate(query9);
				
				JOptionPane.showMessageDialog(null, "Pin Succesfully changed");
				setVisible(false);
				new Transcation(npin ).setVisible(true);	
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}
		else {
			setVisible(false);
			 new Transcation(pinnum).setVisible(true);
		}
		
	
		
		
	}
	
	
	
	public static void main (String args[]) {
		new pinchange(" ").setVisible(true);
		
	}


	

}
