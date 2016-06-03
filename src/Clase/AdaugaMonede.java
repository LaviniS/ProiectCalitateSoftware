package Clase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdaugaMonede extends JFrame{
    
    private JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    private JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    private JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    private JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
  
    
    
    private JLabel e1 = new JLabel("Nume: ");
    private JLabel e2 = new JLabel("Vechime: ");
    private JLabel e3 = new JLabel("Origine: ");
    
    private JTextField t1 = new JTextField(10);
    private JTextField t2 = new JTextField(10);
    private JTextField t3 = new JTextField(10);
   
    
    
    private JButton b1 = new JButton("Adauga");
    
    public AdaugaMonede(){
        setLayout(new GridLayout(5,1));
        
        add(p1); add(p2); add(p3); add(p4); 
        
        p1.add(e1); p1.add(t1);
        p2.add(e2);p2.add(t2);
        p3.add(e3);p3.add(t3);
        
        
        p4.add(b1);
        
        b1.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent ev){
                    String nume = t1.getText();
                    int vechime = Integer.parseInt(t2.getText());
             
                    String origine = t3.getText();
                    
                    Monede mo = new Monede(nume,vechime,origine);
                    BibliotecaSingleton.getInstance().adaugaProdus(mo);
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
