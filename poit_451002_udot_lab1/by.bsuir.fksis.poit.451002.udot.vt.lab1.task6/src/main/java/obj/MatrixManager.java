package obj;

/**
 * Created by anastasiya on 19.9.16.
 */
public class MatrixManager {

    private Integer[] template;
    private Integer[][] matrix;

    public Integer[][] getMatrix(){
        return matrix;
    }

    public MatrixManager(Integer[] originalArray){
        this.template = originalArray;
        matrix = new Integer[template.length][template.length];
        createMatrix();
    }

    private void createMatrix(){
        for(int count = 0; count < template.length; count++){
            Integer[] temp = new Integer[template.length];
            System.arraycopy(template, 0, temp, template.length - count, count);
            System.arraycopy(template, count, temp, 0, template.length - count);
            matrix[count] = temp;
        }
    }

    public void printMatrix(){
        for(int count1 = 0; count1 < template.length; count1++){
            for(int count2 = 0; count2 < template.length; count2++){
                System.out.print(matrix[count1][count2] + " ");
            }
            System.out.println();
        }
    }
}
