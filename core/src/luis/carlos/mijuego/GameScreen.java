package luis.carlos.mijuego;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;

import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class GameScreen extends PantallaBase implements InputProcessor{
	Rectangle recP;
	Rectangle enemy, enemy2, enemy3;
	static Stage stage;
	Image fondo;
	Personaje personaje;
	int pos;
	
	
	public GameScreen(Main game) {
		super(game);
		//instancias
		pos=0;
			//fondo 
			fondo = new Image(new Texture("Juego.png"));
			
			//personajes
			personaje = new Personaje();
			
			//Rectangles
			recP = new Rectangle(500, 65, 230, 230);
			enemy = new Rectangle(0, 450, 60, 60);
			enemy2 = new Rectangle(0, 450, 30, 40);
			enemy3 = new Rectangle(0, 450, 40, 50);
			
			//Stages
			stage = new Stage();
		
		//Custumizes
		fondo.setWidth(Gdx.graphics.getWidth());
		fondo.setHeight(Gdx.graphics.getHeight());
		
		//Aditions
		stage.addActor(fondo);
		stage.addActor(personaje);
		Gdx.input.setInputProcessor(this);
	}
	@Override
	public void render(float delta) {
		super.render(delta);
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		stage.draw();
		stage.act();
		refreshPositions();
		
		if(validarPerder()){
			System.out.println("perdiste");
			Screens.JUEGO.setScreen(Screens.GAME_OVER);
		}
		
		if (pos % 200 == 0) {
			addEnemy();
		}

		if (pos % 110 == 0) {

			addPlataforma();
		}
		if (pos % 150 == 0)
			stage.addActor(personaje);
		pos++;
		salirMenu();
	}
	
	private void salirMenu() {
		if(Gdx.input.isKeyPressed(Keys.ESCAPE) || Gdx.input.isKeyPressed(Keys.BACK)) // Si se pulsa el botón "escape" en PC o "Back" en android
			Screens.JUEGO.setScreen(Screens.MAIN_SCREEN); // Volvemos al menú principal
	}

	private void refreshPositions() {
		enemy.setX(Enemy1.e_posX);
		enemy.setY(Enemy1.e_posY);

		enemy2.setX(Enemy2.e_posX);
		enemy2.setY(Enemy2.e_posY);

		enemy3.setX(Enemy3.e_posX);
		enemy3.setY(Enemy3.e_posY);

		recP.setX(Personaje.posX);
		recP.setY(Personaje.posY);
	}
	
	private boolean validarPerder(){
		if (recP.overlaps(enemy)) {
			return true;
		} else if (recP.overlaps(enemy2)) {
			return true;
		} else if (recP.overlaps(enemy3)) {
			return true;
		}
		
		return false;
	}
	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		super.resize(width, height);
	}
	
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		super.pause();
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
		personaje.saltar();
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
	
	void addEnemy() {
		Actor enemigos[] = new Actor[3];
		Enemy1 e = new Enemy1();
		Enemy2 e2 = new Enemy2();
		Enemy3 e3 = new Enemy3();
		enemigos[0] = e;
		enemigos[1] = e2; 
		enemigos[2] = e3;

		int a = (int) (Math.random() * 3);

		// e.setHeight(50);
		stage.addActor(enemigos[a]);
	}
	
	void addPlataforma() {
		Plataforma p = new Plataforma();
		stage.addActor(p);
	}
	
	


}
