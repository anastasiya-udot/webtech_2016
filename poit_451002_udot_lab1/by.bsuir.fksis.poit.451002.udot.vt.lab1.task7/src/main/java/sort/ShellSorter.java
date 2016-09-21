package sort;

/**
 * Created by anastasiya on 19.9.16.
 */
public class ShellSorter {

    public void sort(Integer[] array){
        int half = array.length / 2;
        while( half > 0){
            for(int counter1 = 0; counter1 < (array.length - half); counter1++){
                int counter2 = counter1;
                while ((counter2 >= 0) && (array[counter2] > array[counter2 + half])){
                    int temp = array[counter2];
                    array[counter2] = array[counter2 + half];
                    array[counter2 + half] = temp;
                    counter2--;
                }
            }
            half = half / 2;
        }
    }

}
