 package com.Bank;

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class singuptwo  extends JFrame implements ActionListener{
	
	
	
	
	JTextField   pannumbertextfield, aadhartextfield; 
	JRadioButton yes, no, yes2, no2;
	JButton next;
	
	
	JComboBox religiondrop, categorydrop, incomedrop, educationdrop, occupationdrop;
	
	
	String fornum;

	singuptwo( String fornum){
		
		this.fornum = fornum;
		
	
		setLayout(null);
		getContentPane().setBackground(Color.white);
		setSize(850,800);
		setTitle("SIGN UP FORM ");
		setVisible(true);
		setLocation(350,10);
		
		
		JLabel personaldetail = new JLabel(" page 2 : " + " Additional Details");
		personaldetail.setFont(new Font("Raleway", Font.BOLD, 20));
		personaldetail.setBounds(290, 80, 400, 30);
		add(personaldetail);

		
		JLabel religion = new JLabel(" Religion : ");
		religion.setFont(new Font("Raleway", Font.BOLD, 20));
		religion.setBounds(100, 140, 400, 30);
		add(religion);
		
		
		String valreligion[] = {"hindu", "muslim", "sikh", "other"};
		
		 religiondrop = new JComboBox(valreligion);
		religiondrop.setFont(new Font("Raleway", Font.BOLD, 16));
		religiondrop.setBounds(300, 145, 400, 30);
		religiondrop.setBackground(Color.WHITE);
		add(religiondrop);
		

		JLabel category = new JLabel(" Categoty :");
		category.setFont(new Font("Raleway", Font.BOLD, 20));
		category.setBounds(100, 190, 400, 30);
		add(category);
		

		

		String valcategory[] = {"General", "Sc", "Obc", "St", "Other"};
		
		 categorydrop = new JComboBox(valcategory);
		categorydrop.setFont(new Font("Raleway", Font.BOLD, 16));
		categorydrop.setBounds(300, 195, 400, 30);
		categorydrop.setBackground(Color.WHITE);
		add(categorydrop);

		
		JLabel income = new JLabel(" Income :");
		income.setFont(new Font("Raleway", Font.BOLD, 20));
		income.setBounds(100, 240, 100, 30);
		add(income);
		
        String valincome[] = {"Null", "< 2,00,000", "< 5,00,000", "< 10,00,000"};
		
		 incomedrop = new JComboBox<Object>(valincome);
		incomedrop.setFont(new Font("Raleway", Font.BOLD, 16));
		incomedrop.setBounds(300, 245, 400, 30);
		incomedrop.setBackground(Color.WHITE);
		add(incomedrop);

		
		
	
		JLabel education = new JLabel(" Education ");
		education.setFont(new Font("Raleway", Font.BOLD, 20));
		education.setBounds(100, 290, 400, 30);
		add(education);
				
		JLabel qualification = new JLabel(" Qualification :");
		qualification.setFont(new Font("Raleway", Font.BOLD, 20));
		qualification.setBounds(100, 315, 400, 30);
		add(qualification);
		
		
		String valeducation[] = {"B.sc", "B.Tech", "M.sc", "M.Tech"};
		 educationdrop = new JComboBox<Object>(valeducation);
		educationdrop.setFont(new Font("Raleway", Font.BOLD, 16));
		educationdrop.setBounds(300, 315, 400, 30);
		educationdrop.setBackground(Color.WHITE);
		add(educationdrop);

		
		
		
		JLabel occupation = new JLabel(" Occupation :");
		occupation.setFont(new Font("Raleway", Font.BOLD, 20));
		occupation.setBounds(100, 365, 400, 30);
		add(occupation);
		
		
		String valoccup[] = {"Student", "Salaried", "Business", "Self-Employed"};
		 occupationdrop = new JComboBox<Object>(valoccup);
		occupationdrop.setFont(new Font("Raleway", Font.BOLD, 16));
		occupationdrop.setBounds(300, 365, 400, 30);
		occupationdrop.setBackground(Color.WHITE);
		add(occupationdrop);
		
		
		
		JLabel pan = new JLabel(" PAN Number:");
		pan.setFont(new Font("Raleway", Font.BOLD, 20));
		pan.setBounds(100, 415, 300, 30);
		add(pan);
		
		pannumbertextfield = new JTextField();
		pannumbertextfield.setFont(new Font ("Raleway", Font.BOLD, 14));
		pannumbertextfield.setBounds(300, 415, 400,30);
        add(pannumbertextfield);

		
        
		JLabel aadhar  = new JLabel(" Aadhar Number :");
		aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
		aadhar.setBounds(100, 465, 300, 30);
		add(aadhar);
		
		 aadhartextfield = new JTextField();
		aadhartextfield.setFont(new Font ("Raleway", Font.BOLD, 14));
        aadhartextfield.setBounds(300, 465, 400,30);
        add(aadhartextfield);

        
        
		JLabel senior = new JLabel(" Senior Citizen :");
		senior.setFont(new Font("Raleway", Font.BOLD, 20));
		senior.setBounds(100, 515, 300, 30);
		add(senior);
		
		yes = new JRadioButton(" Yes ");
		yes.setBounds(300,515,60,30);
		yes.setBackground(Color.WHITE);
		add(yes);
		
		 no = new JRadioButton(" No ");
		 no.setBounds(450,515,120,30);
		 no.setBackground(Color.WHITE);
		add(no);
		
		ButtonGroup group = new ButtonGroup();
		group.add(yes);
		group.add(no);	
		
		


		JLabel aacount = new JLabel(" Existing Account :");
		aacount.setFont(new Font("Raleway", Font.BOLD, 20));
		aacount.setBounds(100, 565, 300, 30);
		add(aacount);	

		yes2 = new JRadioButton(" Yes ");
		yes2.setBounds(300,565,60,30);
		yes2.setBackground(Color.WHITE);
		add(yes2);
		
		 no2 = new JRadioButton(" No ");
		 no2.setBounds(450,565,60,30);
		 no2.setBackground(Color.WHITE);
		add(no2);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(yes2);
		group2.add(no2);

		

		 
        

				
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
	
		String sreligion = (String) religiondrop.getSelectedItem();
		
		String scategory = (String) categorydrop.getSelectedItem();
		
		String sincome = (String) incomedrop.getSelectedItem();
		
		String seducation = (String) educationdrop.getSelectedItem();
		
		String soccupation = (String) occupationdrop.getSelectedItem();
		
		String senior = "null";
		
		if(yes.isSelected()) {
			senior = "yes";
		}else if(no.isSelected()) {
			senior = "No";
		}
		
		
		String Account = "null";
		
		if(yes2.isSelected()) {
			Account = "yes";
			
		}else if(no2.isSelected()) {
			Account = "No";
			
		}
		String pan = pannumbertextfield.getText();
		
		String aadhar = aadhartextfield.getText();
		
	

		 try {	
			 
			 if(aadhartextfield.getText().equals("")) {
				 JOptionPane.showMessageDialog(null, "Fill all the required fields");
				 
			 }else {
				 connect c2 = new connect();
			 String query2 = "insert into signuptwo values('"+fornum+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+senior+"', '"+Account+"', '"+pan+"', '"+aadhar+"')";
				 c2.s.executeUpdate(query2);
				
				 new singupthree(fornum).setVisible(true);
				 setVisible(false);
				 
			 }
				 
			 
		 }catch(Exception e1) {
			  e1.printStackTrace();
		 }
		
		
	} 
	
	
	public static void main(String args[]) {
	
		new singuptwo("").setVisible(true);
		
	}
}
