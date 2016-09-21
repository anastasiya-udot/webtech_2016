package io;

import java.util.ArrayList;

/**
 * Created by anastasiya on 19.9.16.
 */
public class Table {

    private IOWorker mediator;
    private static ArrayList<Double> funcValues;

    public ArrayList<Double> getFuncValues(){
        return funcValues;
    }

    public Table(){
        mediator = new IOWorker();
        mediator.generateMessage("Table");
        funcValues = new ArrayList<Double>();
    }

    private double round(double value){
       return Math.rint(10000.0 * value) / 10000.0;
    }

    public void drawRow(double argValue, double funcValue){
        mediator.generateMessage(round(argValue) + " ====> " + round(funcValue));
        funcValues.add(round(funcValue));
    }

}
