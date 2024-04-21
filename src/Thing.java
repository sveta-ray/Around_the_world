import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Thing {
    //Array List, непонятно как туда добавлять все это с картинками в онклике наверное стоит задавать картинкку...

    int x;
    int y;
    int w;
    int h;
    ThingAction action;
    BufferedImage image1;
    BufferedImage image2;
    boolean it;

    public Thing(int x, int y, int w, int h, ThingAction action) throws IOException {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.action = action;
        image1 = ImageIO.read(new File("data\\Circlered.png"));
        image2 = ImageIO.read(new File("data\\Circlered.png"));


    }
    public void itClick(int a, int b) throws IOException {
        if(it){
            it = true;
        }else if (a>x-1 && a<x+w+1 && b>y-1 && b<y+h+1){
            it = true;

        }
        else{
            it =false;
        }
        action.onClick();
    }


    public void paint(Graphics g) throws IOException {
        if (it) {
            int r = Math.max(h, w);
            g.drawImage(image1, x-5, y-5, r+10, r+10, null);

//            action.onClick();

        }
    }

}
