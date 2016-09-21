package obj;

import obj.Node;
import java.util.ArrayList;
/**
 * Created by anastasiya on 19.9.16.
 */
public class NodesArray {

    private ArrayList<Node> nodes;

    private int maxStateInArray;

    public int getMaxStateInArray(){
        return maxStateInArray;
    }

    public int length(){
        return nodes.size();
    }

    public NodesArray(Integer[] array){
        nodes = new ArrayList<Node>();
        maxStateInArray = 1;
        for(Integer element: array){
            nodes.add(new Node(element));
        }
    }

    private void analyzeElementsBefore(Node currentNode, int currentNumber){
        int maxState=1;
        for(int count = 0; count < currentNumber; count++){
            Node analyzedNode = nodes.get(count);
            if (analyzedNode.getKey() <= currentNode.getKey()){
                if (analyzedNode.getState() >= maxState){
                    currentNode.setState(++maxState);
                }
            }
        }
        if (maxState > maxStateInArray){
            maxStateInArray = maxState;
        }
    }

    public void setStates(){
        for(int count = 0; count < nodes.size(); count++){
            analyzeElementsBefore(nodes.get(count), count);
        }
    }

}
