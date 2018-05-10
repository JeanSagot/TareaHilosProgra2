package Domain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.scene.image.Image;

public class RunningCharacter extends Character {

    public RunningCharacter(int x, int y, int imgNum) throws FileNotFoundException {
        super(x, y, imgNum);
        setSprite();
    }
    
    public void setSprite() throws FileNotFoundException{
        ArrayList<Image> sprite = super.getSprite();
        for(int i = 0; i < 8; i++){
            sprite.add(new Image(new FileInputStream("src/Assets/Running"+i+".png")));
        }
        super.setSprite(sprite);
    }

    @Override
    public void run() {
        ArrayList<Image> sprite = super.getSprite();
        int x=-80;
        while (true) {
            try {
                if(x==844)
                    x=-80;
                else{
                super.setImage(sprite.get(0));
                Thread.sleep(100);
                //x+=7;
                super.setX(x);
                Thread.sleep(100);
                super.setImage(sprite.get(1));
                Thread.sleep(100);
                x+=7;
                super.setX(x);
                Thread.sleep(100);
                super.setImage(sprite.get(2));
                Thread.sleep(100);
                x+=7;
                super.setX(x);
                Thread.sleep(100);
                super.setImage(sprite.get(3));
                Thread.sleep(100);
                x+=7;
                super.setX(x);
                Thread.sleep(100);
                super.setImage(sprite.get(4));
                Thread.sleep(100);
                x+=7;
                super.setX(x);
                Thread.sleep(100);
                super.setImage(sprite.get(5));
                Thread.sleep(100);
                x+=7;
                super.setX(x);
                Thread.sleep(100);
                super.setImage(sprite.get(6));
                Thread.sleep(100);
                x+=7;
                super.setX(x);
                Thread.sleep(100);  
                }
                System.out.println(x);
            } 
            catch (InterruptedException ex) {}
        }
    }
}
