package luis.carlos.mijuego;

import java.util.ArrayList;




import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Animacion extends Actor {
	ArrayList<Image>images;
	private int imagen_actual=0;
	private float frame=0;
	int centroY = Gdx.graphics.getHeight() / 2 - (80 / 2); // Centro en el eje x de la pantalla centrando el botón
	int centroX = Gdx.graphics.getWidth() / 2 - (250 / 2);
	static float posX, posY;
	Animacion(){
		images = new ArrayList<Image>();
		images.add(new Image(new Texture("bomba01.png")));
		images.add(new Image(new Texture("bomba02.png")));
		images.add(new Image(new Texture("bomba03.png")));
		
		
		this.setY(0);
		
	}
	
	@Override
	public void draw(Batch batch, float parentAlpha) {
		// TODO Auto-generated method stub
		super.draw(batch, parentAlpha);
		images.get(imagen_actual).setX(this.getX());
		images.get(imagen_actual).setY(this.getY());
		images.get(imagen_actual).setHeight(50);
		images.get(imagen_actual).setWidth(50);
		
		images.get(imagen_actual).draw(batch, parentAlpha);
		
		
	}
	
	@Override
	public void act(float delta) {
		// TODO Auto-generated method stub
		super.act(delta);
		frame += delta;
		if(frame>0.1f){
			imagen_actual++;
			frame =0;
			
		}
		if(imagen_actual >= images.size()){
				imagen_actual=0;
		}
		if(Gdx.input.isKeyPressed(Keys.UP)){
			this.moveBy(0, 3);
		}else if(Gdx.input.isKeyPressed(Keys.DOWN)){
			this.moveBy(0, -3);
		}else if(Gdx.input.isKeyPressed(Keys.LEFT)){
			this.moveBy(-3, 0);
		}else if(Gdx.input.isKeyPressed(Keys.RIGHT)){
			this.moveBy(3, 0);
		}
		
	}
}