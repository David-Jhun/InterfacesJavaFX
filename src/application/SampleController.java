package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class SampleController {
	
	private PedirInformacionControlador informacion;
	
	@FXML protected Label dondeVaNombre;
	
	@FXML protected Label dondeVaEdad;
	
	@FXML protected Label dondeVaIntereses;
	
	@FXML protected ImageView imagen;
	
	public SampleController() {
		dondeVaNombre = new Label();
		dondeVaEdad = new Label();
		dondeVaIntereses = new Label();
	}

	@FXML protected void regresarAVentana() {
		dondeVaNombre.setText(informacion.darTextoNombre());
		dondeVaEdad.setText(informacion.darTextoEdad());
		dondeVaIntereses.setText(informacion.darTextoIntereses());
	}
	
}
