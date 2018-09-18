package lab4;

import java.util.TreeSet;
//import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Alex Santos-Urbina
 */
public class comparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        int intCount = 0;
        TreeSet<Integer> tree1; //natural order sorting tree
        
        MyComparator reverseOrder = new MyComparator();
        TreeSet<Integer> tree2 = new TreeSet<>(reverseOrder); //reverse sequence sorting tree, takes in MyComparator object
                                                                     
        Scanner inFile = new Scanner(new File("Lab4InputFile.txt"));
        
        List<Integer> intList = new ArrayList<>();
        
        while(inFile.hasNextLine()) {
            intList.add(Integer.parseInt(inFile.nextLine()));
            intCount++;
        }
        
        System.out.println("Number of integers read from the file: " + intCount);
        System.out.println("\nOriginal, from file: " + intList);
        
        tree1 = new TreeSet<>(intList);
        System.out.println("\nNatural Order: " + tree1);
        
        tree2.addAll(intList);
        System.out.println("\nReverse Order: " + tree2);
    }
}
