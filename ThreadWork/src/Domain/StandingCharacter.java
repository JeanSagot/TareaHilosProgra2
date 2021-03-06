package Domain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.scene.image.Image;

public class StandingCharacter extends Character {

    public StandingCharacter(int x, int y, int imgNum) throws FileNotFoundException {
        super(x, y, imgNum);
        setSprite();
    }
    
    public void setSprite() throws FileNotFoundException{
        ArrayList<Image> sprite = super.getSprite();
        for(int i = 0; i < 4; i++){
            sprite.add(new Image(new FileInputStream("src/Assets/Standing"+i+".png")));
        }
        super.setSprite(sprite);
    }

    @Override
    public void run() {
        ArrayList<Image> sprite = super.getSprite();
        
        
        while (true) {
            try {
                super.setImage(sprite.get(0));
                Thread.sleep(3000);
                super.setImage(sprite.get(1));
                Thread.sleep(100);
                super.setImage(sprite.get(2));
                Thread.sleep(100);
                super.setImage(sprite.get(3));
                Thread.sleep(100);
            } 
            catch (InterruptedException ex) { }
        }
    }
}
