package util;

/**
 * Created by anastasiya on 17.9.16.
 */
public class ExpressionUtil {

    private static int POWER = 2;
    private double valueX;
    private double valueY;
    public static String[] parameters = {"x", "y"};

    public void setValueX(double x){
        this.valueX = x;
    }

    public void setValueY(double y){
        this.valueY = y;
    }

    private double pow(double value){
        return Math.pow( value, POWER );
    }

    public double execute(){
        try{
            double numerator = 1 + pow( Math.sin( valueX + valueY ) );
            double denumerator = 2 + Math.abs( valueX - 2 * valueX / ( 1 + pow(valueX) * pow(valueX) ) );
            return numerator / denumerator + valueX;
        }
        catch(Exception e){
            throw new ArithmeticException( "Arithmetic exception" );
        }
    }

}
