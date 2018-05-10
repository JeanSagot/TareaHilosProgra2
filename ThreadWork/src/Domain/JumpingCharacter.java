package Domain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.scene.image.Image;

public class JumpingCharacter extends Character {
     
    public JumpingCharacter(int x, int y, int imgNum) throws FileNotFoundException {
        super(x, y, imgNum);
        setSprite();
    }
    
    public void setSprite() throws FileNotFoundException{
        ArrayList<Image> sprite = super.getSprite();
        for(int i = 0; i < 3; i++)
        sprite.add(new Image(new FileInputStream("src/Assets/Jumping"+i+".png")));
    }

    @Override
    public void run() {
        ArrayList<Image> sprite = super.getSprite();
        
        int y = 370;
        
        while (true) {
            try {
                
                //mantiene la posicion del suelo y reinicia lo posicion
                super.setImage(sprite.get(2));
                this.setY(y);
                Thread.sleep(300);

                //hace que el kirby suba en posicion
                super.setImage(sprite.get(0));
                y = y-30;
                this.setY(y);
                Thread.sleep(100);
                
                super.setImage(sprite.get(0));
                y = y-30;
                this.setY(y);
                Thread.sleep(100);
                
                super.setImage(sprite.get(0));
                y = y-30;
                this.setY(y);
                Thread.sleep(100);
                
                //hace que el kirby baje
                super.setImage(sprite.get(1));
                y = y+30;
                this.setY(y);
                Thread.sleep(100);
                
                super.setImage(sprite.get(1));
                y = y+30;
                this.setY(y);
                Thread.sleep(100);
                
                super.setImage(sprite.get(1));
                y = y+30;
                this.setY(y);
                Thread.sleep(100);
            } 
            catch (InterruptedException ex) {} 
        }
    }
}
