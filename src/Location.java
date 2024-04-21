import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Location {
    int x1;
    int y1;
    int x;
    int y;
    int w;
    int h;


    BufferedImage image;

    public Location(int x, int y) throws IOException {
        this.x = 440;
        this.y = 555;
        this.w = 1641;
        this.h = 1050;
        this.x1 = 100;
        this.y1 = 100;

        image = ImageIO.read(new File("data\\Location01.png"));
    }
    public void paint(Graphics g) {
        g.drawRect(10, 101, 101, 10);
        g.drawImage(this.image, 0, 0, w, h,null);
    }
}
