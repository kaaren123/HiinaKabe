import java.awt.*;

public class nupp extends gameobject{
    nupp(int x, int y, ID id){
        super(x,y,id);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        if(id==ID.mangija1){g.setColor(Color.blue);}
        else {
            g.setColor(Color.cyan);}
        g.fillOval(x,y,mäng.scale(26),mäng.scale(26));

    }

}
