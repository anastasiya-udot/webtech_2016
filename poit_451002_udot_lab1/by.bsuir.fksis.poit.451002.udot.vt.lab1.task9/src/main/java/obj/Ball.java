package obj;

import java.awt.Color;
/**
 * Created by anastasiya on 20.9.16.
 */
public class Ball {

    private Color color;
    private int weight;

    public Color getColor(){
        return this.color;
    }

    public int getWeight() {
        return this.weight;
    }

    public Ball(Color color, int weight){
        this.color = color;
        this.weight = weight;
    }
}
