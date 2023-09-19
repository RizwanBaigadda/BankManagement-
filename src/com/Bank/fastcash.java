package com.Bank;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.*;

public class fastcash extends JFrame implements ActionListener {
	
	
	JButton back, query, deposit, fastcash, pinchange, withdraw,  mini;
	
	String pinnum;
	public fastcash(String pin) {
		this.pinnum = pin; 
		
//		setUndecorated(true);
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
		 
		 
		 
		JLabel text = new JLabel("Select Withdraw Amount");
		text.setForeground(Color.white);
		text.setBounds(230,300,700,35);
		text.setFont(new Font ("System", Font.BOLD, 14));
		image.add(text);
		
		 deposit = new JButton("100");
		deposit.setBounds(170,415,150,30);
		deposit.addActionListener(this);
		image.add(deposit);
		

		 fastcash = new JButton("500");
		fastcash.setBounds(170,450,150,30);
		fastcash.addActionListener(this);
		image.add(fastcash);
		

		 pinchange = new JButton("1000");
		pinchange.setBounds(170,485,150,30);
		pinchange.addActionListener(this);
		image.add(pinchange);
		
		withdraw = new JButton("2000");
		withdraw.setBounds(340,415,150,30);
		withdraw.addActionListener(this);
		image.add(withdraw);
		
		 mini = new JButton("5000");
		mini.setBounds(340,450,150,30);
		mini.addActionListener(this);
		image.add(mini);
		
		 query = new JButton("10000");
		query.setBounds(340,485,150,30);
		query.addActionListener(this);
		image.add(query);
		
		back = new JButton("Back");
		back.setBounds(340,520,150,30);
		back.addActionListener(this);
		image.add(back);
		
		
	}
	
	

@Override
public void actionPerformed(ActionEvent e4) {

	if(e4.getSource()== back) {
		setVisible(false);
		new Transcation(pinnum	).setVisible(true);
		
	}else {
		
		String amount = ((JButton)e4.getSource()).getText();
		connect c5 = new connect();
		try {
			
			ResultSet rs = c5.s.executeQuery("select * from bank where pin ='"+pinnum+"'");
			int balance = 0;
			while(rs.next()) {
				if(rs.getString("type").equals("Deposit")) {
					balance += Integer.parseInt(rs.getString("amount"));
				}else {
					balance -= Integer.parseInt(rs.getString("amount"));
				}
			}	
			if(e4.getSource()!=back && balance < Integer.parseInt(amount)){
				JOptionPane.showMessageDialog(null, "Insufficient Amount");
				return;
				
			}
			Date date1 = new Date();
			String query6 = "Insert into bank values('"+pinnum+"', '"+date1+"', 'withdrawal', '"+amount+"')";
			c5.s.executeUpdate(query6);

			JOptionPane.showMessageDialog(null, " Rs " + amount+ " has Successfully Withdraw " + " \n Thank you visit again ");

			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
	
	
	
public static void main(String args[]) {
	  new fastcash("");
	  
	  
	  
    }




}

