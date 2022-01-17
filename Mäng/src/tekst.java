import java.awt.*;

public class tekst extends gameobject{
    protected String lause;
    tekst(int x, int y, ID id, String lause){
        super(x,y,id);
        this.lause=lause;
    }

    @Override
    public void tick() {

    }
    public void render(Graphics g){
        g.setColor(Color.white);
        g.drawString(lause,x,y);
    }
}
