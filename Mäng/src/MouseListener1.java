import java.awt.event.MouseEvent;

import static java.lang.Math.abs;

public class MouseListener1 implements java.awt.event.MouseListener {
    private handeler handeler;
    public int arv1=0;
    public gameobject tempnupp;
    public int käik=1;

    MouseListener1(handeler handeler) {
        this.handeler = handeler;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (käik == 1) {
            for (int i = 0; i < handeler.object.size(); i++) {
                gameobject tempobject = handeler.object.get(i);
                if (tempobject.GetID() == ID.mangija1) {
                    if (abs(e.getX() - (tempobject.Getx() + mäng.scale(13))) < mäng.scale(13) & abs(e.getY() - (tempobject.Gety()) - mäng.scale(13)) < mäng.scale(13)) {
                        arv1 = 1;
                        tempnupp = tempobject;
                        System.out.println(arv1);
                    }
                }
            }
            if (arv1 == 1) {
                for (int a = 0; a < handeler.object.size(); a++) {
                    gameobject tempobejct2 = handeler.object.get(a);
                    if (tempobejct2.GetID() == ID.enemy) {
                        if (abs(e.getX() - (tempobejct2.Getx() + mäng.scale(13))) < mäng.scale(13) & abs(e.getY() - (tempobejct2.Gety()) - mäng.scale(13)) < mäng.scale(13)) {
                            handeler.addgameobject(new tekst(700, 350, ID.tekst, "Gamer"));
                            tempnupp.Sety(tempobejct2.Gety());
                            tempnupp.Setx(tempobejct2.Getx());
                            käik++;
                        }
                    }
                }

            }
        }
        else if(käik==2){  for (int i = 0; i < handeler.object.size(); i++) {
            gameobject tempobject = handeler.object.get(i);
            if (tempobject.GetID() == ID.mangija2) {
                if (abs(e.getX() - (tempobject.Getx() + mäng.scale(13))) < mäng.scale(13) & abs(e.getY() - (tempobject.Gety()) - mäng.scale(13)) < mäng.scale(13)) {
                    arv1 = 1;
                    tempnupp = tempobject;
                    System.out.println(arv1);
                }
            }
        }
            if (arv1 == 1) {
                for (int a = 0; a < handeler.object.size(); a++) {
                    gameobject tempobejct2 = handeler.object.get(a);
                    if (tempobejct2.GetID() == ID.enemy) {
                        if (abs(e.getX() - (tempobejct2.Getx() + mäng.scale(13))) < mäng.scale(13) & abs(e.getY() - (tempobejct2.Gety()) - mäng.scale(13)) < mäng.scale(13)) {
                            handeler.addgameobject(new tekst(700, 350, ID.tekst, "Gamer"));
                            tempnupp.Sety(tempobejct2.Gety());
                            tempnupp.Setx(tempobejct2.Getx());
                            käik++;
                        }
                    }
                }

            }}
    }


        @Override
        public void mousePressed (MouseEvent e){

        }

        @Override
        public void mouseReleased (MouseEvent e){

        }

        @Override
        public void mouseEntered (MouseEvent e){

        }

        @Override
        public void mouseExited (MouseEvent e){

        }

    }