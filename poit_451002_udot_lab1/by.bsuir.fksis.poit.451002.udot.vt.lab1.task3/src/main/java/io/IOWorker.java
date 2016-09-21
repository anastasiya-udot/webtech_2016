package io;

import java.util.Scanner;

/**
 * Created by anastasiya on 19.9.16.
 */

public class IOWorker {

    public double getData(){
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        try{
            return Double.parseDouble(inputValue);
        }
        catch(NumberFormatException e){
            throw e;
        }
    }

    public void generateMessage(String message){
        System.out.println(message);
    }
}