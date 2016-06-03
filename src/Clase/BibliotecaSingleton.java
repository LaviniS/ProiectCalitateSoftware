package Clase;

import java.io.File;
import java.io.*;
import java.util.*;

import Interfete.BibliotecaListener;
import Interfete.ObserverBiblioteca;

public class BibliotecaSingleton implements ObserverBiblioteca {
	
	private static BibliotecaSingleton singleton=null;
	private ArrayList<Produs> produse=new ArrayList<Produs>();
	private ArrayList<BibliotecaListener> listeners=new ArrayList<>();
	
	private int id;
	private String denumire;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	private BibliotecaSingleton(){}
	
	public static BibliotecaSingleton getInstance(){
		if(singleton==null){
			singleton=new BibliotecaSingleton();
			singleton.id=2;
			singleton.denumire="Biblioteca Academiei Romane";
		}
		return singleton;
		
	}
	
	public static void setInstance(BibliotecaSingleton instance){
		BibliotecaSingleton.singleton=instance;
	}
	
	//actiuni de gestiune a bibliotecii
	
	public void adaugaProdus(Produs p){  //adaugare de produse in biblioteca
		  this.produse.add(p);
	        notifyBibliotecaListener();
	    }
	    
	    public void eliminaProdus(Produs p){ //eliminarea de produse prin imprumut
	        this.produse.remove(p);
	        notifyBibliotecaListener();
	    }
	    
	    public ArrayList<Produs> getProduse(){
	        return produse;
	    }	
	    
	    //salvare produse
	    
	    public void salvareProdus(File f){
	    	try{
	    	PrintStream out=new PrintStream(f);	    		
	    		for(Produs p: produse){
	    			
	    		out.println(p);
	    		}
	    	}catch(Exception e){}
	    	
	    
	    }
	    
	    public void notifyLibrarieListener(){
	        for(BibliotecaListener m1 : listeners){
	            m1.bibliotecaModificata();
	        }
	    }
	
	


	@Override
	public void adaugaBibliotecaListener(BibliotecaListener b1) {
		// TODO Auto-generated method stub
		listeners.add(b1);
		
	}

	@Override
	public void notifyBibliotecaListener() {
		for (BibliotecaListener listener : this.listeners)
			listener.bibliotecaModificata();
	
		
	}}
	
