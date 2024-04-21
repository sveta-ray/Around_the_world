import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Quiz12 {
    MyFrame frame;
    BufferedImage image;
    ArrayList<Integer> code = new ArrayList<Integer>();
    ArrayList<Integer> codec = new ArrayList<Integer>();
    BufferedImage image00;
    int s;
    boolean expl ;
    int f;
    int p;
    boolean togo;

    ArrayList<Character> codechar = new ArrayList<Character>();
    ArrayList<Character> codchar = new ArrayList<Character>();
    public Quiz12(MyFrame frame) throws IOException {
        this.frame = frame;
        image = ImageIO.read(new File("data\\Quiz 12.png"));
        code.add(68);
        code.add(74);
        code.add(80);
        code.add(76);
        code.add(69);
        code.add(0);
        code.add(10);



        s=0;
        togo = true;
        codchar.add('в');
        codchar.add('о');
        codchar.add('з');
        codchar.add('д');
        codchar.add('у');
        codchar.add('х');
        expl = true;
//

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

        }if(p>=4 && a>0){
            togo = false;
        }
        System.out.println(a);
        System.out.println(b);
    }
    public void touch(int a, char b) {
        if (p < 4) {
            codechar.add(b);
            codec.add(a);
            System.out.println(a);
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
                    p++;
                    s = 0;
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
            g.setFont(new Font("TimesRoman", Font.PLAIN, 100));
            g.drawString(Character.toString(codechar.get(i)), 1540, 100 + i*100);

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
        if (p>=4){
            BufferedImage imagee = ImageIO.read(new File("data\\Quizend.png"));
            g.drawImage(imagee, 0, 15, 1641, 1050, null);

        }
        if(!togo && p>=4){

            codec = new ArrayList<Integer>();

            s=0;
            frame.yes = true;
            frame.no = true;
        }

    }
}




