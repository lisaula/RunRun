package luis.carlos.mijuego;



import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;


public class MenuScreen extends PantallaBase implements InputProcessor {
	Image fondo, tittle, exit, play, inst;
	Texture nube;
	static Stage stage;
	ExitButton b;
	PlayButton p;
	InstButton i;
	Nube n;
	Animacion a;
	
	
	public MenuScreen(Main game) {
		super(game);
		fondo= new Image(new Texture("Menu.png"));
		tittle = new Image(new Texture("Title.png"));
		stage = new Stage();
		a = new Animacion();
		n = new Nube();
		int centroY = Gdx.graphics.getHeight() / 2 - (80 / 2); // Centro en el eje x de la pantalla centrando el botón
		int centroX = Gdx.graphics.getWidth() / 2 - (250 / 2); // Centro en el eje y de la pantalla centrando el botón
		exit = new Image(new Texture("Exit_botton01.png"));
		play = new Image(new Texture("Playbotton01.png"));
		inst = new Image(new Texture("Ins_botton01.png"));
		
		b = new ExitButton(centroX,centroY-80, exit);
		p =new PlayButton(centroX,centroY +10, play);
		i =new InstButton(centroX,centroY -170, inst);
		
		
		
		tittle.setWidth(380);
		tittle.setHeight(50);
		
		int x = Gdx.graphics.getWidth() /2;
		int fondox = (int)tittle.getWidth() / 2;
		
		tittle.setX(x - fondox);
		tittle.setY(Gdx.graphics.getHeight() - (int)tittle.getHeight());
		
		fondo.setWidth(Gdx.graphics.getWidth());
		fondo.setHeight(Gdx.graphics.getHeight());
		
		stage.addActor(fondo);
		stage.addActor(tittle);
		stage.addActor(b);
		stage.addActor(p);
		stage.addActor(i);
		stage.addActor(n);
		stage.addActor(a);
		
		//Gdx.input.setInputProcessor(GameScreen.stage);
	}
	
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		super.render(delta);
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		b.update();
		p.update();
		i.update();
		
		stage.draw();
		stage.act();
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		super.dispose();
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
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
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
