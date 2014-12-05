package luis.carlos.mijuego;

import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Nube extends Actor {
	private int x=3;
	Random rnd = new Random();
	private Image nube; 
	
	Nube(){
		nube = new Image(new Texture("nubes.png"));
		nube.setHeight(160);
		nube.setWidth(300);
		int centroY = Gdx.graphics.getHeight() / 2 - (80 / 2); // Centro en el eje x de la pantalla centrando el botón
		int centroX = Gdx.graphics.getWidth() / 2 - (250 / 2);
		int x1 = rnd.nextInt(Gdx.graphics.getWidth())+1;
		if(x1<centroX){
			x = 1;
		}else
			x =-1;
		
		//this.setX(x);
		//this.setY(centroY+200);
		nube.setX(x);
		nube.setY(centroY+90);
	}
	
	@Override
	public void act(float delta) {
		// TODO Auto-generated method stub
		super.act(delta);
		if(nube.getX() <=0){
			x =1;
		}else if(nube.getX() >=(Gdx.graphics.getWidth()-nube.getWidth())){
			x =-1;
		}
		
		/*if(this.getY() <=0){
			y =3;
		}else if(this.getY() >=444){
			y =-3;
		}*/
		
		//this.moveBy(x, 0);
		nube.moveBy(x, 0);
		
	
	}
	
	@Override
	public void draw(Batch batch, float parentAlpha) {
		// TODO Auto-generated method stub
		super.draw(batch, parentAlpha);
		nube.draw(batch, parentAlpha);
	}
	

	

}
