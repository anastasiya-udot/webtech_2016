package obj;

import java.util.ArrayList;
import java.awt.Color;
/**
 * Created by anastasiya on 20.9.16.
 */
public class Basket {

    private int totalWeight;
    private ArrayList<Ball> arrayBall;

    public int getTotalWeight(){
        return totalWeight;
    }

    public void putBall(Ball ball){
        arrayBall.add(ball);
        totalWeight += ball.getWeight();
    }

    public Basket(){
        arrayBall = new ArrayList<Ball>();
        totalWeight = 0;
    }

    public int countUpColorBalls(Color color){
        int counter = 0;
        for (Ball unit: arrayBall){
            if (unit.getColor() == color) counter++;
        }
        return counter;
    }
}
