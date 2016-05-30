package juego;


import java.awt.Color;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaInicio extends JFrame implements ActionListener{
//	MenuBar barra = new MenuBar();
//	Menu ayuda = new Menu("Ayuda");
	
   
	
	public VentanaInicio(){
		setTitle("Solitario Piramide");
		//setSize(1600,900);
		setSize(1900,1900);
		//Para centrar la ventana al abrirla
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(new java.awt.Color(0, 102, 0));
		this.setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JButton boton1 = new JButton();
		boton1.setText("Jugar partida");
		boton1.setBounds(700,425,200,50);
		boton1.setBackground(new java.awt.Color(89,89,89));
		//Establece color del texto
		boton1.setForeground(Color.white);
		//Quita el marco alrededor del texto
		boton1.setFocusable(false);
		add(boton1);
       // boton1.addActionListener(this);
		
		
		


		JButton boton2 = new JButton();
		boton2.setText("Instrucciones");
		boton2.setBounds(955,425,200,50);
		boton2.setBackground(new java.awt.Color(89,89,89));
		boton2.setForeground(Color.white);
		boton2.setFocusable(false);
		add(boton2);
		//
        boton2.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		JFrame fframe = new JFrame("Solitario de Piramides");
        		fframe.setSize(1900, 1900);
        		fframe.setVisible(true);
        		//v.setVisible(false);
        		//System.exit(0);}
        	}});
        

       //JFrame frame= new JFrame();//"jFrame2" Tu colocas el nombre que le hayas puesto a tu segundo jFrame

        //frame.setVisible(true); //muestra el segundo jFrame

        //this.setVisible(false);//oculta el jFrame que estes usando
        
        
//		....boton1.addActionListener (new ActionListener(){
//			......public void actionPerformed(ActionEvent e){
//			........System.exit(0); } }
//			....);
		
		//instrucciones de boton
		

//	      setMenuBar(barra);
//	      barra.add(ayuda);
//	      ayuda.add("Instrucciones");
//	      ayuda.add("Nueva partida");
//	      ayuda.add("Salir");
	      
	}
	


}



