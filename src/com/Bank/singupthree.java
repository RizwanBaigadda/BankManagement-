package com.Bank;


import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class singupthree extends JFrame implements ActionListener{
	
	
	JRadioButton r1, r2, r3, r4;
	JCheckBox c1, c2, c3, c4, c5, c6;
	JButton submit, cancel;
	String formnum;

	 singupthree(String fornum){
		this.formnum = fornum;
		
		
		setSize(850,820);
		setLocation(350,10);
		setLayout(null);
		setVisible(true);
		setTitle("This sample");
		
		JLabel l1 = new JLabel("page 3 : Account Details");
		l1.setFont(new Font("raleway", Font.BOLD, 22));
		l1.setBounds(300, 40, 400, 40);
		add(l1);
		
		JLabel Type = new JLabel("Account Type :");
	    Type.setFont(new Font("raleway", Font.BOLD, 16));
		Type.setBounds(100, 140, 300, 30);
		add(Type);
		
		r1 = new JRadioButton("Saving Account");
		r1.setFont(new Font("raleway", Font.BOLD, 16));
		r1.setBounds(100, 190, 300, 30);
		add(r1);
		
		r2 = new JRadioButton("Fixed Deposit Account");
		r2.setFont(new Font("raleway", Font.BOLD, 16));
		r2.setBounds(400, 190, 300, 40);
		add(r2);
		
		r3 = new JRadioButton("Current Account ");
		r3.setFont(new Font("raleway", Font.BOLD, 16));
		r3.setBounds(100, 250, 300, 30);
		add(r3);
		
		r4 = new JRadioButton("Recurring Deposit Account ");
		r4.setFont(new Font("raleway", Font.BOLD, 16));
		r4.setBounds(400, 250, 300, 30);
		add(r4);
		
		ButtonGroup group = new ButtonGroup ();
		group.add(r1);
		group.add(r2);
		group.add(r3);
		group.add(r4);
		
		
		JLabel cardnum = new JLabel("Card Number");
		cardnum.setFont(new Font("raleway", Font.BOLD, 20));
		cardnum.setBounds(100, 300, 300, 30);
		add(cardnum);
		
		JLabel number = new JLabel("xxxx-xxxx-xxxx-4126");
		number.setFont(new Font("raleway", Font.BOLD, 20));
		number.setBounds(400, 300, 300, 30);
		add(number);
		
		
		JLabel digit = new JLabel("Your 16 digit Number is Here ");
		digit.setFont(new Font("raleway", Font.BOLD, 14));
		digit.setBounds(100, 330, 300, 30);
		add(digit);
		
		
		JLabel pin = new JLabel("Pin");
		pin.setFont(new Font("raleway", Font.BOLD, 20));
		pin.setBounds(100, 380, 300, 30);
		add(pin);
		
		JLabel yourpin = new JLabel("Your 4 Digit Password  ");
		yourpin.setFont(new Font("raleway", Font.BOLD, 14));
		yourpin.setBounds(100, 410, 300, 30);
		add(yourpin);
		
		JLabel pass = new JLabel(" xxxx ");
		pass.setFont(new Font("raleway", Font.BOLD, 22));
		pass.setBounds(400, 380, 300, 30);
		add(pass);
		
		JLabel service = new JLabel(" Service Required : ");
		service.setFont(new Font("raleway", Font.BOLD, 22));
		service.setBounds(100, 450, 300, 30);
		add(service);
		
		 c1 = new JCheckBox ("Atm Card");
		 c1.setFont(new Font("raleway", Font.BOLD, 16));
		 c1.setBounds(100, 490, 300, 30);
		 add(c1);
		 
		 c2 = new JCheckBox ("Internet Banking");
		 c2.setFont(new Font("raleway", Font.BOLD, 16));
		 c2.setBounds(400, 490, 300, 30);
		 add(c2);
		 
		 c3 = new JCheckBox ("Mobile Banking ");
		 c3.setFont(new Font("raleway", Font.BOLD, 16));
		 c3.setBounds(100, 530, 300, 30);
		 add(c3);
		 
		 
		 c4 = new JCheckBox ("Email & Sms Service ");
		 c4.setFont(new Font("raleway", Font.BOLD, 16));
		 c4.setBounds(400, 530, 300, 30);
		 add(c4);
		 
		 
		 c5 = new JCheckBox ("Cheque Book");
		 c5.setFont(new Font("raleway", Font.BOLD, 16));
		 c5.setBounds(100, 570, 300, 30);
		 add(c5);
		 
		 c6 = new JCheckBox ("E-Statement");
		 c6.setFont(new Font("raleway", Font.BOLD, 16));
		 c6.setBounds(400, 570, 300, 30);
		 add(c6);
		 
		 c6 = new JCheckBox ("I here By declared that the above details are corect to be best of my knowledge");
		 c6.setFont(new Font("raleway", Font.BOLD, 10));
		 c6.setBounds(100, 600, 500, 30);
		 add(c6);
		 
		 submit = new JButton("submit");
		 submit.setFont(new Font("raleway", Font.BOLD, 14));
		 submit.setBounds(250,650,100,30);
		 submit.setBackground(Color.black);
		 submit.setForeground(Color.white);
		 submit.addActionListener(this);
		 add(submit);
		 
		 

		 cancel = new JButton("cancel");
		 cancel.setFont(new Font("raleway", Font.BOLD, 14));
		 cancel.setBounds(420,650,100,30);
		 cancel.setBackground(Color.black);
		 cancel.setForeground(Color.white);
		 cancel.addActionListener(this);
		 add(cancel);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource()== submit) {
			
			String accounttype = null;
			if(r1.isSelected()) {
				accounttype = "Saving Account";
			}else if(r2.isSelected()) {
				accounttype = "Fixed Deposit";
			}else if (r3.isSelected()) {
				accounttype = "Current Account";
				
			}else if (r4.isSelected()) {
				accounttype = "Recurring Deposit Account ";
			}
			
			
			Random ran = new Random();
			String accountnum = " " + Math.abs((ran.nextLong() % 90000000L) + 5493123000000000L);
			
			String pinnum = " " + Math.abs((ran.nextLong() % 9000L) + 1000L);
			
			String facility = "";
			if(c1.isSelected()) {
				facility = facility + "Atm Card";
				
			}
			if(c2.isSelected()) {
				facility = facility + "InternetBanling";
			}
			if(c3.isSelected()) {
				facility = facility + "Mobile Banking";
			} if(c4.isSelected()) {
				facility = facility + "Email & Sms Service ";
			} if(c5.isSelected()) {
				facility = facility + "Cheque Book";
			}	 if(c6.isSelected()) {
				facility = facility + "E-statement";
			}
			
			
			try {
				if(accounttype.equals("")) {
					JOptionPane.showMessageDialog(null, "Account type must be selected");
					
				}else {
				
					
					connect c3 = new connect();
					String query3 = "insert into singupthree values('"+formnum+"','"+accounttype+"', '"+accountnum+"', '"+pinnum+"', '"+facility+"')";
					String query4 = "insert into login values('"+formnum+"', '"+accountnum+"', '"+pinnum+"')";
					c3.s.executeUpdate(query3);
					c3.s.executeUpdate(query4);
						 
					JOptionPane.showMessageDialog(null, "Your Account Successfully Created" + "\nYour Account N0: " + accountnum + "\nPin no: " + pinnum);

				    	setVisible(false);
					  new Deposit(pinnum).setVisible(false);
	                    
				}
			
			}catch(Exception e3) {
				System.out.println(e3);
			}
			
			
			
		}else if(e.getSource()== cancel) {
			
			setVisible(false);
			new Login().setVisible(true);
			
		}
		
		
		
	}
	
	
	
	
	
	
	public static void main (String args[]) {
		
		new singupthree("");
		
		
	}







	
}
