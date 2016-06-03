package Main;

import javax.swing.*;

import Clase.AdaugaCarte;
import Clase.AdaugaManuscrise;
import Clase.AdaugaMonede;
import Clase.AdaugaMuzica;
import Clase.BibliotecaSingleton;
import Clase.Carte;
import Clase.Produs;
import Interfete.BibliotecaListener;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;

public class MainFrame extends JFrame {
	
	private JPanel p1=new JPanel(new FlowLayout(FlowLayout.LEFT));
	private DefaultListModel<Produs>model1=new DefaultListModel<Produs>();
	private JList<Produs>lista1=new JList(model1);
	private JScrollPane jsp1=new JScrollPane(lista1);
	
	private JPanel p2=new JPanel(new FlowLayout(FlowLayout.LEFT));
	private DefaultListModel<Produs>model2=new DefaultListModel<Produs>();
	private JList<Produs>lista2=new JList(model2);
	private JScrollPane jsp2=new JScrollPane(lista2);
	
	private JPanel p3=new JPanel(new FlowLayout(FlowLayout.LEFT));
	private DefaultListModel<Produs>model3=new DefaultListModel<Produs>();
	private JList<Produs>lista3=new JList(model3);
	private JScrollPane jsp3=new JScrollPane(lista3);
	
	private JPanel p4=new JPanel(new FlowLayout(FlowLayout.LEFT));
	private DefaultListModel<Produs>model4=new DefaultListModel<Produs>();
	private JList<Produs>lista4=new JList(model4);
	private JScrollPane jsp4=new JScrollPane(lista4);
	
	private JMenuBar mb=new JMenuBar();
	private JMenu m1=new JMenu("Optiuni");
	private JMenuItem mi1=new JMenuItem("Adauga carte");
	private JMenuItem mi2=new JMenuItem("Adauga muzica");
	private JMenuItem mi3=new JMenuItem("Adauga moneda");
	private JMenuItem mi4=new JMenuItem("Adauga manuscris");
	private JMenuItem mi5=new JMenuItem("Salveaza produse");
	
	private JLabel e1=new JLabel("Carti");
	private JLabel e2=new JLabel("Muzica");
	private JLabel e3=new JLabel("Monede");
	private JLabel e4=new JLabel("Manuscrise");
	
	
	
	private JPanel p5=new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JLabel e5=new JLabel("Nr produse:0");
	
	
	public MainFrame(){
		super("Gestiune Biblioteca(BAR)");
		setLayout(new GridLayout(3,1));
		setJMenuBar(mb);
		mb.add(m1);
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(mi4);
		m1.add(mi5);
		
		add(p1); add(p2); add(p3); add(p4); add(p5);
			
		p1.add(e1); p2.add(e2); p3.add(e3); p4.add(e4); p5.add(e5);
		p1.add(jsp1); p2.add(jsp2); p3.add(jsp3); p4.add(jsp4);
	
		
		BibliotecaSingleton.getInstance().adaugaBibliotecaListener(
		            new BibliotecaListener(){
		                public void bibliotecaModificata(){
		                    afisareProdus();
		                }
	                
		            }
		        );
		        
		        mi1.addActionListener(
		            new ActionListener(){
		                public void actionPerformed(ActionEvent ev){
		                    new AdaugaCarte();
		                }
		            }
		        );
		        
		        mi2.addActionListener(
		            new ActionListener(){
		                public void actionPerformed(ActionEvent ev){
		                    new AdaugaMuzica();
		                }
		            }
		        );
		        mi3.addActionListener(
			            new ActionListener(){
			                public void actionPerformed(ActionEvent ev){
			                    new AdaugaMonede();
			                }
			            }
			        );
		        mi4.addActionListener(
			            new ActionListener(){
			                public void actionPerformed(ActionEvent ev){
			                    new AdaugaManuscrise();
			                }
			            }
			        );
		        
		        mi5.addActionListener(
		                new ActionListener(){
		                    public void actionPerformed(ActionEvent ev){
		                        JFileChooser chooser = new JFileChooser();
		                        int r = chooser.showSaveDialog(null);
		                        if(r == JFileChooser.APPROVE_OPTION){
		                            File file = chooser.getSelectedFile();
		                            BibliotecaSingleton.getInstance().salvareProdus(file);
		                            JOptionPane.showMessageDialog(null, "Produsele au fost salvate.");
		                        }
		                    }
		                }
		            );
		    
		        
		      new Thread(){
		            public void run(){
		                while(true){
		                    try{
		                    Thread.sleep(2000);
		                    e5.setText("Nr produse: "+BibliotecaSingleton.getInstance().getProduse().size());
		                
		                }catch(InterruptedException e){}
		                }
		                
		            }
		        }.start(); 
		       
		setSize(700,700);
		setLocationRelativeTo(null);
		setVisible(true);
	}
		 public void afisareProdus(){
		       /* model1.clear();
		        model2.clear();
		        model3.clear();
		        model4.clear();*/
		        
		        ArrayList<Produs> produse = BibliotecaSingleton.getInstance().getProduse();
		        for(Produs p : produse){
		            if(p instanceof Carte){
		                model1.addElement(p);
		            }else{
		                model2.addElement(p);
		            } 
		            
		            
		        }
		    }
		
		
		
	
	}
	

	
	
	