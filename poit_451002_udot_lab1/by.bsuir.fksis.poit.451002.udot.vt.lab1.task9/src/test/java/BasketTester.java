import obj.Ball;
import obj.Basket;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static junit.framework.Assert.*;
/**
 * Created by anastasiya on 21.9.16.
 */
public class BasketTester {

    private ArrayList<Ball> balls;

    private void generateBalls(Basket basket){
        balls = new ArrayList<Ball>();
        balls.add(new Ball(Color.black, 5));
        balls.add(new Ball(Color.red, 12));
        balls.add(new Ball(Color.green, 17));
        balls.add(new Ball(Color.blue, 1));
        balls.add(new Ball(Color.black, 20));
        balls.add(new Ball(Color.yellow, 45));
        balls.add(new Ball(Color.blue, 1));
        balls.add(new Ball(Color.green, 13));

        for(Ball ball: balls)
            basket.putBall(ball);

    }

    @Test
    public void testBasketBehavior(){
        Basket basket = new Basket();
        generateBalls(basket);
        assertEquals(2, basket.countUpColorBalls(Color.blue));
        assertEquals(114, basket.getTotalWeight());
    }
}
