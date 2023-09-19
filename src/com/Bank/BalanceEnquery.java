package com.Bank;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;


public class BalanceEnquery extends JFrame implements ActionListener{
	
    String pinnum ;
    JButton back;
    
	BalanceEnquery(String pinnum){
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
		 
		 back = new JButton("Back");
		 back.setBounds(355,520,150,30);
		 back.addActionListener(this);
		 image.add(back);
		 
		 
		 
		 connect c6 = new connect();
		 int balance = 0;	
		 try {
		
				ResultSet rs = c6.s.executeQuery("select * from bank where pin ='"+pinnum+"'");
				
				while(rs.next()) {
					if(rs.getString("type").equals("Deposit")) {
						balance += Integer.parseInt(rs.getString("amount"));
					}else {
						balance -= Integer.parseInt(rs.getString("amount"));
					}
				}
			}catch(Exception e) {
				System.out.println(e);
			}
		 
		 JLabel L1 = new JLabel(" Your Account Balance is : " + balance);
		 L1.setBounds(170,350,400,30);
		 L1.setForeground(Color.WHITE);
		 image.add(L1);
 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	setVisible(false);
	new Transcation(pinnum).setVisible(true);
		
	}
	
	
	public static void main (String args[]) {
		new BalanceEnquery("").setVisible(true);
	}


	
	
}
