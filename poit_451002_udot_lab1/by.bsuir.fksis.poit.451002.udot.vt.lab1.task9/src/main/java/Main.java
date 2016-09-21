import obj.*;
import java.awt.Color;
/**
 * Created by anastasiya on 20.9.16.
 */
public class Main {

    private static int MAX_WEIGHT = 5;
    private static int BALLS_NUMBER = 10;

    public static void main(String[] args) {
        Basket basket = new Basket();
        fillBasket(basket, Color.black);
        fillBasket(basket, Color.blue);
        fillBasket(basket, Color.green);
        System.out.println(basket.getTotalWeight());
        System.out.println(basket.countUpColorBalls(Color.blue));
    }

    private static Ball generateBall(Color color){
        return new Ball(color, (int)((Math.random() * MAX_WEIGHT  + 1)));
    }


    private static void fillBasket(Basket basket, Color color){
        for(int counter = 0; counter < BALLS_NUMBER; counter++) basket.putBall(generateBall(color));
    }
}
