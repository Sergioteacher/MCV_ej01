package mcv_euros;

//import mcv_euros.Modelo;
//import mcv_euros.Vista;
//import mcv_euros.Controlador;

//import javax.swing.UIManager;
//import javax.swing.UnsupportedLookAndFeelException;



public class Mcv_euros {

	public static void main(String[] args) {
			/*	try {
			   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			  }
			  catch (UnsupportedLookAndFeelException e) {
			  }
			  catch (ClassNotFoundException e) {
			  }
			  catch (InstantiationException e) {
			  }
			  catch (IllegalAccessException e) {
			  } */
		Modelo modelo = new Modelo();
		Vista vista = new Vista();
		Controlador controlador = new Controlador(modelo,vista);
		controlador.iniciarVista();
	}

}
