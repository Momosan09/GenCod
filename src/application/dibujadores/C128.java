package application.dibujadores;

import application.dicionario.c128.Code128;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class C128 {

    private int mult = 2;
    private int pos = 0;    // posicion inicial en X
    private int alto = 10*8;
    private GraphicsContext gc;
	
    /**
     * 
     * @param gc
     * @param posInicial, El programador cliente elige la posicion inicial de donde parte el codigo
     */
    public C128(GraphicsContext gc, int posInicial) {
    	this.gc = gc;
    	this.pos = posInicial;
    }
    
    public void dibujar() {
    	quietZone();
    	startCode(Code128.START_CODE_B);
    }
	
	/**
	 * La quiet zone de la izquierda debe ser almenos 10 veces el ancho de la barra mas estrecha
	 * para la derecha tiene que ser por lo menos 2 veces el ancho de la mas estrecha
	 * @param gc
	 */
	private void quietZone() {
        int anchoBarra = 4 * mult;
        gc.setFill(Color.LIME);
        gc.fillRect(pos, 0, anchoBarra, alto);
        pos += anchoBarra;
	}
	
	
	/**
	 * especifica el codigo 128-A, 128-B, 128-C;
	 * @param gc
	 */
	private void startCode(Code128 formato) {
	    for (int i = 0; i < 11; i++) {
	        int anchoBarra = formato.val11[i] * mult;

	        if (i % 2 == 0) {
	            //Barra negra
	            gc.setFill(Color.BLACK);
	        } else {
	            //Barra blanca
	            gc.setFill(Color.WHITE);
	        }

	        // Dibuja rectangulo lleno
	        gc.fillRect(pos, 0, anchoBarra, alto);

	        // Avanza la posicion
	        pos += anchoBarra;
	    }
	}
    
}
