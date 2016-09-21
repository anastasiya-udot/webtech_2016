package obj;

import io.IOWorker;
import validator.ValidatorUtil;

/**
 * Created by anastasiya on 18.9.16.
 */
public class UserPoint {

    private static String INPUT_MESSAGE = "Input coordinate ";
    private static String[] parameters = {"x", "y"};

    private double valueX;
    private double valueY;

    public void setX(double value){
        this.valueX = value;
    }

    public double getX(){
        return this.valueX;
    }

    public void setY(double value){
        this.valueY = value;
    }

    public double getY() { return this.valueY; }


    private void setCoordinates(double[] coordinates){
        this.setX(coordinates[0]);
        this.setY(coordinates[1]);
    }

    private String getCoordinate(IOWorker mediator, int counter){
        mediator.generateMessage(INPUT_MESSAGE + parameters[counter]);
        return mediator.getData();
    }


    public void scanCoordinates(IOWorker mediator){

        ValidatorUtil validator = new ValidatorUtil();
        double[] coordinates = new double[parameters.length];
        for (int counter = 0; counter < parameters.length; counter++){
            String coordinate = getCoordinate(mediator, counter);
            if(validator.isDigit(coordinate)){
                coordinates[counter] = Double.parseDouble( coordinate );
            } else {
                throw new IllegalArgumentException( "Value " + parameters[counter] + " is invalid" );
            }
        }
        setCoordinates(coordinates);
    }
}
