package Clase;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class AdaugaMuzica extends JFrame {

	    
	    private JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    private JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    private JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    private JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    private JPanel p5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    
	    
	    private JLabel e1 = new JLabel("Nume: ");
	    private JLabel e2 = new JLabel("Interpret: ");
	    private JLabel e3 = new JLabel("An Aparitie: ");
	    private JLabel e4 = new JLabel("Gen muzical: ");
	    
	    
	    private JTextField t1 = new JTextField(10);
	    private JTextField t2 = new JTextField(10);
	    private JTextField t3 = new JTextField(10);
	    private JTextField t4 = new JTextField(10);
	    
	    
	    private JButton b1 = new JButton("Adauga");
	    
	    public AdaugaMuzica(){
	        setLayout(new GridLayout(5,1));
	        
	        add(p1); add(p2); add(p3); add(p4); add(p5); 
	        
	        p1.add(e1); p1.add(t1);
	        p2.add(e2);p2.add(t2);
	        p3.add(e3);p3.add(t3);
	        p4.add(e4);p4.add(t4);
	        
	        p5.add(b1);
	        
	        b1.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent ev){
	                    String nume= t1.getText();
	                    String interpret = t2.getText();
	                    int anAparitie = Integer.parseInt(t3.getText());
	                    String genMuzical = t4.getText();
	                    
	                    Muzica m = new Muzica(nume, interpret,anAparitie,genMuzical);
	                    BibliotecaSingleton.getInstance().adaugaProdus(m);
	                    dispose();
	                }
	            }
	        );
	        pack();
	        setLocationRelativeTo(null);
	        setResizable(false);
	        setVisible(true);
	        
	    }
	}
