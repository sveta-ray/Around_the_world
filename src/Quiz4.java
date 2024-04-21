import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Quiz4 {
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
    public Quiz4(MyFrame frame) throws IOException {
        this.frame = frame;
        image = ImageIO.read(new File("data\\Letter.png"));
        code.add(75);
        code.add(70);
        code.add(0);
        code.add(66);
        code.add(72);
        code.add(66);
        code.add(89);
        code.add(78);
        code.add(32);
        code.add(0);
        code.add(0);
        code.add(74);
        code.add(10);
        s=0;
        codchar.add('л');
        codchar.add('а');
        codchar.add('б');
        codchar.add('и');
        codchar.add('р');
        codchar.add('и');
        codchar.add('н');
        codchar.add('т');
        codchar.add(' ');
        codchar.add('э');
        codchar.add('х');
        codchar.add('о');
        togo = true;
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

        }if(p>=5 && a>0){
            togo = false;
        }
    }
    public void touch(int a, char b) {
        if (p < 5) {
            codechar.add(b);
            codec.add(a);

            if (a == 8) {
                codec.remove(codec.size() - 1);
                codechar.remove(codechar.size() - 1);
                codec.remove(codec.size() - 1);
                codechar.remove(codechar.size() - 1);
                System.out.println(codec.size());
            }
            if (codec.size() == code.size()) {
                for (int i = 0; i < codec.size(); i = i + 1) {

                    if (code.get(i) == codec.get(i)) {
                        s = s + 1;
                    }

                }

                if (s != code.size()) {
                    codec = new ArrayList<Integer>();
                    codechar = new ArrayList<Character>();
                    s = 0;
                    p++;
                    f = 0;
                }
            }
//        }if(codechar.size()==12) {
//            for (int i = 0; i < 12; i = i + 1) {
//                if ((codechar.get(i)) == (codchar.get(i))) {
//                    f = f + 1;
//                }
//            }
//        }
        }
    }

    public void paint(Graphics g) throws IOException {
        g.drawImage(image, 0, 0, 1641, 1050, null);
        if(expl){
            BufferedImage expl = ImageIO.read(new File("data\\explQuiz.png"));
            g.drawImage(expl, 0, 15,1641, 1050, null);
        }
        for (int i = 0; i < codec.size(); i = i + 1) {
            g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
            g.drawString(Character.toString(codechar.get(i)), 25+i*30, 400);

        }
        if( s==code.size() ){
            image00 = ImageIO.read(new File("data\\Fon.jpg"));

            g.drawImage(image00, 0, 15,1641, 1050, null);

            frame.day = frame.day + 1;
            frame.levelup = 0;
            frame.no=false;
            frame.talk=1;
            frame.dio = true;
        }


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

            s=0;
            frame.yes = true;
            frame.no = true;
        }

    }
}
