import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Location7 {
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
    boolean togo1;
    boolean tobe1;

    Thing thing1;
    Thing thing2;
    Thing thing3;
    boolean t4;
    Thing thing4;
    Thing thing5;
    Thing thing6;
    Thing thing7;
    Thing thing8;
    Thing thing9;
    Thing thing10;
    Thing thing11;
    boolean t8;
    Thing thing12;
        Thing thing13;
    Thing thing14;
    Thing thing15;
    boolean t11;
    Thing thing16;
    Thing thing17;
    ArrayList<Thing> things = new ArrayList<Thing>();
    Thing thingS;
    int l;
    int t1;
    int t2;
    int t3;

    ArrayList<Integer> code = new ArrayList<Integer>();

    int c;


    BufferedImage image;
    boolean expl;
    BufferedImage imagee;
    BufferedImage image00;
    int progress;
    int pr;
    boolean tr;
    MyFrame frame;

    public Location7(int x, int y, MyFrame frame) throws IOException {
        this.frame = frame;
        this.x = 440;
        this.y = 555;
        //        this.w = 1641;
//        this.h = 1050;
        this.w = frame.width;
        this.h =  frame.height;
        expl = true;



        this.what = false;
        this.tobe = true;
        this.tobe1 = true;
        this.togo = false;
        this.togo1 = false;
        this.tr = true;
        this.be = true;
        this.rr = false;
        this.t4 = false;
        this.t8 = false;
        this.t11 = false;
        pr = 6;
        l=12;
        image = ImageIO.read(new File("data\\Location 7.png"));
        thing1 = new Thing(1150, 175, 20, 25, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing2 = new Thing(1205, 860, 30, 20, new ThingAction() {
            @Override
            public void onClick() throws IOException {
//                         BufferedImage image01 = ImageIO.read(new File("data\\circle.png"));


            }
        });
        thing3 = new Thing(1310, 890, 20, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing4 = new Thing(1100, 810, 25, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing5 = new Thing(1175, 100, 20, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing6 = new Thing(1580, 650, 30, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing7 = new Thing(1617, 175, 25, 15, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing8 = new Thing(1020, 400, 20, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing9 = new Thing(785, 420, 15, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing10 = new Thing(665, 175, 25, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing11 = new Thing(460, 75, 20, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing12 = new Thing(455, 310, 30, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing13 = new Thing(100, 115, 25, 15, new ThingAction() {
            @Override
            public void onClick() {


            }
        });

        thing14 = new Thing(40, 410, 20, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing15 = new Thing(260, 585, 25, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing16 = new Thing(510, 525, 20, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
        thing17 = new Thing(1160, 785, 20, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });

        thingS = new Thing(905, 535, 30, 20, new ThingAction() {
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
        things.add(thing12);
        things.add(thing13);
        things.add(thing14);
        things.add(thing15);
        things.add(thing16);
        things.add(thing17);





    }
    public void atClick(int a, int b){
        x1= a;
        y1= b;
        System.out.println(a);
        System.out.println(b);
        if(expl && a>0){
            what = true;
            expl = false;
        }
        else{
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
        if (t11 && x1<1641 && y1<1050) {
            t11=false;
        }
        if(thing15.x<x1 && thing15.y<y1 && thing15.x+thing15.w>x1 && thing15.y+thing15.h>y1){
            this.t11=true;
            for(int i = 0; i < frame.inventory.size(); i = i + 1){
                if(frame.inventory.get(i)==frame.answert2){
                    t1=t1+1;

                }
            }
            if(t1==0){
                frame.inventory.add(frame.answert2);
            }

        }  if (t8 && x1<1641 && y1<1050) {
            t8=false;
        }
        if(thing11.x<x1 && thing11.y<y1 && thing11.x+thing11.w>x1 && thing11.y+thing11.h>y1){
            this.t8=true;
            for(int i = 0; i < frame.inventory.size(); i = i + 1){
                if(frame.inventory.get(i)==frame.answert33){
                    t2=t2+1;

                }
            }
            if(t2==0){
                frame.inventory.add(frame.answert33);
            }

        }  if (t4 && x1<1641 && y1<1050) {
            t4=false;
        }
        if(thing3.x<x1 && thing3.y<y1 && thing3.x+thing3.w>x1 && thing3.y+thing3.h>y1){
            this.t4=true;
            for(int i = 0; i < frame.inventory.size(); i = i + 1){
                if(frame.inventory.get(i)==frame.answert4){
                    t3=t3+1;

                }
            }
            if(t3==0){
                frame.inventory.add(frame.answert4);
            }

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
        if ( a>25 && a<225 && b>950 && b<1040){

            frame.yes = false;
            frame.no = true;

        }


    }

    public void paint(Graphics g) throws IOException {
        if (togo) {
            image00 = ImageIO.read(new File("data\\Fon.jpg"));
            g.drawImage(image00, 0, 15,1641, 1050, null);

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
            g.drawImage(exit, 25,950,200,90, null);
            if(expl){
                BufferedImage expl = ImageIO.read(new File("data\\explLocation.png"));
                g.drawImage(expl, 0, 15,1641, 1050, null);
            }



            if (what) {

                BufferedImage imagee = ImageIO.read(new File("data\\Find 7.png"));
                g.drawImage(imagee, 270, 250, 1200, 600, null);
            }
            if (progress >= pr && tobe && !togo) {
                BufferedImage imagee = ImageIO.read(new File("data\\Continius 1.png"));
                g.drawImage(imagee, 270, 150, 1200, 800, null);
                be = true;
            }
            if (t11){
                Color color1 = new Color(253, 253, 253);
                g.setColor(color1);
                g.fillRect(410,262,821,526);
                g.drawImage(frame.answert2, 410, 262, 821, 526, null);
            }
            if (t4){
                Color color1 = new Color(253, 253, 253);
                g.setColor(color1);
                g.fillRect(410,262,821,526);
                g.drawImage(frame.answert4, 410, 262, 821, 526, null);
            }
            if (t8){
                Color color1 = new Color(253, 253, 253);
                g.setColor(color1);
                g.fillRect(410,262,821,526);
                g.drawImage(frame.answert33, 410, 262, 821, 526, null);
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



