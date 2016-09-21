import generator.SequenceGenerator;
import util.AnalyzerUtil;

import java.util.ArrayList;

/**
 * Created by anastasiya on 19.9.16.
 */
public class Main {

    static int STEP_A = 15;
    static int STEP_B = 5;

    public static void main(String[] args) {
        SequenceGenerator generator = new SequenceGenerator();
        Integer[] sequenceA = generator.getSequence(STEP_A);
        Integer[] sequenceB = generator.getSequence(STEP_B);
        AnalyzerUtil analyzer = new AnalyzerUtil();
        print(sequenceA);
        print(sequenceB);
        print(analyzer.getSequenceIndices(sequenceA, sequenceB));

    }

    private static void print(Integer[] seq){
        for(Integer element: seq){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void print(ArrayList<Integer> indices){
        for(Integer element: indices){
            System.out.print(element + " ");
        }
    }

}

