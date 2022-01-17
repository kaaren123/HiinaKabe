import java.awt.*;

public class koht extends gameobject {
    protected String nimi2;
    koht(int x, int y, ID id, String nimi) {
        super(x, y, id);
        nimi2=nimi;
    }
    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
            g.setColor(Color.white);
        g.drawOval(x,y,mäng.scale(26),mäng.scale(26));

    }
    public String Getnimi(){
        return nimi2;
    }
}
