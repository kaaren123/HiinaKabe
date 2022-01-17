import groovyjarjarantlr4.v4.misc.Utils;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class mäng extends Canvas implements Runnable{

    public mäng(){

        handeler = new handeler();
        aken aken1=new aken(1650,1080,"kk", this);
        handeler.addgameobject(new nupp(scale(300),scale(300),ID.mangija1));
        handeler.addgameobject(new nupp(scale(1000),scale(300),ID.mangija1));
        handeler.addgameobject(new koht(scale(400),scale(400),ID.enemy,"l1"));
        handeler.addgameobject(new koht(scale(496),scale(597),ID.enemy,"l2"));
        handeler.addgameobject(new tekst(scale(350),scale(350),ID.tekst,"Gamer"));
        handeler.addgameobject(new nupp(scale(200),scale(200),ID.mangija2));
        this.addKeyListener(new KeyInput(handeler));
        this.addMouseListener(new MouseListener1(handeler));
        this.requestFocus();
    }
    private handeler handeler;
    private Thread thread;
    private boolean running = false;
    public synchronized void start(){
        thread=new Thread(this);
        thread.start();
        running=true;
    }
    public static int scale(int a){
        double laius =1920;
        double b = a;
        Dimension size = Toolkit. getDefaultToolkit(). getScreenSize();
        double k= size.width;
        b=b/(laius/k);
        int c=(int)b;
        return c;
    }
    public void run(){
        long LastTime = System.nanoTime();
        double amountOfTicks= 60.0;
        double ns= 1000000000/amountOfTicks;
        double delta =0;
        long timer = System.currentTimeMillis();
        int frames =0;
        while(running){
            long now= System.nanoTime();
            delta +=(now - LastTime)/ns;
            LastTime = now;
            while (delta >=1){
                tick();
                delta--;
            }
            if(running)
                render();
            frames++;

            if(System.currentTimeMillis() - timer > 1000){
                //System.out.println(frames);
            }
        }
        stop();
    }
    private void tick(){
        handeler.tick();
    }
    private void render(){
        BufferStrategy bs= this.getBufferStrategy();
        if(bs==null){
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();
        BufferedImage image = loadImage("img_1.png");
        g.drawImage(image, 0, 0, null);

        handeler.render(g);

        g.dispose();
        bs.show();
    }
    public BufferedImage loadImage(String path) {

        ImageIcon icon = new ImageIcon(this.getClass().getClassLoader().getResource(path));

        BufferedImage image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        Image pilt=icon.getImage();
        Image muudetudpilt = pilt.getScaledInstance(scale(1920),scale(1080), Image.SCALE_SMOOTH);
        icon=new ImageIcon(muudetudpilt);

        Graphics g = image.createGraphics();

        icon.paintIcon(null, g, 0, 0);
        g.dispose();

        return image;

    }
    public void stop(){
       try{
           thread.join();
           running=false;
    }catch (Exception e){
       e.printStackTrace();}
    }

    public static void main(String args[]){
        new mäng();

    }

    }