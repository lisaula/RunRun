package luis.carlos.mijuego;


import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class InstButton extends Boton {
	Image i;
	public InstButton(int x, int y, Image b) {
		super(x, y, b);
		
	}

	@Override
	public void funcionamiento() {
		// TODO Auto-generated method stub
		Screens.JUEGO.setScreen(Screens.INSTRUCTIONS);
	}

}
