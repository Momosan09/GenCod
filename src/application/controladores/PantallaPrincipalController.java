package application.controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

public class PantallaPrincipalController {

	@FXML
	private Button btnGenerar;
	private TextArea textAreaCodigos;
	private ImageView imgViewCodigo;
	
	@FXML
	public void initialize() {

	}
	
	
	@FXML
	public void generarCodigo() {
		System.out.println("click");
	}
}
