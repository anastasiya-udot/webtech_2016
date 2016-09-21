package function;

/**
 * Created by anastasiya on 19.9.16.
 */
public class Parameter {

    private String name;
    private double value;

    private void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setValue(double value){
        this.value = value;
    }

    public double getValue(){
        return value;
    }

    public Parameter(String name){
        this.setName(name);
    }
}
