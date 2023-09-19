package com.Bank;


import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Deposit extends JFrame implements ActionListener{
	JTextField amount;
	JButton deposit, back ;
	
	String pinnum;
 
	Deposit(String pinnumber){
		this.pinnum = pinnumber;

		setLayout(null);
		setSize(900,900);
		setLocation(300,0);
		setVisible(true);
		
		ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image l2 = l1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon l3 = new ImageIcon(l2);
		JLabel image = new JLabel(l3);
		image.setBounds(0,0,900,900);
		add(image);
		
		JLabel enter = new JLabel("Enter The Amount you want to Deposit");
		enter.setForeground(Color.WHITE);
		enter.setFont(new Font("System", Font.BOLD, 16));
		enter.setBounds(170,300,500,20);
		image.add(enter);
		
		
		 amount = new JTextField();
		amount.setForeground(Color.BLACK );
		amount.setFont(new Font("System", Font.BOLD, 16));
		amount.setBounds(170,340,320,25);
		image.add(amount);
		
		deposit = new JButton("Deposit");
		deposit.setBounds(350,480,150,30);
		deposit.addActionListener(this);
		image.add(deposit);
	
		 back = new JButton("Back");
		back.setBounds(350,520,150,30);
		back.addActionListener(this);
		image.add(back);		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e5) {
	
		if(e5.getSource()==deposit) {
			String number = amount.getText();
			Date date = new Date();
			if(number.equals("")) {
				JOptionPane.showMessageDialog(null, "Please Insert The Amount");
			}else {
				
				try {
				connect c4 = new connect();
				String query5 = "Insert into bank values('"+pinnum+"', '"+date+"', 'Deposit', '"+number+"')";
				c4.s.executeUpdate(query5);

				JOptionPane.showMessageDialog(null, " Rs " + number+ " has Successfully Deposited " + " \n Thank you visit again ");
				
				setVisible(false);
				new Transcation(pinnum).setVisible(true);
				
				}catch(Exception e) {
					System.out.println(e);
					
				}
			}
		
			
		}else if(e5.getSource()==back) {
			setVisible(false);
			new Transcation(pinnum).setVisible(true);
		}
		
	}
	
	
	
public static void main (String args[]) {
	new Deposit("");
	
}




}
