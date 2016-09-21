package obj; /**
 * Created by anastasiya on 18.9.16.
 */

public class Area {

    private Rectangle rectangleAboveX;
    private  double RECTANGLE1_X = -4;
    private double RECTANGLE1_Y = 5;
    private double RECTANGLE1_HEIGHT = -5;
    private double RECTANGLE1_WIDTH = 8;

    private Rectangle rectangleBelowX;
    private double RECTANGLE2_X = -6;
    private double RECTANGLE2_Y = 0;
    private double RECTANGLE2_HEIGHT = -3;
    private double RECTANGLE2_WIDTH = 12;

    public Area(){
        rectangleAboveX = new Rectangle(RECTANGLE1_X, RECTANGLE1_Y, RECTANGLE1_WIDTH, RECTANGLE1_HEIGHT);
        rectangleBelowX = new Rectangle(RECTANGLE2_X, RECTANGLE2_Y, RECTANGLE2_WIDTH, RECTANGLE2_HEIGHT);
    }

    public boolean isInArea(UserPoint point){
        return rectangleBelowX.contains(point) ||  rectangleAboveX.contains(point);
    }

}
