import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Location8 {
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
    Thing thing3;
    Thing thing4;
    boolean t4;
    Thing thing5;
    Thing thing6;
    Thing thing7;
    boolean t8;
    Thing thing8;
    Thing thing9;
    Thing thing10;
    boolean t11;
    Thing thing11;
//    Thing thing12;
    ArrayList<Thing> things = new ArrayList<Thing>();
    Thing thingS;

    ArrayList<Integer> code = new ArrayList<Integer>();


    BufferedImage image;
    BufferedImage imagee;
    BufferedImage image00;
    int progress;
    int pr;
    MyFrame frame;
    BufferedImage answert14;
    int l;
    boolean togo1;
    boolean tr;
    int t1;
    int t2;
    int t3;
    int c;
    boolean expl;


    public Location8(int x, int y, MyFrame frame) throws IOException {
        this.frame = frame;
        this.x = 440;
        this.y = 555;
        this.w = 1641;
        this.h = 1050;
//        this.w = frame.width;
//        this.h = frame.height;

        this.togo1 = false;
        l=11;
        expl = true;
        this.what = false;
        this.tobe = true;
        this.tobe1 = true;
        this.togo = false;
        this.be = false;
        this.tr = true;
        this.rr = false;
        this.t4= false;
        this.t8= false;
        this.t11= false;
//
//        answert14 = ImageIO.read(new File("data\\Goal answer.png"));
        pr = 7;
        image = ImageIO.read(new File("data\\Location 8.png"));
        thing1 = new Thing(1190, 510, 30, 15, new ThingAction() {
            @Override
            public void onClick() {


            }
        });//ok
        thing2 = new Thing(545, 900, 40, 15, new ThingAction() {
            @Override
            public void onClick() throws IOException {
//                         BufferedImage image01 = ImageIO.read(new File("data\\circle.png"));


            }
        });//ok
        thing3 = new Thing(260, 390, 20, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });//ok
        thing4 = new Thing(1480, 820, 25, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });//ok
        thing5 = new Thing(1035, 500, 20, 30, new ThingAction() {
            @Override
            public void onClick() {


            }
        });//ok
        thing6 = new Thing(630, 400, 20, 25, new ThingAction() {
            @Override
            public void onClick() {


            }
        });//ok
        thing7 = new Thing(560, 640, 30, 25, new ThingAction() {
            @Override
            public void onClick() {


            }
        });//ok
        thing8 = new Thing(665, 280, 20, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });//ok
        thing9 = new Thing(1395, 470, 25, 15, new ThingAction() {
            @Override
            public void onClick() {


            }
        });//ok
        thing10 = new Thing(495, 650, 20, 15, new ThingAction() {
            @Override
            public void onClick() {


            }
        });//ok
        thing11 = new Thing(900, 190, 25, 20, new ThingAction() {
            @Override
            public void onClick() {


            }
        });
//        thing12 = new Thing(1240, 405, 15, 10, new ThingAction() {
//            @Override
//            public void onClick() {
//
//
////            }
//        });
        thingS = new Thing(1195, 685, 55, 30, new ThingAction() {
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
//        things.add(thing12);

    }

    public void atClick(int a, int b) {
        x1 = a;
        y1 = b;
        System.out.println(x1);
        System.out.println(y1);
        if(expl && a>0){
            what = true;
            expl = false;
        }
        else{
            if (x1 > 1200 && x1 < 1345 && y1 > 915 && y1 < 1015) {   //что ищем
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
            tobe1=true;
            be = false;
            togo = true;
        }
        if (be && !tobe && x1 > 1399 && x1 < 1601 && y1 > 949 && y1 < 1001) {
            togo = true;

        }
        if (x1 > thingS.x - 1 && x1 < thingS.x + thingS.w + 1 && y1 > thingS.y - 1 && y1 < thingS.y + thingS.h + 1) {

            rr = true;
        }
        if (t11 && x1<1641 && y1<1050) {
            t11=false;
        }
        if(thing10.x<x1 && thing10.y<y1 && thing10.x+thing10.w>x1 && thing10.y+thing10.h>y1){
            this.t11=true;
            for(int i = 0; i < frame.inventory.size(); i = i + 1){
                if(frame.inventory.get(i)==frame.answert6){
                    t1=t1+1;

                }
            }
            if(t1==0){
                frame.inventory.add(frame.answert6);
            }

        }  if (t8 && x1<1641 && y1<1050) {
            t8=false;
        }
        if(thing7.x<x1 && thing7.y<y1 && thing7.x+thing7.w>x1 && thing7.y+thing7.h>y1){
            this.t8=true;
            for(int i = 0; i < frame.inventory.size(); i = i + 1){
                if(frame.inventory.get(i)==frame.answert31){
                    t2=t2+1;

                }
            }
            if(t2==0){
                frame.inventory.add(frame.answert31);
            }

        }  if (t4 && x1<1641 && y1<1050) {
            t4=false;
        }
        if(thing4.x<x1 && thing4.y<y1 && thing4.x+thing4.w>x1 && thing4.y+thing4.h>y1){
            this.t4=true;
            for(int i = 0; i < frame.inventory.size(); i = i + 1){
                if(frame.inventory.get(i)==frame.answert32){
                    t3=t3+1;

                }
            }
            if(t3==0){
                frame.inventory.add(frame.answert32);
            }

        }

//        if(t4){
//            System.out.println(111111111);
//            t4=false;
//        }
//        if (t4 && x1<1641 && y1<1050) {
//            t4=false;
//        }
//        if(1400<x1 && 720<y1 && 1400+ 20>x1 && 720+ 25>y1){
//            this.t4=true;
//            for(int i = 0; i < frame.inventory.size()-1; i = i + 1){
//                if(frame.inventory.get(i)==answert14){
//                    t=t+1;
//
//                }
//            }
//            if(t==0){
//                frame.inventory.add(answert14);
//            }
//
//        }

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
        if (  a>25 && a<225 && b>950 && b<1040){

            frame.yes = false;
            frame.no = true;

        }





    }

    public void paint(Graphics g) throws IOException {
        if (togo) {
            image00 = ImageIO.read(new File("data\\Fon.jpg"));
//            g.drawImage(image00, 0, 15, frame.width, frame.height, null);
            g.drawImage(image00, 0, 15,1641, 1050, null);

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

                BufferedImage imagee = ImageIO.read(new File("data\\Find 8.png"));
                g.drawImage(imagee, 270, 250, 1200, 600, null);
            }
//            if (t4){
//                Color color1 = new Color(253, 253, 253);
//                g.setColor(color1);
//                g.fillRect(410,262,821,526);
//                g.drawImage(answert14, 410, 262, 821, 526, null);
//            }
            if (progress >= pr && tobe && !togo) {
                BufferedImage imagee = ImageIO.read(new File("data\\Continius 1.png"));
                g.drawImage(imagee, 270, 150, 1200, 800, null);
                be = true; //можно на следующий уровень
            }
            if (t11){
                Color color1 = new Color(253, 253, 253);
                g.setColor(color1);
                g.fillRect(410,262,821,526);
                g.drawImage(frame.answert6, 410, 262, 821, 526, null);
            }
            if (t4){
                Color color1 = new Color(253, 253, 253);
                g.setColor(color1);
                g.fillRect(410,262,821,526);
                g.drawImage(frame.answert32, 410, 262, 821, 526, null);
            }
            if (t8){
                Color color1 = new Color(253, 253, 253);
                g.setColor(color1);
                g.fillRect(410,262,821,526);
                g.drawImage(frame.answert31, 410, 262, 821, 526, null);
            }
//            if (progress >= pr && tobe && !togo && rr) {
//                BufferedImage imagee = ImageIO.read(new File("data\\Continius 1.png"));
//                g.drawImage(imagee, 270, 150, 1200, 800, null);
//                be = true; //можно на следующий уровень
//            }
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

