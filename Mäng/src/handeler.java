import java.awt.*;
import java.util.LinkedList;

public class handeler {
    LinkedList<gameobject> object= new LinkedList<gameobject>();
    public void tick(){
        for (gameobject tempObject : object) {
            tempObject.tick();
        }
    }
    public void render(Graphics g){
        for (gameobject tempObject : object) {
            tempObject.render(g);
        }

    }
    public void addgameobject(gameobject object){
        this.object.add(object);
    }
    public void removegameobject(gameobject object){
        this.object.remove(object);
    }
}
