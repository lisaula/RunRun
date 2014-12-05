package luis.carlos.mijuego;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public abstract class Boton extends Actor { // Clase abstracta que representa un botón cuyo comportamiento sera diferente dependiendo de los distintos tipos de botones que se tengan
	protected Texture texture; // Textura del botón. Se asigna en el hijo
	protected Rectangle bordes; // El rectangulo que establece la posición, altura y anchura del botón
	
	protected float xMinima; // Estos atributos sirven para poner las coordenadas para pulsar el botón.
	protected float yMinima;
	protected float xMaxima;
	protected float yMaxima;
	Image b;

	public Boton(int x, int y, Image b) {
		this.b =b ;
		b.setHeight(80);
		b.setWidth(250);
		b.setX(x);
		b.setY(y);
		 // Para poner el ancho y alto de los botones. Suponemos que todos serán igual
		bordes = new Rectangle(x, y, 250, 80);
		
		// Permite asignar los bordes del botón para su correcto funcionamiento.
		xMinima = bordes.x;
		yMaxima = Gdx.graphics.getHeight() - bordes.y;
		xMaxima = bordes.x + bordes.width;
		yMinima = Gdx.graphics.getHeight() - (bordes.y + bordes.height);
	}

	
@Override
	public void draw(Batch batch, float parentAlpha) {
		// TODO Auto-generated method stub
		super.draw(batch, parentAlpha);
		b.draw(batch, parentAlpha);
	}
	public void update() {
		if(sePulsaElBoton())
			funcionamiento();
	}
	private boolean sePulsaElBoton() { // Esta función privada sirve para comprobar si se pulsa el botón.
		return Gdx.input.isTouched() && Gdx.input.getX() >= xMinima && Gdx.input.getX() <= xMaxima && // Devuelve true si se pulsa dentro de los límites
			   Gdx.input.getY() >= yMinima && Gdx.input.getY() <= yMaxima;
	}

	public abstract void funcionamiento(); // Método que implementarán las clases hijas y contendrá el comportamiento deseado
	

	
	// Getters and Setters ------------------------------------------------------------------------

	public Rectangle getBordes() {
		return bordes;
	}

	public void setBordes(Rectangle bordes) {
		this.bordes = bordes;
	}
}
