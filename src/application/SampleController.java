package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class SampleController {
	
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
		System.exit(1);
	}
	
}
