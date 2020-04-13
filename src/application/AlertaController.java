package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AlertaController implements Initializable{

    @FXML
    private Button button;
    @FXML
    private Label labelOlaMundo;

    @FXML
    public void AcaoDoBotao(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
     
        alert.setContentText("Voce clicou no botao");
        alert.show();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}

