import array.ArrayManager;
import sort.ShellSorter;
/**
 * Created by anastasiya on 19.9.16.
 */
public class Main {

    public static void main(String[] args){
        ArrayManager arrayManager = new ArrayManager();
        Integer[] array = arrayManager.getArray();
        ShellSorter shell = new ShellSorter();
        shell.sort(array);
        arrayManager.printArray(array);
    }
}
