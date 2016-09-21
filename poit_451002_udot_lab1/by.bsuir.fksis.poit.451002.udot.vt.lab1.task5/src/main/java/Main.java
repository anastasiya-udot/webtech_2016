import array.RandomArrayGenerator;
import obj.NodesArray;
/**
 * Created by anastasiya on 19.9.16.
 */
public class Main {

    public static void main(String[] args){
        RandomArrayGenerator generator = new RandomArrayGenerator();
        Integer[] array = generator.fillArray();
        NodesArray nodes = new NodesArray(array);
        nodes.setStates();
        System.out.println( nodes.length() - nodes.getMaxStateInArray());
    }


}
