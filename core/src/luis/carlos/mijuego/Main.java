package luis.carlos.mijuego;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.audio.Music;


public class Main extends Game implements InputProcessor {
	Music musica;
	boolean empezar = false, perdio = false, entro = false, again = false;;
	public GameScreen test;
	

	@Override
	public void create() {
		musica = Gdx.audio.newMusic(Gdx.files.getFileHandle("Theme.mp3",
				FileType.Internal));
		musica.setLooping(true);
		musica.play();
		Screens.JUEGO = this;
		Screens.GAME_SCREEN = new GameScreen(this);
		Screens.MAIN_SCREEN = new MenuScreen(this);
		Screens.INSTRUCTIONS = new Instructions(this);
		Screens.GAME_OVER = new GameOver(this);
		//test = new GameScreen(this);
		setScreen(Screens.MAIN_SCREEN);
		//Screens.MAIN_SCREEN
		
		//Gdx.input.setInputProcessor(this);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		super.dispose();
		
		Screens.GAME_SCREEN.dispose();
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		// System.out.println("test");\
		return false;
	}

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
