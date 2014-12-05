package luis.carlos.mijuego;

import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class PlayButton extends Boton {

	public PlayButton(int x, int y, Image b) {
		super(x, y, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void funcionamiento() {
		// TODO Auto-generated method stub
		Screens.JUEGO.setScreen(Screens.GAME_SCREEN);
	}

}
