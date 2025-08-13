package application.controladores;

import java.awt.Image;
import java.awt.image.BufferedImage;

import application.dibujadores.C128;
import application.dicionario.c128.Code128;

import java.awt.Graphics2D;
import java.awt.color.*;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class PantallaPrincipalController {

	
	@FXML private Button btnGenerar;
	@FXML private TextArea textAreaCodigos;
	@FXML private ImageView imgViewCodigo;
	@FXML private Canvas canvasBr;
	@FXML private AnchorPane root;
	
	private GraphicsContext gc;
	
	@FXML
	public void initialize() {
		
		dibujarImagen();
	}
	
	
	@FXML
	public void generarCodigo() {
		System.out.println(textAreaCodigos.getText());
	}

	
//	private Image crearImagen() {
//		BufferedImage img = new BufferedImage(20,10, BufferedImage.TYPE_INT_ARGB);
//		dibujarImagen(img);
//		return img;
//	}
	
	
	private void dibujarImagen() {
	    gc = canvasBr.getGraphicsContext2D();
	    C128 cD = new C128(gc, 0);
	       
	    cD.dibujar();
	}
	




}
