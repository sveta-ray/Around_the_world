import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Quiz7 {
    MyFrame frame;
    BufferedImage image;
    ArrayList<Integer> code = new ArrayList<Integer>();
    ArrayList<Integer> codec = new ArrayList<Integer>();
    BufferedImage image00;
    int s;
    int f;
    int p;
    boolean togo;
    boolean expl ;

    ArrayList<Character> codechar = new ArrayList<Character>();
    ArrayList<Character> codchar = new ArrayList<Character>();
    public Quiz7(MyFrame frame) throws IOException {
        this.frame = frame;
        image = ImageIO.read(new File("data\\Quiz7\\Quiz7.png"));
        code.add(49);
        code.add(55);
        code.add(10);
        s=0;
        expl = true;
    }
    public void click(int a, int b)  {
        if(expl && a>0){

            expl = false;
        }
        if ( a>100 && a<300 && b>100 && b<200){
            codec = new ArrayList<Integer>();

            s=0;
            frame.yes = true;
            frame.no = true;

        }if(p>=3 && a>0){
            togo = false;
        }
        System.out.println(a);
        System.out.println(b);
    }
    public void touch(int a)  {
        if (p < 3) {
            codec.add(a);
            if (a == 8) {
                codec.remove(codec.size() - 1);
//            codechar.remove(codechar.size()-1);
                codec.remove(codec.size() - 1);
//            codechar.remove(codechar.size()-1);
                System.out.println(codec.size());
            }
            if (codec.size() == 3) {
                for (int i = 0; i < codec.size(); i = i + 1) {

                    if (code.get(i) == codec.get(i)) {
                        s = s + 1;
                    }
                }
                if (s != 3) {
                    codec = new ArrayList<Integer>();
                    s = 0;
                    p++;
                }
            }
            System.out.println(s);
        }
    }
    public void paint(Graphics g) throws IOException {
        g.drawImage(image, 0, 0, 1641, 1050, null);

        Color color3 = new Color(212, 143, 229);
        g.setColor(color3);
        if(expl){
            BufferedImage expl = ImageIO.read(new File("data\\explQuiz.png"));
            g.drawImage(expl, 0, 15,1641, 1050, null);
        }
        if(codec.size() == 1){
            g.setFont(new Font("TimesRoman", Font.PLAIN, 750));
            g.drawString(Integer.toString (codec.get(0)-48), 300, 750);
        }
        if(codec.size() == 2){
            g.setFont(new Font("TimesRoman", Font.PLAIN, 750));
            g.drawString(Integer.toString (codec.get(0)-48), 300, 750);
            g.drawString(Integer.toString (codec.get(1)-48), 850, 750);
        }

//        if (codec.size() == 3) {
//            for (int i = 0; i < codec.size(); i = i + 1) {
//
//                if (code.get(i) == codec.get(i)) {
//                    s = s + 1;
//                }
//            }
//        }
        if (s == 3) {
            image00 = ImageIO.read(new File("data\\Fon.jpg"));
//            g.drawImage(image00, 0, 15, frame.width, frame.height, null);
            g.drawImage(image00, 0, 15,1641, 1050, null);

            frame.day = frame.day + 1;
            frame.levelup = 0;
            frame.no=false;
            frame.talk=1;
            frame.dio = true;
        }

        g.fillRect(100,100,200,100);
        BufferedImage exit = ImageIO.read(new File("data\\exitLocation.png"));
        g.drawImage(exit, 100,100,200,100, null);
        if (p>=3){
            BufferedImage imagee = ImageIO.read(new File("data\\Quizend.png"));
            g.drawImage(imagee, 0, 15, 1641, 1050, null);

        }
        if(!togo && p>=3){

            codec = new ArrayList<Integer>();

            s=0;
            frame.yes = true;
            frame.no = true;
        }

    }
}

