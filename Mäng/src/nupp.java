import java.awt.*;

public class nupp extends gameobject{
    protected Color varv=Color.blue;
    nupp(int x, int y, ID id){
        super(x,y,id);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        if(id==ID.mangija1){g.setColor(varv);}
        else {
            g.setColor(Color.cyan);}
        g.fillOval(x,y,mäng.scale(26),mäng.scale(26));

    }

}
