import java.awt.*;
import java.io.IOException;

public class RectQuiz2 {
    int x;
    int y;
    int w;
    int h;

    public RectQuiz2(int x1, int y1, int w1, int h1) throws IOException {
        x = x1;
        y = y1;
        w = w1;
        h = h1;
    }
    public void paint(Graphics g) throws IOException {
//        Color color1 = new Color(140, 0, 180);
//        g.setColor(color1);
        g.fillRect(x, y, w, h);
    }
}
