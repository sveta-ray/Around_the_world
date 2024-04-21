import org.w3c.dom.css.Rect;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Quiz2 {
    MyFrame frame;
    BufferedImage image;
    BufferedImage image00;
    int x;
    int y;
    int s;
    int c;
    int b;
    int w;
    int h;
    boolean expl ;
    ArrayList<Integer> code = new ArrayList<Integer>();
    ArrayList<Integer> codec = new ArrayList<Integer>();
    ArrayList<Integer> codecx = new ArrayList<Integer>();
    ArrayList<Integer> codecy = new ArrayList<Integer>();
    ArrayList<RectQuiz2> line = new ArrayList<RectQuiz2>();
    boolean togo;
    int p;

    public Quiz2(MyFrame frame) throws IOException {
        this.frame = frame;
        image = ImageIO.read(new File("data\\Goal.png"));
        x=1528;
        y=90;
        togo =true;
        code.add(4);
        code.add(4);
        code.add(1);
        code.add(1);
        code.add(4);
        code.add(3);
        code.add(4);
        code.add(4);
        code.add(1);
        code.add(1);
        code.add(2);
        code.add(1);
        code.add(2);
        code.add(2);
        code.add(1);
        code.add(1);
        code.add(2);
        code.add(1);
        code.add(1);
        code.add(4);

        code.add(4);
        code.add(3);
        code.add(4);
        code.add(1);
        code.add(4);
        code.add(1);
        code.add(4);
        code.add(4);
        code.add(3);
        code.add(3);
        code.add(3);
        code.add(2);
        code.add(2);
        code.add(3);
        code.add(4);
        code.add(3);
        code.add(4);
        code.add(3);
        code.add(3);
        code.add(4);
        code.add(3);
        code.add(3);
        code.add(4);
        code.add(4);

        expl = true;

    }
    public void click(int a,int b){
        if(expl && a>0){

            expl = false;
        }
        if ( a>100 && a<300 && b>100 && b<200){
            codec = new ArrayList<Integer>();
            x=1528;
            y=90;
            s=0;
            frame.yes = true;
            frame.no = true;

        } if(p>=5 && a>0){
            togo = false;
        }
    }
    public void touch(int a) throws IOException {
        if (p < 5) {


            if (a == 37) {
                x = x - 155;
//            if ( x<0){
//                x=1528;
//            }
                codecx.add(x);
                codecy.add(y);
                RectQuiz2 l = new RectQuiz2(x, y - 20, 155, 40);
                line.add(l);
                c = x;
                b = y - 20;
                w = 155;
                h = 40;
                codec.add(1);
                codecx.add(x);
                codecy.add(y);
            } else if (a == 38) {
                y = y - 97;
//            if (y<0){
//                y=990;
//            }
                c = x - 20;
                b = y;
                w = 40;
                h = 100;
                RectQuiz2 l = new RectQuiz2(x - 20, y, 40, 100);
                line.add(l);
                codec.add(2);
                codecx.add(x);
                codecy.add(y);
            } else if (a == 39) {
                x = x + 155;
//            if(x>1528){
//                x=133;
//            }
                c = x - 155;
                b = y - 20;
                w = 155;
                h = 40;
                RectQuiz2 l = new RectQuiz2(x - 155, y - 20, 155, 40);
                line.add(l);
                codec.add(3);
                codecx.add(x);
                codecy.add(y);
            } else if (a == 40) {
                y = y + 97;
//            if (y>995){
//                y=90;
//            }
                c = x - 20;
                b = y - 100;
                w = 40;
                h = 100;
                RectQuiz2 l = new RectQuiz2(x - 20, y - 97, 40, 100);
                line.add(l);

                codec.add(4);
                codecx.add(x);
                codecy.add(y);
            }
//        if(a==8){
//            codec.remove(codec.size()-1);
//            codec.remove(codec.size()-1);

//            codecx.remove(codec.size()-1);
//            codecx.remove(codec.size()-1);
//
//            codecy.remove(codec.size()-1);
//            codecy.remove(codec.size()-1);
//
//            line.remove(codec.size()-1);
//
//            line.remove(codec.size()-1);


            if (codec.size() == code.size()) {
                System.out.println(111);
                for (int i = 0; i < codec.size(); i = i + 1) {

                    if (code.get(i) == codec.get(i)) {
                        s = s + 1;
                    }
                }
            }
        }
    }

    public void paint(Graphics g) throws IOException {
        g.drawImage(image, 0, 0, 1641, 1050, null);
//        if(codec.size()==code.size()) {
//            for (int i = 0; i < codec.size(); i = i + 1) {
//
//                if (code.get(i) == codec.get(i)) {
//                    s = s + 1;
//                }
//            }
//        }
        if(expl){
            BufferedImage expl = ImageIO.read(new File("data\\explQuiz.png"));
            g.drawImage(expl, 0, 15,1641, 1050, null);
        }
        if (s == code.size()) {
            image00 = ImageIO.read(new File("data\\Fon.jpg"));
//            g.drawImage(image00, 0, 15, frame.width, frame.height, null);
            g.drawImage(image00, 0, 15,1641, 1050, null);

            frame.day = frame.day + 1;
            frame.levelup = 0;
            frame.no=false;
            frame.talk=1;
            frame.dio = true;

        }
        if(codec.size()==code.size() && s<code.size()){
            x=1528;
            y=90;
            s=0;
            codec = new ArrayList<Integer>();
            line = new ArrayList<>();
            c=444444;
            b=4444444;
            p=p+1;

        }
        if(x<0 || x>1528 || y<0 || y>995){
            x=1528;
            y=90;
            s=0;
            codec = new ArrayList<Integer>();
            line = new ArrayList<>();
            c=4444444;
            b=4444444;
            p = p+1;
        }

        Color color2 = new Color(158, 113, 178, 255);
        g.setColor(color2);
        g.fillRect(c,b,w,h);


        g.setColor(color2);
        for (int i = 0; i < codec.size()-1; i = i + 1) {

//            System.out.println( line.get(i).x);
            line.get(i).paint(g);
            g.drawRect(line.get(i).x, line.get(i).y, line.get(i).w, line.get(i).h );
        }
        Color color1 = new Color(140, 0, 180);
        g.setColor(color1);
        g.fillOval(x-40, y-40, 80, 80);
        Color color3 = new Color(212, 143, 229);
        g.setColor(color3);
        g.fillRect(100,100,200,100);
        BufferedImage exit = ImageIO.read(new File("data\\exitLocation.png"));
        g.drawImage(exit, 100,100,200,100, null);


         if (p>=5){
        BufferedImage imagee = ImageIO.read(new File("data\\Quizend.png"));
        g.drawImage(imagee, 0, 15, 1641, 1050, null);

    }
        if(!togo && p>=5){
            codec = new ArrayList<Integer>();
            x=1528;
            y=90;
            s=0;
            frame.yes = true;
            frame.no = true;
    }
    }
}
