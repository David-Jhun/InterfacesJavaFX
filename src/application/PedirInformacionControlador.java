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
	
	@FXML protected TextField campoNombre;
	
	@FXML protected TextField campoEdad;
	
	@FXML protected TextArea campoIntereses;

	@FXML protected void subir(ActionEvent e) {
		cambiarSiguienteVentana();
	}
	
	private void cambiarSiguienteVentana(){
		try {
			Stage stage = new Stage();
			stage.setTitle("Informacion ingresada.");
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("Sample.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			SampleController controlador = loader.getController();
			controlador.dondeVaNombre.setText(campoNombre.getText());
			controlador.dondeVaEdad.setText(campoEdad.getText());
			controlador.dondeVaIntereses.setText(campoIntereses.getText());
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(scene);
			stage.showAndWait();
		}catch( IOException e ) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
