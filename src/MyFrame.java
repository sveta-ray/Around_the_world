import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MyFrame extends JFrame implements MouseListener, MouseMotionListener,KeyEventDispatcher {

    Location1 location1;
    Location2 location2;
    Location3 location3;
    Location4 location4;
    Location5 location5;
    Location6 location6;
    Location7 location7;
    Location8 location8;
    Location9 location9;
    Location10 location10;

    Location11 location11;
    Location12 location12;


    Quiz1 seif;
    Quiz2 way;
    BufferedImage answert2;
    Quiz3 code;
    BufferedImage answert31;
    BufferedImage answert32;
    BufferedImage answert33;
    Quiz4 letter;
    BufferedImage answert4;
    Quiz5 sight;
    BufferedImage answert5;
    Quiz6 snake;
    BufferedImage answert6;
    int inv;
    Quiz7 line;
    Quiz8 scrin;
    Quiz9 locket;
    BufferedImage answert91;
    BufferedImage answert92;
    Quiz10 bookcase;
    BufferedImage answert10;
    Quiz11 googlemap;
    Quiz12 satellite;

    int level;
    int levelup;
    BufferedImage image;
    BufferedImage map1;
    BufferedImage map2;
    BufferedImage map3;
    BufferedImage map4;
    BufferedImage map5;
    BufferedImage map6;
    BufferedImage map7;
    BufferedImage begin1;

    boolean yes;
    boolean no;
    int height;
    int width;
    boolean begin;
    boolean inventor;
    BufferedImage dialog;
    int day;
    boolean dio;
    int talk;
    ArrayList<BufferedImage> inventory = new ArrayList<BufferedImage>();
    Thread music;
    MakeSound ms = new MakeSound();


    public MyFrame() throws IOException {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double w = screenSize.getWidth();
        double h = screenSize.getHeight();
//        this.width = (int) w;
//        this.height = (int)h;
        this.width = 1641;
        this.height = 1050;
//        setSize(width,  height);
        setSize(1641, 1065);
//        System.out.println(width);
//        System.out.println(height);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        image = ImageIO.read(new File("data\\Fon.jpg"));
        map1 = ImageIO.read(new File("data\\Map\\Map1.png"));
        map2 = ImageIO.read(new File("data\\Map\\Map2.png"));
        map3 = ImageIO.read(new File("data\\Map\\Map3.png"));
        map4 = ImageIO.read(new File("data\\Map\\Map4.png"));
        map5 = ImageIO.read(new File("data\\Map\\Map5.png"));
        map6 = ImageIO.read(new File("data\\Map\\Map6.png"));
        map7 = ImageIO.read(new File("data\\Map\\Map7.png"));

        answert2 = ImageIO.read(new File("data\\Goal answer.png"));
        answert31 = ImageIO.read(new File("data\\Codeanswer2.png"));
        answert32 = ImageIO.read(new File("data\\Codeanswer9.png"));
        answert33 = ImageIO.read(new File("data\\Codeanswer5.png"));
        answert5 = ImageIO.read(new File("data\\Quiz5\\Quiz5Answer.png"));
        answert4 = ImageIO.read(new File("data\\Quiz4answer.png"));
        answert6 = ImageIO.read(new File("data\\Quiz6\\Quiz6Answer.png"));
        answert91 = ImageIO.read(new File("data\\Quiz9answer1.png"));
        answert92 = ImageIO.read(new File("data\\Quiz9answer2.png"));
        answert10 = ImageIO.read(new File("data\\Quiz10answer.png"));

        dialog = ImageIO.read(new File("data\\dialog1.png"));
        day = 1;
        level = 0;
        levelup = 0;
        inv = 11;
        talk = 1;
        dio = false;
        location1 = new Location1(0, 0, this);
        location2 = new Location2(0, 0, this);
        location3 = new Location3(0, 0, this);
        location4 = new Location4(0, 0, this);
        location5 = new Location5(0, 0, this);
        location6 = new Location6(0, 0, this);
        location7 = new Location7(0, 0, this);
        location8 = new Location8(0, 0, this);
        location9 = new Location9(0, 0, this);
        location10 = new Location10(0, 0, this);
        location11 = new Location11(0, 0, this);
        location12 = new Location12(0, 0, this);
        no = false;
        inventor = true;
//        no=true;
        yes = false;
        seif = new Quiz1(this);
        way = new Quiz2(this);
        code = new Quiz3(this);
        letter = new Quiz4(this);
        sight = new Quiz5(this);
        snake = new Quiz6(this);
        line = new Quiz7(this);
        scrin = new Quiz8(this);
        locket = new Quiz9(this);
        bookcase = new Quiz10(this);
        googlemap = new Quiz11(this);
        satellite = new Quiz12(this);
        begin = true;


//        level = 12;
//        levelup = 1;
//        no = true;
//
//        yes =true;
//        begin =false;

//        location2 = new Location(0,0,2);
//        public static BufferedImage getScreenShot(
//                Component component) {
//
//            BufferedImage image = new BufferedImage(
//                    component.getWidth(),
//                    component.getHeight(),
//                    BufferedImage.TYPE_INT_RGB
//            );
//            // call the Component's paint method, using
//            // the Graphics object of the image.
//            component.paint( image.getGraphics() ); // alternately use .printAll(..)
//            return image;
//        }
        addMouseListener(this);
        addMouseMotionListener(this);
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();   // менеджер по трудоустройству слушателей клавиатуры
        manager.addKeyEventDispatcher(this);

        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        BufferStrategy bufferStrategy = getBufferStrategy();
        if (bufferStrategy == null) {
            createBufferStrategy(2);
            bufferStrategy = getBufferStrategy();
        }
        g = bufferStrategy.getDrawGraphics();
        g.clearRect(0, 0, getWidth(), getHeight());


//        g.drawImage(map, width, height, null);
        try {

            if(levelup==0 && ms != null  && (!ms.playing || ms.strFilename != "Music\\Music0.wav")){
                System.out.println("Music 1");
                if (music != null){
                    music.stop();
                }
                music = new Thread(() -> {
                    System.out.println("Music 1 1");
                    ms.playSound("Music\\Music0.wav");
                });
                music.start();
            }
            if (levelup==1 && ms != null  && (!ms.playing || !ms.strFilename.equals("Music\\Music" + day + ".wav"))) {
                System.out.println("Music 2");
                if (music != null){
                    music.stop();
                }
                music = new Thread(() -> {
                    System.out.println("Music\\Music" + day +".wav");
                    ms.playSound("Music\\Music" + day +".wav");
                });
                music.start();
            }
            if (begin) {
                begin1 = ImageIO.read(new File("data\\Begin.png"));
                g.drawImage(begin1, 0, 15, 1641, 1050, null);

            } else if (dio && !begin) {
                g.drawImage(image, 0, 15, 1641, 1050, null);
                BufferedImage diolog = ImageIO.read(new File("data\\diologs\\diologs" + day + talk + ".png"));
                g.drawImage(diolog, 0, 15, 1641, 1050, null);
                BufferedImage imageee = ImageIO.read(new File("data\\rect.png"));
                g.drawImage(imageee, 100, 100, 200, 100, null);
                g.setFont(new Font("TimesRoman", Font.PLAIN, 35));
                g.drawString("пропустить", 110, 160);
            } else {
                if(level==13){
                    dio =true;
                }

                if (!no && levelup == 0) {
                    if (day == 1) {
                        g.drawImage(map1, 0, 15, 1641, 1050, null);
                    }
                    if (day == 2) {
                        g.drawImage(map2, 0, 15, 1641, 1050, null);
                    }
                    if (day == 3) {
                        g.drawImage(map3, 0, 15, 1641, 1050, null);
                    }
                    if (day == 4) {
                        g.drawImage(map4, 0, 15, 1641, 1050, null);
                    }
                    if (day == 5) {
                        g.drawImage(map5, 0, 15, 1641, 1050, null);
                    }
                    if (day == 6) {
                        g.drawImage(map6, 0, 15, 1641, 1050, null);
                    }
                    if (day == 7) {
                        g.drawImage(map7, 0, 15, 1641, 1050, null);
                    }

                }
                if (yes && no && levelup == 1) {


                    if (level == 1) {

                        location1.paint(g);
                    } else if (level == 2) {

                        location2.paint(g);
                    } else if (level == 3) {

                        location3.paint(g);
                    } else if (level == 4) {

                        location4.paint(g);
                    } else if (level == 5) {

                        location5.paint(g);
                    } else if (level == 6) {

                        location6.paint(g);
                    } else if (level == 7) {

                        location7.paint(g);
                    } else if (level == 8) {

                        location8.paint(g);
                    } else if (level == 9) {

                        location9.paint(g);
                    } else if (level == 10) {

                        location10.paint(g);
                    } else if (level == 11) {

                        location11.paint(g);
                    } else if (level == 12) {

                        location12.paint(g);
                    }
//                } else if (levelup == 0) {
//                    g.drawImage(map, 0, 40, 1641,  1050, null);
//
//                }
                }
                if (!yes && no && levelup == 1) {
                    if (level == 1) {
                        seif.paint(g);
                    } else if (level == 2) {
                        way.paint(g);
                    } else if (level == 3) {
                        code.paint(g);
                    } else if (level == 4) {
                        letter.paint(g);
                    } else if (level == 5) {
                        sight.paint(g);
                    } else if (level == 6) {
                        snake.paint(g);
                    } else if (level == 7) {
                        line.paint(g);
                    } else if (level == 8) {
                        scrin.paint(g);
                    } else if (level == 9) {
                        locket.paint(g);
                    } else if (level == 10) {
                        bookcase.paint(g);
                    } else if (level == 11) {
                        googlemap.paint(g);
                    } else if (level == 12) {
                        satellite.paint(g);
                    }


                }
                if (!no && levelup == 1) {
                    g.drawImage(image, 0, 15, 1641, 1050, null);

                    g.drawImage(dialog, 117, 82, 1406, 900, null);

                }
                if (inventor && levelup == 1 && no) {
                    BufferedImage imageee = ImageIO.read(new File("data\\rect.png"));
                    g.drawImage(imageee, 250, 950, 200, 90, null);
                    if (!yes) {
                        Color color3 = new Color(159, 168, 255);
                        g.setColor(color3);
                    }
                    if (yes) {
                        Color color3 = new Color(2, 3, 5);
                        g.setColor(color3);
                    }


                    g.setFont(new Font("TimesRoman", Font.PLAIN, 40));
                    g.drawString("инвентарь", 260, 1000);
                } else if (!inventor && levelup == 1 && no) {
                    BufferedImage imageee = ImageIO.read(new File("data\\rect.png"));
                    g.drawImage(imageee, 250, 950, 1260, 90, null);
                    for (int i = 0; i < inventory.size(); i = i + 1) {
                        g.drawImage(inventory.get(i), 265 + i * 110, 950, 100, 80, null);

                    }
                    BufferedImage imag1 = ImageIO.read(new File("data\\close.png"));
                    g.drawImage(imag1, 230, 985, 20, 20, null);

                }
                if (inv != 11) {

                    Color color1 = new Color(253, 253, 253);
                    g.setColor(color1);
                    g.fillRect(410,262,821,526);
                    g.drawImage(inventory.get(inv), 410, 262, 821, 526, null);
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        try {
//            location2.paint(g);
////        } catch (IOException e) {
//            throw new RuntimeException(e);
        //  }


        g.dispose();
        bufferStrategy.show();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getX());
        System.out.println(e.getY());
        if (begin) {
            if (e.getX() > 560 && e.getX() < 2000 && e.getY() < 870 && e.getY() > 735) {
                begin = false;
                dio = true;
            }
        } else if (dio) {
            if (e.getX() > 0) {

                talk = talk + 1;
            }
            if (e.getX() > 100 && e.getX() < 300 && e.getY() > 100 && e.getY() < 200) {
                dio = false;
            }
            if (talk == 15 && e.getX() > 0 && day == 1) {
                dio = false;
            }
            if (talk == 14 && e.getX() > 0 && day == 2) {
                dio = false;
            }
            if (talk == 8 && e.getX() > 0 && day == 3) {
                dio = false;
            }
            if (talk == 10 && e.getX() > 0 && day == 4) {
                dio = false;
            }
            if (talk == 13 && e.getX() > 0 && day == 5) {
                dio = false;
            }
            if (talk == 6 && e.getX() > 0 && day == 6) {
                dio = false;
            }
            if (talk == 5 && e.getX() > 0 && day == 7) {
                dio = false;
            }
        } else {

            if (e.getX() > 249 && e.getY() > 951 && e.getX() < 451 && e.getY() < 1041) {
                inventor = false;
            }
            if (e.getX() >230 && e.getX() < 250 && e.getY() > 985 && e.getY() < 1005 && !inventor) {
                inventor = true;
            }
            System.out.println(inventor);
            if (!yes && no && levelup == 1) {
                if (level == 1) {

                    seif.click(e.getX(), e.getY());
                } else if (level == 2) {
                    way.click(e.getX(), e.getY());
                } else if (level == 3) {
                    code.click(e.getX(), e.getY());

                } else if (level == 4) {
                    letter.click(e.getX(), e.getY());
                } else if (level == 5) {
                    sight.click(e.getX(), e.getY());
                } else if (level == 6) {
                    snake.click(e.getX(), e.getY());
                } else if (level == 7) {
                    line.click(e.getX(), e.getY());
                } else if (level == 8) {
                    scrin.click(e.getX(), e.getY());
                } else if (level == 9) {
                    locket.click(e.getX(), e.getY());
                } else if (level == 10) {
                    bookcase.click(e.getX(), e.getY());
                } else if (level == 11) {
                    googlemap.click(e.getX(), e.getY());
                } else if (level == 12) {
                    satellite.click(e.getX(), e.getY());
                }
            } else if (yes && no && levelup == 1) {
                if (level == 1) {
                    location1.atClick(e.getX(), e.getY());
                } else if (level == 2) {
                    location2.atClick(e.getX(), e.getY());
                } else if (level == 3) {
                    location3.atClick(e.getX(), e.getY());
                } else if (level == 4) {
                    location4.atClick(e.getX(), e.getY());
                } else if (level == 5) {
                    location5.atClick(e.getX(), e.getY());
                } else if (level == 6) {
                    location6.atClick(e.getX(), e.getY());
                } else if (level == 7) {
                    location7.atClick(e.getX(), e.getY());
                } else if (level == 8) {
                    location8.atClick(e.getX(), e.getY());
                } else if (level == 9) {
                    location9.atClick(e.getX(), e.getY());
                } else if (level == 10) {
                    location10.atClick(e.getX(), e.getY());
                } else if (level == 11) {
                    location11.atClick(e.getX(), e.getY());
                } else if (level == 12) {
                    location12.atClick(e.getX(), e.getY());
                }
            }
            if (levelup == 0 && !no) {
                System.out.println(e.getX());
                System.out.println(e.getY());
                if (e.getX() > 498 && e.getX() < 605 && e.getY() > 570 && e.getY() < 680 && (day == 2 || day == 4 || day == 7)) {
                    levelup = 1;
                    level = 2;

//                    System.out.println(no);
//                    System.out.println(levelup);
                    System.out.println(level);
                } else if (e.getX() > 735 && e.getX() < 845 && e.getY() > 700 && e.getY() < 800 && (day == 1 || day == 5 || day == 7)) {
                    levelup = 1;
                    level = 1;
//                    System.out.println(no);
//                    System.out.println(levelup);
                    System.out.println(level);
                } else if (e.getX() > 235 && e.getX() < 365 && e.getY() > 450 && e.getY() < 580 && (day == 3 || day == 7)) {
                    levelup = 1;
                    level = 3;
//                    System.out.println(no);
//                    System.out.println(levelup);
                    System.out.println(level);
                } else if (e.getX() > 1150 && e.getX() < 1270 && e.getY() > 850 && e.getY() < 950 && (day == 4 || day == 3 || day == 7)) {
                    levelup = 1;
                    level = 4;
//                    System.out.println(no);
                    System.out.println(level);
                } else if (e.getX() > 380 && e.getX() < 540 && e.getY() > 50 && e.getY() < 180 && (day == 5 || day == 6 || day == 7)) {
                    levelup = 1;
                    level = 5;

//                    System.out.println(no);
                    System.out.println(level);
                } else if (e.getX() > 230 && e.getX() < 370 && e.getY() > 780 && e.getY() < 900 && (day == 4 || day == 7)) {
                    levelup = 1;
                    level = 6;
                    System.out.println(level);
//                    System.out.println(no);
//                    System.out.println(level);
                } else if (e.getX() > 1385 && e.getX() < 1475 && e.getY() > 665 && e.getY() < 760 && (day == 6 || day == 5 || day == 7)) {
                    levelup = 1;
                    level = 7;
                    System.out.println(level);
//                    System.out.println(no);
//                    System.out.println(level);
                } else if (e.getX() > 415 && e.getX() < 540 && e.getY() > 455 && e.getY() < 550 && (day == 3 || day == 7)) {
                    levelup = 1;
                    level = 8;
                    System.out.println(level);
//                    System.out.println(no);
//                    System.out.println(level);
                } else if (e.getX() > 340 && e.getX() < 520 && e.getY() > 940 && e.getY() < 1065 && (day == 3 || day == 6 || day == 7)) {
                    levelup = 1;
                    level = 9;
                    System.out.println(level);
//                    System.out.println(no);
//                    System.out.println(level);
                } else if (e.getX() > 600 && e.getX() < 700 && e.getY() > 310 && e.getY() < 420 && (day == 4 || day == 7)) {
                    levelup = 1;
                    level = 10;
                    System.out.println(level);
//                    System.out.println(no);
//                    System.out.println(level);
                } else if (e.getX() > 0 && e.getX() < 130 && e.getY() > 280 && e.getY() < 400 && (day == 5 || day == 7)) {
                    levelup = 1;
                    level = 11;
                    System.out.println(level);
//                    System.out.println(no);
//                    System.out.println(level);
                } else if (e.getX() > 850 && e.getX() < 1000 && e.getY() > 920 && e.getY() < 1030 && (day == 6 || day == 5 || day == 7)) {
                    levelup = 1;
                    level = 12;

                }
                else if (e.getX() > 850 && e.getX() < 940 && e.getY() > 800 && e.getY() < 880 && (day == 7)) {
                    levelup = 0;
                    level=13;


                }
            }
            if (inv != 11 && e.getX() > 0) {
                inv = 11;
            }
            if (!inventor && e.getY() > 950 && e.getY() < 1050) {

                for (int i = 0; i < inventory.size(); i = i + 1) {
                    if (e.getX() < 265 + 110 * i + 100 && e.getX() > 265 + 110 * i) {
                        inv = i;

                    }
                }
            }

            if (!no && levelup == 1) {

                if (e.getX() < 745 && e.getX() > 560 && e.getY() > 605 && e.getY() < 675) {
                    no = true;
                    yes = true;
                }
                if (e.getX() < 1070 && e.getX() > 875 && e.getY() > 610 && e.getY() < 685) {
                    no = true;
                    yes = false;
                }
            }


        }
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent e) {


        if (e.getID() == KeyEvent.KEY_PRESSED) {
            System.out.println(e.getKeyCode());
            if (!yes && no) {
                if (levelup == 1 && level == 1) {
                    seif.touch(e.getKeyCode());
                } else if (levelup == 1 && level == 2) {
                    try {
                        way.touch(e.getKeyCode());
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                } else if (levelup == 1 && level == 3) {

                    code.touch(e.getKeyCode());

                } else if (levelup == 1 && level == 4) {

                    letter.touch(e.getKeyCode(), e.getKeyChar());

                } else if (levelup == 1 && level == 5) {

                    sight.touch(e.getKeyCode());

                } else if (levelup == 1 && level == 6) {

                    try {
                        snake.touch(e.getKeyCode());
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                } else if (levelup == 1 && level == 7) {

                    line.touch(e.getKeyCode());


                } else if (levelup == 1 && level == 8) {

                    scrin.touch(e.getKeyCode());


                } else if (levelup == 1 && level == 9) {

                    locket.touch(e.getKeyCode(), e.getKeyChar());

                } else if (levelup == 1 && level == 10) {

                    bookcase.touch(e.getKeyCode(), e.getKeyChar());

                } else if (levelup == 1 && level == 11) {

                    googlemap.touch(e.getKeyCode());

                } else if (levelup == 1 && level == 12) {

                    satellite.touch(e.getKeyCode(), e.getKeyChar());

                }

            } else if (e.getID() == KeyEvent.KEY_RELEASED) {

            } else if (e.getID() == KeyEvent.KEY_TYPED) {

            }


        }
        return false;
    }
//    for (int row = 0; row < rows; rows++) {
//        for (int col = 0; col < columns; col++) {
//            int rgb = image1.getRGB(col, row);
//            int rgb2 = image2.getRGB(col, row);
//
//            if (rgb != rgb2){
//                System.out.println("NO!!!!!");
//            }
//        }

}


