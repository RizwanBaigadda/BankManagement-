 package com.Bank;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.util.*;
import com.toedter.calendar.JDateChooser;

public class singupone  extends JFrame implements ActionListener{
	
	
	long Random ;
	
	JTextField nametextfield, ftextfield, emailtextfield, addresstextfield, citytextfield, statetextfield, pintextfield;
	JRadioButton male, female, married, unmarried, other;
	JButton next;
	JDateChooser date;

	singupone(){
		
	
		setLayout(null);
		getContentPane().setBackground(Color.white);
		setSize(850,800);
		setTitle("SIGN UP FORM ");
		setVisible(true);
		setLocation(350,10);
		
		Random ran = new Random();
		 long random = Math.abs((ran.nextLong() % 9000L) + 1000L );
		
		JLabel formnum = new JLabel("APPLICATION NUMBER : " + random);
		formnum.setFont(new Font("Raleway", Font.BOLD, 30));
		formnum.setBounds(190, 20, 600, 40);
		add(formnum);
		
		JLabel personaldetail = new JLabel(" page 1 : " + " Personal Details");
		personaldetail.setFont(new Font("Raleway", Font.BOLD, 20));
		personaldetail.setBounds(290, 80, 400, 30);
		add(personaldetail);

		
		JLabel name = new JLabel(" Name :");
		name.setFont(new Font("Raleway", Font.BOLD, 20));
		name.setBounds(100, 140, 100, 30);
		add(name);
		
		 nametextfield = new JTextField();
		nametextfield.setFont(new Font ("Raleway", Font.BOLD, 14));
        nametextfield.setBounds(300, 140, 400,30);
        add(nametextfield);

		JLabel FName = new JLabel(" FName :");
		FName.setFont(new Font("Raleway", Font.BOLD, 20));
		FName.setBounds(100, 190, 100, 30);
		add(FName);
		
		 ftextfield  = new JTextField();
		ftextfield.setFont(new Font ("Raleway", Font.BOLD, 14));
        ftextfield.setBounds(300, 190, 400,30);
        add(ftextfield);


		
		JLabel dob = new JLabel(" Dob :");
		dob.setFont(new Font("Raleway", Font.BOLD, 20));
		dob.setBounds(100, 240, 100, 30);
		add(dob);
		
		 date = new JDateChooser();
		date.setBounds(300, 240, 400, 30);
		add(date);

		JLabel Gender = new JLabel(" Gender:");
		Gender.setFont(new Font("Raleway", Font.BOLD, 20));
		Gender.setBounds(100, 290, 100, 30);
		add(Gender);
		
		 male = new JRadioButton("Male");
		male.setBounds(300,290,60,30);
		male.setBackground(Color.WHITE);
		add(male);
		
		 female = new JRadioButton("Female");
		female.setBounds(450,290,120,30);
		female.setBackground(Color.WHITE);
		add(female);
		
		ButtonGroup group = new ButtonGroup();
		group.add(male);
		group.add(female);
		
		
		JLabel email = new JLabel(" Email :");
		email.setFont(new Font("Raleway", Font.BOLD, 20));
		email.setBounds(100, 340, 100, 30);
		add(email);
		
		 emailtextfield = new JTextField();
		emailtextfield.setFont(new Font ("Raleway", Font.BOLD, 14));
        emailtextfield.setBounds(300, 340, 400,30);
        add(emailtextfield);


		JLabel martialstatus = new JLabel(" Martial Status :");
		martialstatus.setFont(new Font("Raleway", Font.BOLD, 20));
		martialstatus.setBounds(100, 390, 300, 30);
		add(martialstatus);
		

		 married = new JRadioButton("Married");
		married.setBounds(300,390,100,30);
		married.setBackground(Color.WHITE);
		add(married);
		
		 unmarried = new JRadioButton("Unmarried");
		unmarried.setBounds(450,390,100,30);
		unmarried.setBackground(Color.WHITE);
		add(unmarried);
		

		 other = new JRadioButton("Other");
		other.setBounds(630,390,100,30);
		other.setBackground(Color.WHITE);
		add(other);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(married);
		group2.add(unmarried);
		group2.add(other);
		
		

		JLabel address = new JLabel(" Address :");
		address.setFont(new Font("Raleway", Font.BOLD, 20));
		address.setBounds(100, 440, 300, 30);
		add(address);
		

		 addresstextfield = new JTextField();
		addresstextfield.setFont(new Font ("Raleway", Font.BOLD, 14));
        addresstextfield.setBounds(300, 440, 400,30);
        add(addresstextfield);

		JLabel city = new JLabel(" City :");
		city.setFont(new Font("Raleway", Font.BOLD, 20));
		city.setBounds(100, 490, 300, 30);
		add(city);
		

		 citytextfield = new JTextField();
		citytextfield.setFont(new Font ("Raleway", Font.BOLD, 14));
        citytextfield.setBounds(300, 490, 400,30);
        add(citytextfield);

		JLabel state = new JLabel(" State:");
		state.setFont(new Font("Raleway", Font.BOLD, 20));
		state.setBounds(100, 540, 300, 30);
		add(state);

		

		 statetextfield = new JTextField();
		statetextfield.setFont(new Font ("Raleway", Font.BOLD, 14));
        statetextfield.setBounds(300, 540, 400,30);
        add(statetextfield);

        

		JLabel pincode = new JLabel(" pincode:");
		pincode.setFont(new Font("Raleway", Font.BOLD, 20));
		pincode.setBounds(100, 590, 300, 30);
		add(pincode);


		 pintextfield = new JTextField();
		pintextfield.setFont(new Font ("Raleway", Font.BOLD, 14));
        pintextfield.setBounds(300, 590, 400,30);
        add(pintextfield);
		
		
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,640, 80, 30);
        next.addActionListener(this);
        add(next);
        
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String formnum = " " + Random;
		 String name = nametextfield.getText();
		 String fname = ftextfield.getText();
		 String dob = ((JTextField) date.getDateEditor().getUiComponent()).getText();
		 String gender = null;
		 if(male.isSelected()) {
			 gender = "male";
		 }else if(female.isSelected()) {
			 gender = "female";
		 }
		 String status = null;
		 if(married.isSelected()) {
			 status = "married";
			
		 }else if(unmarried.isSelected()) {
			 status = "unmarried";
			 
		 }else if(other.isSelected()) {
			 status = "other";
		 }
		 
		 String email = emailtextfield.getText();
		 String adress = addresstextfield.getText();
		 String city = citytextfield.getText();
		 String state = statetextfield.getText();
		 String pin = pintextfield.getText();
		 
		 
		 
		 try {
			 
			 if(name.equals("")) {
				 JOptionPane.showMessageDialog(null, "name must be required");
			 }else {
				 connect c1 = new connect();
			 String query1 = "insert into signup values('"+formnum+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+status+"', '"+email+"', '"+adress+"',  '"+city+"', '"+state+"', '"+pin+"' 	)";
				 c1.s.executeUpdate(query1);
				 
				 setVisible(false);
				 
				 new singuptwo(formnum).setVisible(true);
				 
			 }
			 
			 
		 }catch(Exception e1) {
			 System.out.println(e1);
		 }
		
		
	}
	
	
	public static void main(String args[]) {
	
		new singupone();
		
	}


	
		
}
