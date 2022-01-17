import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
    private handeler handeler;
    public KeyInput(handeler handeler){this.handeler=handeler;}

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        System.out.println(key);
        //for(int i=0;i<handeler.object.size();i++){
        //gameobject TempObject= handeler.object.get(i);
        //if (TempObject.GetID()==ID.player){
        //if(key==KeyEvent.VK_W){TempObject.Setvely(-5);}
        // if(key==KeyEvent.VK_S){TempObject.Setvely(5);}
        // if(key==KeyEvent.VK_D){TempObject.Setvelx(5);}
        // if(key==KeyEvent.VK_A){TempObject.Setvelx(-5);}
        //   }
        // if (TempObject.GetID()==ID.player2){
        //  if(key==KeyEvent.VK_UP){TempObject.Setvely(-5);}
        //  if(key==KeyEvent.VK_DOWN){TempObject.Setvely(5);}
        // if(key==KeyEvent.VK_RIGHT){TempObject.Setvelx(5);}
        // if(key==KeyEvent.VK_LEFT){TempObject.Setvelx(-5);}
        //   }
        //   }
        }


    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        for(int i=0;i<handeler.object.size();i++){
            gameobject TempObject= handeler.object.get(i);
            if (TempObject.GetID()==ID.player){
                if(key==KeyEvent.VK_W){TempObject.Setvely(0);}
                if(key==KeyEvent.VK_S){TempObject.Setvely(0);}
                if(key==KeyEvent.VK_D){TempObject.Setvelx(0);}
                if(key==KeyEvent.VK_A){TempObject.Setvelx(0);}
            }
            if (TempObject.GetID()==ID.player2){
                if(key==KeyEvent.VK_UP){TempObject.Setvely(0);}
                if(key==KeyEvent.VK_DOWN){TempObject.Setvely(0);}
                if(key==KeyEvent.VK_RIGHT){TempObject.Setvelx(0);}
                if(key==KeyEvent.VK_LEFT){TempObject.Setvelx(0);}
                }
            }
        }

    }


