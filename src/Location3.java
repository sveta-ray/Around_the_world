import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Location3 {
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
    boolean t11;
    Thing thing3;
    boolean t4;
    Thing thing4;
    Thing thing5;
    Thing thing6;
    Thing thing7;
    boolean t8;
    Thing thing8;
    Thing thing9;
    Thing thing10;
    Thing thing11;
    Thing thing12;
    ArrayList<Thing> things = new ArrayList<Thing>();
    Thing thingS;
    boolean togo1;

    ArrayList<Integer> code = new ArrayList<Integer>();
   int c;


    BufferedImage image;
    BufferedImage imagee;
    BufferedImage image00;
    int progress;
    int pr;
    int l;
    boolean tr;
    int t1;
    boolean expl;
    int t2;
    int t3;
    MyFrame frame;

    public Location3(int x, int y, MyFrame frame) throws IOException {
        this.frame = frame;
        this.x = 440;
        this.y = 555;
        //        this.w = 1641;
//        this.h = 1050;
        this.w = frame.width;
        this.h =  frame.height;



        this.what = false;
        this.tobe = true;
        this.tr = true;
        this.tobe1 = true;
        this.togo = false;
        this.be = true;
        this.rr = false;
        this.togo1 = false;
        this.t4 = false;
        this.t8 = false;
        this.t11 = false;
        expl = true;
        pr = 8;
        l = 11;
        image = ImageIO.read(new File("data\\Location 3.png"));
        thing1 = new Thing(595, 645, 20, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing2 = new Thing(490, 590, 20, 15, new ThingAction() {
            @Override
            public void onClick() throws IOException {
//                         BufferedImage image01 = ImageIO.read(new File("data\\circle.png"));


            }
        });
        thing3 = new Thing(195, 585, 20, 15, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing4 = new Thing(1355, 655, 20, 15, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing5 = new Thing(1370, 450, 20, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing6 = new Thing(870, 110, 30, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing7 = new Thing(730, 30, 30, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing8 = new Thing(1470, 450, 20, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing9 = new Thing(580, 440, 20, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing10 = new Thing(1030, 85, 25, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing11 = new Thing(1415, 280, 25, 15, new ThingAction() {
            @Override
            public void onClick() {


            }
        });

        thingS = new Thing(595, 600, 40, 25, new ThingAction() {
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
        things.add(thing10);
        things.add(thing11);




    }
    public void atClick(int a, int b){
        x1= a;
        y1= b;
        if(expl && a>0){
            what = true;
            expl = false;
        }else{
            if (x1 > 1040 && x1 < 1195 && y1 > 934 && y1 < 1045) {   //что ищем
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
        if (be && x1>654 && x1<780 && y1>615 && y1<670){
            tobe = false;
        }
        if (be && rr && x1 > 654 && x1 < 780 && y1 > 615 && y1 < 670) {
            tobe1 = false;

        }
        if (be && x1>925 && x1<1080 && y1>625 && y1<676){
            tobe = true;
            be = false;
            togo=true;
        }
        if(be && !tobe && x1>1399 && x1<1601 && y1>949 && y1<1001){
            togo = true;

        }
        if(x1>thingS.x-1  && x1<thingS.x+thingS.w+1 && y1>thingS.y-1  && y1<thingS.y+thingS.h +1 ){

            rr = true;
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
        if (t4 && x1<1641 && y1<1050) {
            t4=false;
        }
        if (t8 && x1<1641 && y1<1050) {
            t8=false;
        }
        if (t11 && x1<1641 && y1<1050) {
            t11=false;
        }
        if(195<x1 && 585<y1 && 195+ 20>x1 && 585+ 15>y1){
            this.t4=true;
            for(int i = 0; i < frame.inventory.size(); i = i + 1){
                if(frame.inventory.get(i)==frame.answert6){
                    t1=t1+1;

                }
            }
            if(t1==0){
                frame.inventory.add(frame.answert6);
            }

        }if(730<x1 && 30<y1 && 730+ 15*2>x1 && 30+ 20>y1){
            this.t8=true;
            for(int i = 0; i < frame.inventory.size(); i = i + 1){
                if(frame.inventory.get(i)==frame.answert4){
                    t2=t2+1;

                }
            }
            if(t2==0){
                frame.inventory.add(frame.answert4);
            }

        }if(490<x1 && 590<y1 && 490+ 20>x1 && 590+ 15>y1){
            this.t11=true;
            for(int i = 0; i < frame.inventory.size(); i = i + 1){
                if(frame.inventory.get(i)==frame.answert31){
                    t3=t3+1;

                }
            }
            if(t3==0){
                frame.inventory.add(frame.answert31);
            }

        }
        if ( a>25 && a<225 && b>950 && b<1040){

            frame.yes = false;
            frame.no = true;

        }


    }

    public void paint(Graphics g) throws IOException {
        if (togo) {
            image00 = ImageIO.read(new File("data\\Fon.jpg"));
            g.drawImage(image00, 0, 15, frame.width, frame.height, null);
//            g.drawImage(image00, 0, 15,1641, 1050, null);

            frame.day = frame.day+1;
            frame.levelup = 0;
            frame.no=false;
            frame.talk=1;
            frame.dio = true;




//            g.drawString("Переход на следующий уровень", 500, 100);

        }else {

            g.drawImage(this.image, 0, 15, w, h, null);
            for (int i = 0; i < things.size(); i = i + 1) {
                things.get(i).itClick(x1, y1);
                things.get(i).paint(g);
            }
            BufferedImage exit = ImageIO.read(new File("data\\exitQuiz.png"));
            g.drawImage(exit, 25,950,200,90,null);
            if(expl){
                BufferedImage expl = ImageIO.read(new File("data\\explLocation.png"));
                g.drawImage(expl, 0, 15,1641, 1050, null);
            }



            if (what) {

                BufferedImage imagee = ImageIO.read(new File("data\\Find 3.png"));
                g.drawImage(imagee, 270, 250, 1200, 600, null);
            }
            if (t4){
                Color color1 = new Color(253, 253, 253);
                g.setColor(color1);
                g.fillRect(410,262,821,526);
                g.drawImage(frame.answert6, 410, 262, 821, 526, null);
            }
            if (t8){
                Color color1 = new Color(253, 253, 253);
                g.setColor(color1);
                g.fillRect(410,262,821,526);
                g.drawImage(frame.answert4, 410, 262, 821, 526, null);
            }
            if (t11){
                Color color1 = new Color(253, 253, 253);
                g.setColor(color1);
                g.fillRect(410,262,821,526);
                g.drawImage(frame.answert31, 410, 262, 821, 526, null);
            }
            if (progress >= pr && tobe && !togo) {
                BufferedImage imagee = ImageIO.read(new File("data\\Continius 1.png"));
                g.drawImage(imagee, 270, 150, 1200, 800, null);
                be = true;
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