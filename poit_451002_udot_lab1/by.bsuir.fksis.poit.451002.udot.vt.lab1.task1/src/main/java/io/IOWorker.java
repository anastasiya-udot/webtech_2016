package io;

import util.ExpressionUtil;
import validator.ValidatorUtil;

import java.util.Scanner;

/**
 * Created by anastasiya on 17.9.16.
 */
public class IOWorker {

    private static String INPUT_MESSAGE = "Input parameter ";

    private String getData(){
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        return inputValue;
    }

    public double[] scanValues(){

        double[] arrayValues = new double[ExpressionUtil.parameters.length];

        for (int counter = 0; counter < ExpressionUtil.parameters.length; counter++) {

            generateMessage( INPUT_MESSAGE + ExpressionUtil.parameters[counter] );
            String intermidiate = getData();

            if(ValidatorUtil.isDigit(intermidiate)){
                arrayValues[counter] = Double.parseDouble(intermidiate);
            } else {
                throw new IllegalArgumentException( "Value " + ExpressionUtil.parameters[counter] + " is invalid" );
            }

        }
        return arrayValues;
    }

    public void generateMessage(String message){
        System.out.println(message);
    }
}
