package function;

import java.util.ArrayList;
import io.Table;
/**
 * Created by anastasiya on 19.9.16.
 */
public class Function {

    private ArrayList<Parameter> parameters;
    private double a, b, h, y, x;
    private String[] RANGE = {"a", "b"};
    private String STEP = "h";

    public void setA(double a){
        this.a = a;
    }

    public void setB(double b){
        this.b = b;
    }

    public void setH(double h){
        this.h = h;
    }

    public ArrayList<Parameter> getParameters(){
        return parameters;
    }

    public Function(){
        parameters = new ArrayList<Parameter>();
        for (String border: RANGE){
            parameters.add(new Parameter(border));
        }
        parameters.add(new Parameter(STEP));
    }

    private double execute(double argument){
        return Math.tan(Math.toRadians(argument));
    }

    public void extractParams(){
        if (parameters.get(0).getValue() > parameters.get(1).getValue()){
            a = parameters.get(1).getValue();
            b =parameters.get(0).getValue();
        } else {
            a = parameters.get(0).getValue();
            b =parameters.get(1).getValue();
        }
        h =  parameters.get(2).getValue();
    }

    private void checkBorders(){
        if (this.a > this.b) {
            double temp = this.b;
            this.setB(this.a);
            this.setA(temp);
        }
    }

    public void startCalculation(Table table){
        checkBorders();
        x = a;
        while (x <= b){
            y = execute(x);
            table.drawRow(x, y);
            x += h;
        }
    }
}
