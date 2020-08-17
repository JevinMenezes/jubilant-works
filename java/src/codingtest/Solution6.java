

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an input integer: "1212121", the output should be 
 * frequency of the digits in the integer; i.e. as follows
 * 1: 4
 * 2: 3
 * 
 */
public class Solution6 {

    public static void main(String args[] ) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        /*Console console = System.console();
        String input = console.readLine();*/
        Map<Integer, Integer> digitCountMap = new HashMap<Integer, Integer>(0);
        for (int i=0; i < input.length(); i++) {
            Integer intFromChar = Integer.parseInt(String.valueOf(input.charAt(i)));
            if(digitCountMap.containsKey(intFromChar) && digitCountMap.get(intFromChar)!=null) {
                digitCountMap.put(intFromChar, 1);
            }
            else {
                digitCountMap.put(intFromChar, digitCountMap.get(intFromChar)+1);
            }
        }
        for(int i=0; i<10; i++) {
            if(digitCountMap.get(i)==null)
                digitCountMap.remove(i);
        }
        digitCountMap.forEach((k,v)->System.out.println(k+": "+v));
    }
}