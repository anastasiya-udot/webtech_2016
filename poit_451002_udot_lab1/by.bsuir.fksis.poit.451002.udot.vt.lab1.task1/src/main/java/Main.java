/**
 * Created by anastasiya on 17.9.16.
 */
import  io.IOWorker;
import  util.ExpressionUtil;
import validator.ValidatorUtil;

import java.beans.Expression;

public class Main {

    private static String END_MESSAGE = "Output value: ";

    private static IOWorker mediator;

    public static void main( String[] args ){

        mediator = new IOWorker();
        try {
            ExpressionUtil expression = new ExpressionUtil();
            initializeExpressionParameters(mediator.scanValues(), expression);
            mediator.generateMessage( END_MESSAGE + expression.execute() );
        }
        catch(Exception e){
            mediator.generateMessage( e.getLocalizedMessage() );
        }

    }

    private static void initializeExpressionParameters(double[] values, ExpressionUtil expression){
        expression.setValueX(values[0]);
        expression.setValueY(values[1]);
    }




}
