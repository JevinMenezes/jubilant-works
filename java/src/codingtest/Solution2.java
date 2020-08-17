

import java.io.Console;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Given a word: "hello", the output should in the ascending order of the
 * frequency of characters in case of "hello" expected output is "heol"
 */
public class Solution2 {
    public static void main(String[] args) {
        Console console = System.console();
        String input = console.readLine();
        char[] inputCharArray = input.toCharArray();
        // int inputLength = inputCharArray.length;

        Map<Character, Integer> charFreqMap = new LinkedHashMap<Character, Integer>();

        for (char key : inputCharArray) {
            if (charFreqMap.containsKey(key)) {
                charFreqMap.put(key, charFreqMap.get(key) + 1);
            } else {
                charFreqMap.put(key, 1);
            }
        }
        System.out.println(charFreqMap);

        char[] charArr = new char[charFreqMap.size()];
        int[] counts = new int[charFreqMap.size()];

        int i = 0;
        for (Entry<Character, Integer> entry : charFreqMap.entrySet()) {
            charArr[i] = (char) entry.getKey();
            counts[i] = (int) entry.getValue();
            i++;
        }

        System.out.println(charArr);
        System.out.println(counts.length);
        
        for(int a=0; a < counts.length; a++) {
            for(int b=0; b < counts.length-a-1; b++) {
                if(counts[b] > counts[b+1]) {
                    char temp = charArr[b];
                    charArr[b] = charArr[b+1];
                    charArr[b+1] = temp;
                    counts[b] = counts[b] + counts[b+1];
                    counts[b+1] = counts[b] - counts[b+1];
                    counts[b] = counts[b] - counts[b+1];
                }
            }
        }
        System.out.println(charArr);
    }

}