package lab4;

import java.util.Comparator;

/**
 *
 * @author Alex Santos-Urbina
 */

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer num1, Integer num2) {
        return num2.compareTo(num1); 
    }
    
}
