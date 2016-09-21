/**
 * Created by anastasiya on 19.9.16.
 */

import io.*;
import function.*;
import java.util.ArrayList;


public class Main {

    private static String COMMENT = "Enter ";

    public static void main(String[] args){
        IOWorker mediator = new IOWorker();
        Function function = new Function();

        initializeFunctionParams(function, mediator);
        Table table = new Table();
        function.startCalculation(table);
        ArrayList<Double> funcValues = table.getFuncValues();
    }

    private static void initializeFunctionParams(Function function, IOWorker mediator){

        for (Parameter parameter: function.getParameters()){
            double rememberedValue = parameter.getValue();
            do{
                try{
                    mediator.generateMessage(COMMENT + parameter.getName());
                    parameter.setValue(mediator.getData());
                }
                catch(Exception e){
                    mediator.generateMessage(e.getLocalizedMessage());
                }
            } while (rememberedValue == parameter.getValue());
        }

        function.extractParams();
    }
}
