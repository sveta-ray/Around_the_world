import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Quiz3 {
    MyFrame frame;
    boolean expl ;
    BufferedImage image;
    ArrayList<Integer> code = new ArrayList<Integer>();
    ArrayList<Integer> codec = new ArrayList<Integer>();
    BufferedImage image00;
    int s;
    int c;
    int p;
    boolean togo;
    public Quiz3(MyFrame frame) throws IOException {
        this.frame = frame;
        image = ImageIO.read(new File("data\\Code3.png"));
        code.add(48);
        code.add(51);
        code.add(55);
        code.add(10);
        s=0;
        expl = true;
        togo =true;
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
    }
    public void touch(int a)  {
        if (p < 3) {
            c = a - 48;
            codec.add(a);
            if (a == 8) {
                codec.remove(codec.size() - 1);
//            codechar.remove(codechar.size()-1);
                codec.remove(codec.size() - 1);
//            codechar.remove(codechar.size()-1);
                System.out.println(codec.size());
            }
            if (codec.size() == 4) {
                for (int i = 0; i < codec.size(); i = i + 1) {

                    if (code.get(i) == codec.get(i)) {
                        s = s + 1;
                    }
                }
                if (s != 4) {
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
        if(expl){
            BufferedImage expl = ImageIO.read(new File("data\\explQuiz.png"));
            g.drawImage(expl, 0, 15,1641, 1050, null);
        }


        if(codec.size() == 1){
            g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
            g.drawString(Integer.toString (codec.get(0)-48), 160, 280);
        }
        if(codec.size() == 2){
            g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
            g.drawString(Integer.toString (codec.get(0)-48), 160, 280);
            g.drawString(Integer.toString (codec.get(1)-48), 180, 530);
        }
        if(codec.size() == 3){
            g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
            g.drawString(Integer.toString (codec.get(0)-48), 160, 280);
            g.drawString(Integer.toString (codec.get(1)-48), 180, 530);
            g.drawString(Integer.toString (codec.get(2)-48), 165, 760);
        }
        if(codec.size() == 4){
            g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
            g.drawString(Integer.toString (codec.get(0)-48), 160, 280);
            g.drawString(Integer.toString (codec.get(1)-48), 180, 530);
            g.drawString(Integer.toString (codec.get(2)-48), 165, 760);
        }
//        if (codec.size() == 3) {
//            for (int i = 0; i < codec.size(); i = i + 1) {
//
//                if (code.get(i) == codec.get(i)) {
//                    s = s + 1;
//                }
//            }
//        }
        if (s == 4) {
            image00 = ImageIO.read(new File("data\\Fon.jpg"));
//            g.drawImage(image00, 0, 15, frame.width, frame.height, null);
            g.drawImage(image00, 0, 15,1641, 1050, null);

            frame.day= frame.day + 1;
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
