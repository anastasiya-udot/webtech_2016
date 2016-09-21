package obj;

/**
 * Created by anastasiya on 18.9.16.
 */
public class Rectangle {

    private double upperLeftX;
    private double upperLeftY;
    private double width;
    private double height;

    public Rectangle(double x, double y, double w, double h){
        this.upperLeftX = x;
        this.upperLeftY = y;
        this.width = w;
        this.height = h;
    }

    private boolean checkCoordinateX(double pointX){
        return ( this.upperLeftX <= pointX ) && ( ( this.upperLeftX + this.width ) >= pointX );
    }

    private boolean checkCoordinateY(double pointY){
        return ( this.upperLeftY >= pointY ) && ( ( this.upperLeftY + this.height ) <= pointY );
    }

    public boolean contains(UserPoint point){
        return checkCoordinateX( point.getX() ) && checkCoordinateY( point.getY() );
    }

}
