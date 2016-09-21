/**
 * Created by anastasiya on 18.9.16.
 */

import io.IOWorker;
import obj.*;
import validator.ValidatorUtil;

public class Main {

    private static String START_MESSAGE = "Enter coordinates: ";
    private static String IN_AREA_MESSAGE = "Point belogs to area";
    private static String OUT_AREA_MESSAGE = "Point doesn't belog to area";

    public static void main( String[] args ){
        IOWorker mediator = new IOWorker();
        mediator.generateMessage(START_MESSAGE);
        try {
            UserPoint point = new UserPoint();
            point.scanCoordinates(mediator);
            Area area = new Area();
            if (area.isInArea(point)){
                mediator.generateMessage( IN_AREA_MESSAGE );
            } else{
                mediator.generateMessage( OUT_AREA_MESSAGE );
            }

        }
        catch (Exception e){
            mediator.generateMessage( e.getLocalizedMessage() );
        }
    }


}
