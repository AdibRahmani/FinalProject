package org.bihe.designPattern.IO;

import org.bihe.designPattern.Event;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadWrite {


    //Methods
    public void writeToFile(String str, String fileAddress) {
        try {
            FileWriter myWriter = new FileWriter(fileAddress);
            myWriter.write(str);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //-----------------------------------------------------
    public static ArrayList<String> readFromFile(String fileAddress) {
        ArrayList<String> rules = new ArrayList<>();
        try {
            File myObj = new File(fileAddress);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                rules.add(myReader.nextLine());

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return rules;
    }

    //----------------------------------------------------
    public static void createObjects(ArrayList<String> rules) {
        String[] eventFields;
        String[] conditionFields;
        String[] actionsFields;
        for (String rule : rules) {
            String[] splited = rule.split("/");
            eventFields = splited[0].split(",");
            conditionFields = splited[1].split(",");
            actionsFields = splited[2].split(",");
            Event event = new Event(eventFields[0], eventFields[1]);

        }

    }

    //-----------------------------------------------------
    public static void main(String[] args) {
        ArrayList<String> rules = readFromFile("rules.txt");
        System.out.println(rules.get(0));
        System.out.println(rules.get(1));
        createObjects(rules);
    }
}
