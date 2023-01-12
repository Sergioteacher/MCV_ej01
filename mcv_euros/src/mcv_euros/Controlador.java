package mcv_euros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Controlador implements ActionListener{
	private Modelo modelo;
	private Vista vista;
	private Double cantidad;
	
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		
		//asociarListeners(this);                   // --> Sí es factible.
		this.vista.dolares.addActionListener(this);
		this.vista.euros.addActionListener(this);
	}
	
/*	public void asociarListeners(ActionListener listener){
	       vista.dolares.addActionListener(listener);
	       vista.euros.addActionListener(listener);
	    } */
	
	public void iniciarVista() {
		vista.setTitle("Conversor");
		vista.pack();
		//vista.getDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vista.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if(vista.euros == evento.getSource()){
			   if(!"".equals(vista.campoTexto.getText())) {
			    try{
			     cantidad = Double.parseDouble(vista.campoTexto.getText());
			     modelo.setCantidad(cantidad);
			     modelo.setMoneda(0.94);
			     modelo.convetirDolarAEuro();
			     vista.lResultado.setText(modelo.getResultado().toString());
			    }catch(NumberFormatException e) {
			     vista.lResultado.setText("Introduzca una cantidad valida...");
			    }
			   }
			  }
			  else if(vista.dolares == evento.getSource()) {
			   if(!"".equals(vista.campoTexto.getText())) {
			    try{
			     cantidad = Double.parseDouble(vista.campoTexto.getText());
			     modelo.setCantidad(cantidad);
			     modelo.setMoneda(1.06);
			     modelo.convertirEuroADolar();
			     vista.lResultado.setText(modelo.getResultado().toString());
			    }catch(NumberFormatException e) {
			     vista.lResultado.setText("Introduzca una cantidad valida...");
			    }
			   }
			  }
	}
}
