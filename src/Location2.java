import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Location2 {
    int x1;
    int y1;
    int x;
    int y;
    int w;
    int h;

    boolean what;
    boolean be;
    boolean tobe;
    boolean togo;
    boolean rr;
    boolean tobe1;

    Thing thing1;
    Thing thing2;
    boolean t2;

    Thing thing3;
    Thing thing4;
    Thing thing5;
    boolean t5;

    Thing thing6;
    Thing thing7;
    Thing thing8;
    Thing thing9;
    boolean t9;


    ArrayList<Thing> things = new ArrayList<Thing>();
    Thing thingS;

    ArrayList<Integer> code = new ArrayList<Integer>();
    int c;


    BufferedImage image;
    BufferedImage imagee;
    BufferedImage image00;
    int progress;
    int pr;
    MyFrame frame;
    boolean expl;
    int l;
    boolean togo1;
    boolean tr;
    int t1;
    int t4;
    int t3;

    public Location2(int x, int y, MyFrame frame) throws IOException {
        this.frame = frame;
        this.x = 440;
        this.y = 555;
        //        this.w = 1641;
//        this.h = 1050;
        this.w = 1641;
        this.h = 1050;
        expl = true;



        this.togo1 = false;

        this.what = false;
        this.tobe = true;
        this.tobe1 = true;
        this.togo = false;
        this.be = false;
        this.rr = false;
        pr = 5;
        l=9;
        progress = 0;
        t2 = false;
        t5 = false;
        t9 = false;
        this.tr = true;
        image = ImageIO.read(new File("data\\Location 2.png"));

        thing1 = new Thing(735, 525, 15, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing2 = new Thing(970, 710, 30, 20, new ThingAction() {
            @Override
            public void onClick() throws IOException {
//                    BufferedImage image01 = ImageIO.read(new File("data\\circle.png"));


            }
        });
        thing3 = new Thing(1470, 305, 40, 25, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing4 = new Thing(315, 300, 25, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing5 = new Thing(785, 670, 25, 15, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing6 = new Thing(1040, 470, 20, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing7 = new Thing(200, 455, 25, 25, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing8 = new Thing(1520, 460, 25, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing9 = new Thing(1055, 90, 25, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });

        thingS = new Thing(750, 650, 25, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        things.add(thing1);
        things.add(thing2);
        things.add(thing3);
        things.add(thing4);
        things.add(thing5);
        things.add(thing6);
        things.add(thing7);
        things.add(thing8);
        things.add(thing9);


    }
    public void atClick(int a, int b) {
        x1 = a;
        y1 = b;
        System.out.println(x1);
        System.out.println(y1);

        if(expl && a>0){
            what = true;
            expl = false;
        } else{
            if (x1 > 1135 && x1 < 1270 && y1 > 943 && y1 < 1045) {   //что ищем
                what = true;
            } else {
                what = false;
            }
        }
        for (int i = 0; i < things.size(); i = i + 1) {
            if (a > things.get(i).x - 1 && a < things.get(i).x + things.get(i).w + 1 && b > things.get(i).y - 1 && b < things.get(i).y + things.get(i).h + 1) {
                c=0;
                for(int j = 0; j < code.size(); j = j + 1){
                    if(things.get(i).x==code.get(j)){
                        c=c+1;

                    }
                }
                if(c==0){
                    code.add(things.get(i).x);
                }
                System.out.println(code.size());

                progress=code.size();

            }
        }
        if (be && x1 > 654 && x1 < 780 && y1 > 615 && y1 < 670) {
            tobe = false;
        }
        if (be && rr && x1 > 654 && x1 < 780 && y1 > 615 && y1 < 670) {
            tobe1 = false;

        }
        if (be && x1 > 925 && x1 < 1080 && y1 > 625 && y1 < 676) {
            tobe = true;
            be = false;
            togo = true;
        }
        if (be && !tobe && x1 > 1399 && x1 < 1601 && y1 > 949 && y1 < 1001) {
            togo = true;

        }
        if (x1 > thingS.x - 1 && x1 < thingS.x + thingS.w + 1 && y1 > thingS.y - 1 && y1 < thingS.y + thingS.h + 1) {

            rr = true;
        }
        if (t2 && x1<1641 && y1<1050) {
            t2=false;
        }
        if(thing2.x<x1 && thing2.y<y1 && thing2.x+thing2.w>x1 && thing2.y+thing2.h>y1){
            this.t2=true;
            for(int i = 0; i < frame.inventory.size(); i = i + 1){
                if(frame.inventory.get(i)==frame.answert31){
                    t1=t1+1;

                }
            }
            if(t1==0){
                frame.inventory.add(frame.answert31);
            }

        }
        if (t5 && x1<1641 && y1<1050) {
            t5=false;
        }
        if(thing5.x<x1 && thing5.y<y1 && thing5.x+thing5.w>x1 && thing5.y+thing5.h>y1){
            this.t5=true;
            for(int i = 0; i < frame.inventory.size(); i = i + 1){
                if(frame.inventory.get(i)==frame.answert32){
                    t4=t4+1;

                }
            }
            if(t4==0){
                frame.inventory.add(frame.answert32);
            }

        }
        if (t9 && x1<1641 && y1<1050) {
            t9=false;
        }
        if(thing9.x<x1 && thing9.y<y1 && thing9.x+thing9.w>x1 && thing9.y+thing9.h>y1){
            this.t9=true;
            for(int i = 0; i < frame.inventory.size(); i = i + 1){
                if(frame.inventory.get(i)==frame.answert33){
                    t3=t3+1;

                }
            }
            if(t3==0){
                frame.inventory.add(frame.answert33);
            }

        }
        if(l==code.size()){
            togo1=true;
        }
        if(togo1 && x1 > 925 && x1 < 1080 && y1 > 625 && y1 < 676){
            togo=true;
        }if(togo1 && x1 > 654 && x1 < 780 && y1 > 615 && y1 < 670){
            tr=false;
        }
        if(togo1 && rr){
            togo= true;
        }
        if ( a>25 && a<225 && b>950 && b<1040){

            frame.yes = false;
            frame.no = true;

        }


    }

    public void paint(Graphics g) throws IOException {
        if (togo) {
            image00 = ImageIO.read(new File("data\\Fon.jpg"));
            g.drawImage(image00, 0, 15, 1641, 1050, null);

            frame.day = frame.day + 1;
            frame.levelup = 0;
            frame.no=false;
            frame.talk=1;
            frame.dio = true;



//            g.drawString("Переход на следующий уровень", 500, 100);

        } else {

            g.drawImage(this.image, 0, 15, w, h, null);
            for (int i = 0; i < things.size(); i = i + 1) {
                things.get(i).itClick(x1, y1);
                things.get(i).paint(g);
            }
            BufferedImage exit = ImageIO.read(new File("data\\exitQuiz.png"));
            g.drawImage(exit, 25,950,200,90, null);
            if(expl){
                BufferedImage expl = ImageIO.read(new File("data\\explLocation.png"));
                g.drawImage(expl, 0, 15,1641, 1050, null);
            }



            if (this.what) {
//                System.out.println(what);
                BufferedImage imagee = ImageIO.read(new File("data\\Find 2.png"));
                g.drawImage(imagee, 270, 250, 1200, 600, null);
            }
            if (t2){
                Color color1 = new Color(253, 253, 253);
                g.setColor(color1);
                g.fillRect(410,262,821,526);
                g.drawImage(frame.answert31, 410, 262, 821, 526, null);
            }
            if (t5){
                Color color1 = new Color(253, 253, 253);
                g.setColor(color1);
                g.fillRect(410,262,821,526);
                g.drawImage(frame.answert32, 410, 262, 821, 526, null);
            }
            if (t9){
                Color color1 = new Color(253, 253, 253);
                g.setColor(color1);
                g.fillRect(410,262,821,526);
                g.drawImage(frame.answert33, 410, 262, 821, 526, null);
            }
            if (progress >= pr && tobe && !togo) {
                BufferedImage imagee = ImageIO.read(new File("data\\Continius 1.png"));
                g.drawImage(imagee, 270, 150, 1200, 800, null);
                be = true; //можно на следующий уровень
            }
            if (!tobe) {
                BufferedImage imagee = ImageIO.read(new File("data\\rect.png"));
                g.drawImage(imagee, 1400, 950, 220, 50, null);
                Color color2 = new Color(10, 10, 10);
                g.setColor(color2);
                g.drawString("Думаю, пора в следующий город", 1410, 970);
            }
            if (!togo & rr && tobe1 ) {
                BufferedImage imagee = ImageIO.read(new File("data\\findmap.png"));
                g.drawImage(imagee, 270, 150, 1200, 800, null);

                be = true; // нашли карту

            }

            if (togo1 && tr){
                BufferedImage imagee = ImageIO.read(new File("data\\findall.png"));
                g.drawImage(imagee, 270, 150, 1200, 800, null);
            }

        }
    }
}
