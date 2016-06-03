package Clase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdaugaManuscrise extends JFrame{
    
    private JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    private JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    private JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));

    
    private JLabel e1 = new JLabel("Autor: ");
    private JLabel e2 = new JLabel("An: ");
    
    
    private JTextField t1 = new JTextField(10);
    private JTextField t2 = new JTextField(10);
   
    
    
    private JButton b1 = new JButton("Adauga");
    
    public AdaugaManuscrise(){
        setLayout(new GridLayout(5,1));
        
        add(p1); add(p2); add(p3); 
        
        p1.add(e1); p1.add(t1);
        p2.add(e2);p2.add(t2);
        
        
        p3.add(b1);
        
        b1.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ev){
                    String autor= t1.getText();
                 
                    int an =  Integer.parseInt(t2.getText());
                    
                    
                    Manuscrise ma = new Manuscrise(autor, an);
                    BibliotecaSingleton.getInstance().adaugaProdus(ma);
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