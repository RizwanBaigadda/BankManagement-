package com.Bank;

import javax.swing.*;

import java.awt.*;
import java.sql.*;

public class MiniStatement  extends JFrame{
	
	
	String pinnum;
	JLabel bank, balance, card, mini;
	MiniStatement(String pinnum){
		this.pinnum = pinnum;
		
		setLayout(null);
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        
         bank = new JLabel("Indian Bank ");
        bank.setBounds(150,20,100,20);
        add(bank);
        

         card = new JLabel();
        card.setBounds(20,100,400,20);
        add(card);
        
         mini = new JLabel();
        mini.setBounds(20,140,400,200);
        add(mini);
        
        
         balance = new JLabel();
        balance.setBounds(20,400,400,200);
        add(balance);
        
        try {
        
        	connect c7 = new connect();
        	ResultSet rs = c7.s.executeQuery("select * from login where PinNumber = '"+pinnum+"'");
        	
        	while(rs.next()) {
        		card.setText(" Card Number : "  +  rs.getString("AccountNumber").substring(0,4) + "xxxxxxx" +	rs.getString("AccountNumber").substring(12));
        	}
        	
        }catch(Exception e) {
        	System.out.println(e);
        	
        }
        
        try {
         int bal =0;	
        	connect c8 = new connect();
        	ResultSet rs = c8.s.executeQuery("select * from bank where pin = '"+pinnum+"'");
        	
        	while(rs.next())  {
        		
        		mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;" + rs.getString("amount") + "<br><br></html>");

        		if(rs.getString("type").equals("Deposit")) {
					bal += Integer.parseInt(rs.getString("amount"));
				}else {
					bal -= Integer.parseInt(rs.getString("amount"));
				}
        	}
        
        	balance.setText("Your Account balance rs " + bal  );
        	
        }catch(Exception e) {
        	System.out.println(e);
        	
        }

        

        
		
	}
	
	
	
	
	
	
	public static void main (String args[]) {
		new MiniStatement("");
		
		
	}

}
