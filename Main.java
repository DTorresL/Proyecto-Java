package juego;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main {
	static int  x = 1;
	

	public static void main(String[] args) throws InterruptedException {
		
				
		final Funciones obj = new Funciones();
		System.out.println("\n meter \n");
		obj.MeterCartas();
		System.out.println("\n barajado \n");
		obj.barajarCartas();
		System.out.println("\n Piramide \n");
		obj.Piramide();
		System.out.println("\n Mazo \n");
		obj.Mazo();
		
		//VentanaInicio v= new VentanaInicio();
		//v.setVisible(true);
		//
		
		final JFrame menu = new JFrame("Menú Solitario Pirámide");
		menu.setSize(1900, 1900);
		menu.setVisible(true);
		//Para centrar la ventana al abrirla
		menu.setLocationRelativeTo(null);
		menu.getContentPane().setBackground(new java.awt.Color(0, 102, 0));
		menu.setLayout(null);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton boton1 = new JButton();
		boton1.setText("Jugar partida");
		boton1.setBounds(700,425,200,50);
		boton1.setBackground(new java.awt.Color(89,89,89));
		//Establece color del texto
		boton1.setForeground(Color.white);
		//Quita el marco alrededor del texto
		boton1.setFocusable(false);
		menu.add(boton1);
		
		JButton boton2 = new JButton();
		boton2.setText("Instrucciones");
		boton2.setBounds(955,425,200,50);
		boton2.setBackground(new java.awt.Color(89,89,89));
		boton2.setForeground(Color.white);
		boton2.setFocusable(false);
		menu.add(boton2);
		
		
		
		//
		
			
		final JFrame frame = new JFrame("Solitario de Piramides");
		frame.setSize(1900, 1900);

		 
        JPanel panel = new JPanel();
        Color tapetecolor = Color.decode("#336600");
        panel.setBackground(tapetecolor);

        
        final JButton[] cartasP = new JButton[41];
        JTextArea tempor = new JTextArea();
        tempor.setBounds(50, 50, 90, 35); 
        Font font = new Font("Monospaced", Font.BOLD, 30);
        tempor.setFont(font);
        panel.add(tempor);
        
        JLabel tecnica = new JLabel("Caja enseña posicion de carta selecionada, uso tecnico");
        tecnica.setBounds(50, 450, 500, 30);
        panel.add(tecnica);
        final JTextArea Valor1 = new JTextArea();
        Valor1.setBounds(50, 500, 50, 50);
        panel.add(Valor1);
        int incre= 900;
        int incre2= 850;
        int incre3= 800;
        int incre4= 750;
        int incre5= 700;
        
        for(int i = 21;i>=1;i--){
        cartasP[i-1] = new JButton();
        cartasP[i-1].setIcon(new ImageIcon(  obj.PiramideID(i)+".jpg"));
        
        
        
       cartasP[i-1].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	
            	for(int i = 21;i>=0;i--){
            		
            		if(e.getSource() == cartasP[i]){
            		 Valor1.setText(String.valueOf(i));	
                		
            		
            		}}}});   
       
        if(i==1){
        	 cartasP[i-1].setBounds(950, 100, 90, 135);
        }
        if(i>=2 && i<=3){
        	cartasP[i-1].setBounds(incre, 200, 90, 135);
        	incre+=100;
        }
        if(i>=4 && i<=6){
        	cartasP[i-1].setBounds(incre2, 300, 90, 135);
        	incre2+=100;
        }
        if(i>=7 && i<=10){
        	cartasP[i-1].setBounds(incre3, 400, 90, 135);
        	incre3+=100;
        }
        if(i>=11 && i<=15){
        	cartasP[i-1].setBounds(incre4, 500, 90, 135);
        	incre4+=100;
        }
        if(i>=16 && i<=21){
        	cartasP[i-1].setBounds(incre5, 600, 90, 135);
        	incre5+=100;
        }
        panel.add(cartasP[i-1]);
       
        }
        Valor1.setText(null);
        
        
        
        
        
        panel.add(tempor);
        final JButton cartasM = new JButton();
        
          
        cartasM.setIcon(new ImageIcon(obj.MazoID(x)+".jpg"));  
        cartasM.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {         		
            		if(e.getSource() == cartasM){
            		String m = "22";
                	Valor1.setText(String.valueOf(m));	
                		
            		
            		}}});
        cartasM.setBounds(500, 100, 90, 135); 
        panel.add(cartasM);
        
        JButton cartaBack = new JButton();  
        
        cartaBack = new JButton();
        cartaBack.setIcon(new ImageIcon(  "back.jpg"));
        
        
        cartaBack.addActionListener(new ActionListener (){
       	 public void actionPerformed(ActionEvent e){
       		      		 
       		 cartasM.setIcon(new ImageIcon(obj.MazoID(x)+".jpg"));
       		 x += 1;
       		 if(x==18){
       			 x=0;
       		 }
            //obj.toString();
    		 
    	 }
       	 
    	
    });
        
     
        

        
        
        int minuto, minutos, segundos, milisegundos;
        minuto = 0;
        minutos = 0;
        segundos = 0;
        milisegundos = 0;
        int[] Valores = new int[2];
        Valores[0]= 0;
        Valores[1]= 0;
        int Suma;
        int[] Borrar = new int[2];
        boolean para = true;
        boolean usado1 = false;
        boolean usado2 = false;
        while(minuto != 9 || minutos != 9) {
        	
     	
        	
            if( Valor1.getText().isEmpty() != true && Valores[0]== 0){
            	if((Integer.valueOf(Valor1.getText())+1) >= 0 && (Integer.valueOf(Valor1.getText()) < 21 )) {
            	Valores[0]=obj.PiramideNum(Integer.valueOf(Valor1.getText())+1);
            	usado1=false;
            	}
            	else if((Integer.valueOf(Valor1.getText())) >= 22){
            		Valores[0]=obj.MazoNum(x);
            		usado1=true;
            	}
            	Borrar[0] =Integer.valueOf(Valor1.getText());
            	System.out.println(Valores[0]);
            	Valor1.setText("");
            
            	
            }  if( Valor1.getText().isEmpty() != true && Valores[1]== 0 && Valores[0]!= 0) {
            	if((Integer.valueOf(Valor1.getText())+1) >= 0 && (Integer.valueOf(Valor1.getText()) < 21 )) {
            	Valores[1]=obj.PiramideNum(Integer.valueOf(Valor1.getText())+1);
            	usado2 = false;
            	}
            	else if((Integer.valueOf(Valor1.getText())) >= 22){
            		Valores[1]=obj.MazoNum(x);
            		usado2 = true;
            		
            	}
            	Borrar[1] = (Integer.valueOf(Valor1.getText()));
            	System.out.println(Valores[1]);
            	Valor1.setText("");
            	para = true;
          
            }
            if(Valores[0]==10 && usado1 == false){
            	JOptionPane.showMessageDialog(null, "Es igual a 10!");
            	cartasP[Borrar[0]].setVisible(false);
            	Valor1.setText("");
            	Valores[0]= 0;
            }
            
            
            
            
            
            
            if(Valores[0]!= 0 && Valores[1]!= 0 && para ==true){
            	Suma =  Valores[1] +  Valores[0];
            	
            	System.out.println("resultado"+ Suma);
            	para = false;
            	if(Suma == 10){
            		JOptionPane.showMessageDialog(null, "bien hecho!");
            		if(usado1==false){
            		cartasP[Borrar[0]].setVisible(false);}
            		else if(usado1==true){
            			x= x +1;
            		}
            		if(usado2==false){
            		cartasP[Borrar[1]].setVisible(false);}
            		else if(usado2==true){
            			x= x +1;
            		}
            		Valores[0]= 0;
                    Valores[1]= 0;
            		
            	}
            	if(Suma != 10){
            		JOptionPane.showMessageDialog(null, "No te da resultado de 10!");
            		Valores[0]= 0;
                    Valores[1]= 0;
            	}
            	
            }
            
            
            
            
            
            
            
            
            
            
            
            
        	
            Thread.sleep(1000);
            milisegundos = milisegundos + 1;
            if(milisegundos > 9) {
                milisegundos = 0;
                segundos = segundos + 1;
            }
            if(segundos > 5) {
                segundos = 0;
                minutos = minutos + 1;
            }
            if(minutos > 9) {
                minutos = 0;
                minuto = minuto + 1;
            }
            
			tempor.setText(null);
			
			tempor.append(String.valueOf(minuto)+ String.valueOf(minutos)+  ":" + String.valueOf(segundos)+ String.valueOf(milisegundos));
			
			 if(minuto == 9 && minutos == 9) {
	                System.out.println("Tiempo agotado");
	            }
        cartaBack.setBounds(400, 100, 90, 135); 
        panel.add(cartaBack);
        panel.setLayout(null);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setVisible(false);	
        
        //
        final JFrame instrucciones = new JFrame("Solitario de Piramides");
        instrucciones.setSize(1900, 1900);
        instrucciones.setVisible(false);
        instrucciones.setSize(1900, 1900);
        //Para centrar la ventana al abrirla
       instrucciones.setLocationRelativeTo(null);
       instrucciones.setContentPane(new JLabel(new ImageIcon("imagenes/fondo2.jpg")));

        instrucciones.getContentPane().setBackground(new java.awt.Color(0, 102, 0));
        instrucciones.setLayout(null);
        //instrucciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    	       
        
        boton1.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e1){
        		frame.setVisible(true);
        		menu.setVisible(false);
        		//if (frame.isVisible()){
        			//menu.dispose();
        			//menu.setVisible(false);
        			//menu.h
        		//}
        		
        		//v.setVisible(false);
        		//System.exit(0);}
        	}});
        
        boton2.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		//JFrame fframe = new JFrame("Solitario de Piramides");
        		//fframe.setSize(1900, 1900);
        		//fframe.setVisible(true);
        		instrucciones.setVisible(true);
        		//menu.setVisible(false);
        		

        	}});
   
        
        
	}}}
	

