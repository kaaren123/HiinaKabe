import java.awt.*;

public class player extends gameobject{
    player(int x, int y, ID id){
        super(x,y,id);
    }
    public void tick() {
        x+=Velx;
        y+=Vely;
    }
    public void render(Graphics g) {
        if(id==ID.player){g.setColor(Color.blue);}
        else {
        g.setColor(Color.cyan);}
        g.fillRect(x, y,100,100);
    }
}
