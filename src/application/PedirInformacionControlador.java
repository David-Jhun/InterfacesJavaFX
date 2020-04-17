package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PedirInformacionControlador {
	
	//private SampleController controlador = new SampleController();
	
	@FXML protected TextField campoNombre;
	
	@FXML protected TextField campoEdad;
	
	@FXML protected TextArea campoIntereses;

	protected String darTextoNombre() {
		String informacion;
		informacion = campoNombre.getText();
		return informacion;
	}
	
	protected String darTextoEdad() {
		String informacion;
		informacion = campoEdad.getText();
		return informacion;
	}
	
	protected String darTextoIntereses() {
		String informacion;
		informacion = campoIntereses.getText();
		return informacion;
	}
	
	@FXML protected void subir(ActionEvent e) {
		cambiarSiguienteVentana();
	}
	
	private void cambiarSiguienteVentana(){
		try {
			Stage ventanaInformacion = new Stage();
			ventanaInformacion.setTitle("Informacion del usuario.");
			ventanaInformacion.initModality(Modality.APPLICATION_MODAL);
			Parent vbox = FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(vbox);
			ventanaInformacion.setScene(scene);
			ventanaInformacion.show();
			//controlador.dondeVaNombre.setText(campoNombre.getText());//<---- Here starts the exception.
		}catch( IOException e ) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
