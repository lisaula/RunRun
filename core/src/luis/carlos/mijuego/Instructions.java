package luis.carlos.mijuego;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Instructions extends PantallaBase {
	Image i;
	Stage stage;
	public Instructions(Main game) {
		super(game);
		stage = new Stage();
		i = new Image(new Texture("Inst.png"));
		
		i.setHeight(Gdx.graphics.getHeight());
		i.setWidth(Gdx.graphics.getWidth());
		
		stage.addActor(i);
	}
	@Override
	public void render(float delta) {
		
		super.render(delta);
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.draw();
		stage.act();
		salirMenu();
	}
	@Override
	public void dispose() {
		
		super.dispose();
	}
	
	private void salirMenu() {
		if(Gdx.input.isKeyPressed(Keys.ESCAPE) || Gdx.input.isKeyPressed(Keys.BACK)) // Si se pulsa el botón "escape" en PC o "Back" en android
			Screens.JUEGO.setScreen(Screens.MAIN_SCREEN); // Volvemos al menú principal
	}

}
