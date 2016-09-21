package obj;

/**
 * Created by anastasiya on 19.9.16.
 */
public class Node {

    private int key, state;

    private void setKey(int key){
        this.key = key;
    }

    public void setState(int state){
        this.state = state;
    }

    public int getKey(){
        return this.key;
    }

    public int getState(){
        return this.state;
    }

    public Node(int key){
        this.setKey(key);
        this.setState(1);
    }
}
