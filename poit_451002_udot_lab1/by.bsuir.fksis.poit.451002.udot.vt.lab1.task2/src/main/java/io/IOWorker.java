package io;

import java.util.Scanner;

/**
 * Created by anastasiya on 17.9.16.
 */
public class IOWorker {

    public String getData(){
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        return inputValue;
    }

    public void generateMessage(String message){
        System.out.println(message);
    }
}
