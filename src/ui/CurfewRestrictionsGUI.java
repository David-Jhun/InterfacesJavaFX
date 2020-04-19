package ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.CurfewRestrictions;

public class CurfewRestrictionsGUI {

    @FXML
    private TextField age;
    
    private CurfewRestrictions curfew;

    @FXML
    protected void showRecommendation(ActionEvent event) {
    	curfew = new CurfewRestrictions();
    	try {
    		int option = Integer.parseInt(age.getText());
    		String message = curfew.canIGoOutside(option);
    		if( message != null ) {
    			if( option < 22 ) {
    				Stage stage = new Stage();
    				stage.setTitle("Option 1.");
    				VBox vbox = new VBox(20);
    				StackPane stackForImage = new StackPane();
    				ImageView image = new ImageView("imagenes/child.PNG");
    				stackForImage.getChildren().add(image);
    				StackPane stackForText = new StackPane();
    				Label text = new Label(message);
    				stackForText.getChildren().add(text);
    				vbox.getChildren().addAll(stackForImage, stackForText);
    				Scene scene = new Scene(vbox);
    				stage.setScene(scene);
    				stage.initModality(Modality.APPLICATION_MODAL);
    				stage.show();
    			}else if( option >= 22 && option < 60 ) {
    				Stage stage = new Stage();
    				stage.setTitle("Option 2.");
    				VBox vbox = new VBox(20);
    				StackPane stackForImage = new StackPane();
    				ImageView image = new ImageView("imagenes/adult.PNG");
    				stackForImage.getChildren().add(image);
    				StackPane stackForText = new StackPane();
    				Label text = new Label(message);
    				stackForText.getChildren().add(text);
    				vbox.getChildren().addAll(stackForImage, stackForText);
    				Scene scene = new Scene(vbox);
    				stage.setScene(scene);
    				stage.initModality(Modality.APPLICATION_MODAL);
    				stage.show();
    			}else if( option >= 60 ) {
    				Stage stage = new Stage();
    				stage.setTitle("Option 3.");
    				VBox vbox = new VBox(20);
    				StackPane stackForImage = new StackPane();
    				ImageView image = new ImageView("imagenes/grand.PNG");
    				stackForImage.getChildren().add(image);
    				StackPane stackForText = new StackPane();
    				Label text = new Label(message);
    				stackForText.getChildren().add(text);
    				vbox.getChildren().addAll(stackForImage, stackForText);
    				Scene scene = new Scene(vbox);
    				stage.setScene(scene);
    				stage.initModality(Modality.APPLICATION_MODAL);
    				stage.show();
    			}
    		}
    	}catch( NumberFormatException e ) {
    		Stage stage = new Stage();
    		stage.setTitle("Error!");
    		VBox vbox = new VBox(20);
    		StackPane stackForLabel = new StackPane();
    		Label message = new Label("Error, enter a valid option.");
    		StackPane stackForButton = new StackPane();
    		Button buttonClose = new Button("Cerrar");
    		buttonClose.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					stage.close();
				}
			});
    		stackForLabel.getChildren().add(message);
    		stackForButton.getChildren().add(buttonClose);
    		vbox.getChildren().addAll(stackForLabel, stackForButton);
    		Scene scene = new Scene(vbox, 250, 80);
    		stage.setScene(scene);
    		stage.initModality(Modality.APPLICATION_MODAL);
    		stage.show();
    	}
    }

}

