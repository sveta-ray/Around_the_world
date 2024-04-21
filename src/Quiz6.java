import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Quiz6 {
    MyFrame frame;
    BufferedImage image;
    BufferedImage image00;
    int x;
    int y;
    int s;
    int c;
    int b;
    int p;
    boolean togo;
    boolean expl ;
    int w;
    int h;
    ArrayList<Integer> code = new ArrayList<Integer>();
    ArrayList<Integer> codec = new ArrayList<Integer>();
    ArrayList<RectQuiz2> line = new ArrayList<RectQuiz2>();
    boolean gooo;

    public Quiz6(MyFrame frame) throws IOException {
        this.frame = frame;
        image = ImageIO.read(new File("data\\Quiz6\\Quiz6.png"));
        x = 830;
        y = 120;
        code.add(4);
        code.add(3);
        code.add(4);
        code.add(4);
        code.add(1);
        code.add(4);
        code.add(4);
        code.add(4);
        code.add(3);
        code.add(4);
        gooo = true;
        expl = true;

    }
    public void click(int a,int b){
        if(expl && a>0){

            expl = false;
        }
        System.out.println(a);
        System.out.println(b);
        if ( a>100 && a<300 && b>100 && b<200){
            codec = new ArrayList<Integer>();
            x=830;
            y=120;
            s=0;
            frame.yes = true;
            frame.no = true;

        }if(p>=5 && a>0){
            togo = false;
        }
    } public void touch(int a) throws IOException {
        if (p < 5) {
            if (gooo) {
                if (a == 37) {
                    x = x - 160;
                    if (x < 370) {
                        x = 830;
                        y = 120;
                        s = 0;
                        codec = new ArrayList<Integer>();


                    }
//            RectQuiz2 l = new RectQuiz2(x , y -20, 155, 40);
//            line.add(l);

                    codec.add(1);
                } else if (a == 38) {
                    y = y - 120 - 10;
                    if (y < 0) {
                        x = 830;
                        y = 120;
                        s = 0;
                        codec = new ArrayList<Integer>();


                    }

//            RectQuiz2 l = new RectQuiz2(x -20, y , 40, 125);
//            line.add(l);
                    codec.add(2);
                } else if (a == 39) {
                    x = x + 160;
                    if (x > 1200) {
                        x = 830;
                        y = 120;
                        s = 0;
                        codec = new ArrayList<Integer>();


                    }
//            RectQuiz2 l = new RectQuiz2(x -155, y - 20, 155, 40);
//            line.add(l);
                    codec.add(3);
                } else if (a == 40) {
                    y = y + 125 + 10;
                    if (y > 1080) {
                        x = 830;
                        y = 120;
                        s = 0;
                        codec = new ArrayList<Integer>();
                        p++;


                    }

//            RectQuiz2 l = new RectQuiz2(x - 20, y - 97, 40, 100);
//            line.add(l);

                    codec.add(4);
                }
            }
            if (x == 830 && y == 255) {
                gooo = false;
            }
            if (x == 670 && y == 390) {
                gooo = false;
            }
            if (x == 510 && y == 930) {
                gooo = false;
            }
            if (x == 830 && y == 795) {
                gooo = false;
            }
            if (x == 1150 && y == 795) {
                gooo = false;
            }
            if (!gooo) {
                if (a == 54) {
                    gooo = true;
                } else {
                    gooo = false;
                }
            }
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

        if(!gooo){
            g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
            g.drawString("Введи цифру," , 100, 300);
            g.drawString("чтобы " , 100, 400);
            g.drawString("продолжить" , 100, 500);
            g.drawString("путь" , 100, 600);
        }
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
            x=830;
            y=120;
            s=0;
            codec = new ArrayList<Integer>();

            c=x;
            b=y;
        }
        if(x !=830 && y==120){
            x=830;
            y=120;
            s=0;
            codec = new ArrayList<Integer>();

            c=x;
            b=y;
        }

        Color color2 = new Color(158, 113, 178, 255);
        g.setColor(color2);
        g.fillRect(c,b,w,h);
        Color color3 = new Color(212, 143, 229);
        g.setColor(color3);

        g.fillRect(100,100,200,100);
        BufferedImage exit = ImageIO.read(new File("data\\exitLocation.png"));
        g.drawImage(exit, 100,100,200,100, null);

        g.setColor(color2);
//        for (int i = 0; i < codec.size()-1; i = i + 1) {
//
////            System.out.println( line.get(i).x);
//            line.get(i).paint(g);
//            g.drawRect(line.get(i).x, line.get(i).y, line.get(i).w, line.get(i).h );
//        }
        Color color1 = new Color(140, 0, 180, 153);
        g.setColor(color1);
        g.fillOval(x-40, y-40, 80, 80);
        Color color4 = new Color(212, 143, 229);
        g.setColor(color4);
        if (p>=5){
            BufferedImage imagee = ImageIO.read(new File("data\\Quizend.png"));
            g.drawImage(imagee, 0, 15, 1641, 1050, null);

        }
        if(!togo && p>=5){

            codec = new ArrayList<Integer>();
            x=830;
            y=120;
            s=0;
            frame.yes = true;
            frame.no = true;
        }


    }
}
