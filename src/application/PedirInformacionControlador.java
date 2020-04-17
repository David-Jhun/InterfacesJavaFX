package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PedirInformacionControlador {
	
	private SampleController controlador;
	
	@FXML protected TextField campoNombre;
	
	@FXML protected TextField campoEdad;
	
	@FXML protected TextArea campoIntereses;
	
	@FXML protected Button botonAgregar;

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
			VBox vbox = (VBox)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			ventanaInformacion.initModality(Modality.APPLICATION_MODAL);
			Scene scene = new Scene(vbox);
			ventanaInformacion.setScene(scene);
			ventanaInformacion.show();
			controlador.dondeVaNombre.setText(darTextoNombre());
			controlador.dondeVaEdad.setText(darTextoEdad());
			controlador.dondeVaIntereses.setText(darTextoIntereses());
		}catch( IOException e ) {
			System.out.println(e.getMessage());
		}
	}

}
