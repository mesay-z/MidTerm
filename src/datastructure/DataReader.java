package datastructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class DataReader {
    /*
     * User API to read /src/data/self-driving-car.txt and print to console.
     * Use BufferedReader class.
     * Use try....catch block to handle Exception.
     *
     * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     *
     * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
     * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
     * order from LinkedList and retrieve as FILO order from Stack.
     *
     * Demonstrate how to use Stack that includes push,peek,search,pop elements.
     * Use For Each loop/while loop/Iterator to retrieve data.
     */
    public static void main(String[] args) {
        //String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

        File fl = new File("/src/data/self-driving-car.txt");
        System.out.println(fl);
            try {
            Scanner scan=new Scanner(fl);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
