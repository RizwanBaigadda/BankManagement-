package com.Bank;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Transcation extends JFrame implements ActionListener {
	
	
	JButton exit, query, deposit, fastcash, pinchange, withdraw,  mini;
	
	String pinnum;
	public Transcation(String pin) {
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
		 
		 
		 
		JLabel text = new JLabel("please select your Transcation");
		text.setForeground(Color.white);
		text.setBounds(230,300,700,35);
		text.setFont(new Font ("System", Font.BOLD, 14));
		image.add(text);
		
		 deposit = new JButton("Deposit");
		deposit.setBounds(170,415,150,30);
		deposit.addActionListener(this);
		image.add(deposit);
		

		 fastcash = new JButton("Fast Cash");
		fastcash.setBounds(170,450,150,30);
		fastcash.addActionListener(this);
		image.add(fastcash);
		

		 pinchange = new JButton("Pin Change");
		pinchange.setBounds(170,485,150,30);
		pinchange.addActionListener(this);
		image.add(pinchange);
		
		withdraw = new JButton("Cash Withdrawl");
		withdraw.setBounds(340,415,150,30);
		withdraw.addActionListener(this);
		image.add(withdraw);
		
		 mini = new JButton("Mini Statement");
		mini.setBounds(340,450,150,30);
		mini.addActionListener(this);
		image.add(mini);
		
		 query = new JButton("Balance Enquery");
		query.setBounds(340,485,150,30);
		query.addActionListener(this);
		image.add(query);
		
		 exit = new JButton("Exit");
		exit.setBounds(340,520,150,30);
		exit.addActionListener(this);
		image.add(exit);
		
		
	}
	
	

@Override
public void actionPerformed(ActionEvent e4) {

	if(e4.getSource()== exit) {
		System.exit(0);
	}else if(e4.getSource()==deposit) {
		setVisible(false);
		new Deposit(pinnum).setVisible(true);
	}else if (e4.getSource()== withdraw) {
		setVisible(false);
		new withdrawl(pinnum).setVisible(true);
	}else if (e4.getSource()==fastcash) {
		setVisible(false);
		new fastcash(pinnum).setVisible(true);
	}else if(e4.getSource()==pinchange) {
		setVisible(false);
		new pinchange(pinnum).setVisible(true);
	}else if(e4.getSource()==query) {
		setVisible(false);
		new BalanceEnquery(pinnum).setVisible(true);
	}else if(e4.getSource()== mini) {
		
		new MiniStatement(pinnum).setVisible(true);
	}
}
	
	
	
public static void main(String args[]) {
	  new Transcation("");
	  
	  
	  
    }




}

