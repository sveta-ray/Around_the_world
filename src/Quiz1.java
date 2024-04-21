import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Quiz1 {
    int x;
    int y;
    MyFrame frame;
    int round;
    ArrayList<Integer> code = new ArrayList<Integer>();
    ArrayList<Integer> codec = new ArrayList<Integer>();
    int s;
    int d;
//    int d1;
    boolean togo;
    BufferedImage image00;
    BufferedImage image1;
    BufferedImage image2;
    BufferedImage image3;
    BufferedImage image4;
    BufferedImage image5;
    BufferedImage image6;
    BufferedImage image7;
    BufferedImage image8;
    int p;
    boolean expl ;

    public Quiz1(MyFrame frame) throws IOException {
        this.frame = frame;
        round = 0;
        code.add(5);
        code.add(3);
        code.add(7);
        code.add(2);


        s = 0;
        expl = true;
        d=0;
        togo = true;
        image1 = ImageIO.read(new File("data\\Seif 0.png"));
        image2 = ImageIO.read(new File("data\\Seif 1.png"));
        image3 = ImageIO.read(new File("data\\Seif 2.png"));
        image4= ImageIO.read(new File("data\\Seif 3.png"));
        image5 = ImageIO.read(new File("data\\Seif 4.png"));
        image6 = ImageIO.read(new File("data\\Seif 5.png"));
        image7 = ImageIO.read(new File("data\\Seif 6.png"));
        image8 = ImageIO.read(new File("data\\Seif 7.png"));


    }

    public void touch(int a) {
        if (p < 3) {
            if (a == 8) {
                codec.remove(codec.size() - 1);
//            codechar.remove(codechar.size()-1);
                codec.remove(codec.size() - 1);
//            codechar.remove(codechar.size()-1);
                System.out.println(codec.size());
            }
            if (a == 37) {
                round = round - 1;
                if (round < 0) {
                    round = 8 + round;

                }
                round = round % 8;
            } else if (a == 39) {
                round = round + 1;
                round = round % 8;

            } else if (a == 10) {
                codec.add(round);


                for (int i = 0; i < codec.size(); i = i + 1) {
                    System.out.println(codec.get(i));
                }

                if (codec.size() == 4) {

                    for (int i = 0; i < codec.size(); i = i + 1) {
                        System.out.println(codec.get(i));
                        if (code.get(i) == codec.get(i)) {
                            s = s + 1;
                        }

                    }
                    if (s != 4) {
                        p = p + 1;
                        codec = new ArrayList<Integer>();
                        d = 0;
                        s = 0;

                    }
                }

            }
        }
    }

    public void click(int a,int b) {
        System.out.println(a);
        System.out.println(b);
        if(expl && a>0){

            expl = false;
        }
//        if (d==1 && a>570 && a<1070 && b>275 && b<775){
//            codec = new ArrayList<Integer>();
//             d=0;
//            s=0;
//        }
        if ( a>100 && a<300 && b>100 && b<200){
            codec = new ArrayList<Integer>();
            d=0;
            s=0;
            frame.yes = true;
            frame.no = true;

        }
        if(p>=3 && a>0){
            togo =false;
        }

    }

    public void paint(Graphics g) throws IOException {

//        g.fillRect(100,100,200,100);
//        g.fillOval(520, 225, 600, 600);
//        Color color = new Color(97, 95, 217);
//        g.setColor(color);
//        g.fillOval(570, 275, 500, 500);
        if (s!=4 & d==0) {
            if (round == 0) {
                g.drawImage(image1, 0, 15, 1641, 1050, null);
            } else if (round == 1) {
                g.drawImage(image2, 0, 15, 1641, 1050, null);
            } else if (round == 2) {
                g.drawImage(image3, 0, 15, 1641, 1050, null);
            } else if (round == 3) {
                g.drawImage(image4, 0, 15, 1641, 1050, null);
            } else if (round == 4) {
                g.drawImage(image5, 0, 15, 1641, 1050, null);
            } else if (round == 5) {
                g.drawImage(image6, 0, 15, 1641, 1050, null);
            } else if (round == 6) {
                g.drawImage(image7, 0, 15, 1641, 1050, null);
            } else if (round == 7) {
                g.drawImage(image8, 0, 15, 1641, 1050, null);
            }
            Color color1 = new Color(183, 35, 206);
            g.setColor(color1);

            g.fillRect(100,100,200,100);
            BufferedImage exit = ImageIO.read(new File("data\\exitLocation.png"));
            g.drawImage(exit, 100,100,200,100, null);
        }
        if(s<4) {


            for (int i = 0; i < codec.size(); i = i + 1) {
                g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
                g.drawString(Integer.toString(codec.get(i)), 740 + i * 70, 115);

            }
        }
        if(expl){
            BufferedImage expl = ImageIO.read(new File("data\\explQuiz.png"));
            g.drawImage(expl, 0, 15,1641, 1050, null);
        }
        if(s == 4) {
//            Color color = new Color(27, 255, 233);
//            g.setColor(color);
//            g.fillRect(570, 275, 500,500);
            image00 = ImageIO.read(new File("data\\Fon.jpg"));
//            g.drawImage(image00, 0, 15, frame.width, frame.height, null);
            g.drawImage(image00, 0, 15, 1641, 1050, null);

            frame.day = frame.day + 1;
            frame.levelup = 0;
            frame.no = false;
            frame.talk=1;
            frame.dio = true;
        }
//        } else if (d==1 && d1<3){
//            Color color = new Color(35, 92, 206);
//            g.setColor(color);
//            g.fillRect(570, 275, 500,500);
//
//        }
        if (p>=3){
            BufferedImage imagee = ImageIO.read(new File("data\\Quizend.png"));
            g.drawImage(imagee, 0, 15, 1641, 1050, null);

        }
        if(!togo && p>=3){
            frame.yes = true;
            frame.no = true;
            codec = new ArrayList<Integer>();

            s=0;
        }

    }
}

