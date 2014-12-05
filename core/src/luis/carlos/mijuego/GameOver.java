package luis.carlos.mijuego;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class GameOver extends PantallaBase {
	Image o;
	Stage stage;
	public GameOver(Main game) {
		super(game);
		o = new Image(new Texture("gameover2.png"));
		stage = new Stage();
		
		o.setHeight(Gdx.graphics.getHeight());
		o.setWidth(Gdx.graphics.getWidth());
		
		stage.addActor(o);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		super.render(delta);
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.draw();
		stage.act();
		salirMenu();
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		super.dispose();
	}
	
	private void salirMenu() {
		if(Gdx.input.isKeyPressed(Keys.ESCAPE) || Gdx.input.isKeyPressed(Keys.BACK)) // Si se pulsa el botón "escape" en PC o "Back" en android
			Screens.JUEGO.setScreen(Screens.GAME_SCREEN); // Volvemos al menú principal
	}

}
