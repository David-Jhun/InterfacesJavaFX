package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class SampleController {
	
	private PedirInformacionControlador informacion;
	
	@FXML protected Label dondeVaNombre;
	
	@FXML protected Label dondeVaEdad;
	
	@FXML protected Label dondeVaIntereses;
	
	@FXML protected ImageView imagen;
	
	@FXML protected Button regresar;

	protected void acomodarTextoNombre() {
		dondeVaNombre.setText(informacion.darTextoNombre());
	}
	
	protected void acomodarTextoEdad() {
		dondeVaEdad.setText(informacion.darTextoEdad());
	}
	
	protected void acomodarTextoIntereses() {
		dondeVaIntereses.setText(informacion.darTextoIntereses());
	}

	@FXML protected void regresarAVentana() {
		System.exit(1);
	}
	
}
