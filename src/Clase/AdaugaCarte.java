package Clase;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdaugaCarte extends JFrame{
	private JPanel p1=new JPanel(new FlowLayout(FlowLayout.LEFT));
	 private JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    private JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    private JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    private JPanel p5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    private JPanel p6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    
	    private JLabel e1 = new JLabel("ID: ");
	    private JLabel e2 = new JLabel("Nume: ");
	    private JLabel e3 = new JLabel("Cota: ");
	    private JLabel e4 = new JLabel("Domeniu: ");
	    private JLabel e5 = new JLabel("Autor: ");
	    
	    private JTextField t1 = new JTextField(10);
	    private JTextField t2 = new JTextField(10);
	    private JTextField t3 = new JTextField(10);
	    private JTextField t4 = new JTextField(10);
	    private JTextField t5 = new JTextField(10);
	    
	    private JButton b1 = new JButton("Adauga");
	    
	    public AdaugaCarte(){
	        setLayout(new GridLayout(6,1));
	        
	        add(p1); add(p2); add(p3); add(p4); add(p5); add(p6);
	        
	        p1.add(e1); p1.add(t1);
	        p2.add(e2);p2.add(t2);
	        p3.add(e3);p3.add(t3);
	        p4.add(e4);p4.add(t4);
	        p5.add(e5);p5.add(t5);
	        p6.add(b1);
	        
	        b1.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent ev){
	                    int id = Integer.parseInt(t1.getText());
	                    String nume = t2.getText();
	                   int cota = Integer.parseInt(t3.getText());
	                    
	                    String domeniu  = t4.getText();
	                    String autor = t5.getText();
	                    Carte c = new Carte( cota,domeniu,autor);
	                    BibliotecaSingleton.getInstance().adaugaProdus(c);
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
