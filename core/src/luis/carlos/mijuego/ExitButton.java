package luis.carlos.mijuego;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class ExitButton extends Boton {
	
	public ExitButton(int x, int y, Image b) {
		super(x, y, b);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void funcionamiento() {
		// TODO Auto-generated method stub
		Gdx.app.exit(); // Cierra la aplicación
	}

}
