

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


/**
 * Given an input string: "hello", and a character, the output should be 
 * frequency of the character, in case of "hello" if character is 'l' then
 * expected output is 2.
 */
public class Solution5 {
    
    public static int charSearch(String str,char ch){
        Map<Character, Integer> charFrequencyMap = new HashMap<Character, Integer>(0);
        char[] strCharArray = new char[str.length()];
        strCharArray = str.toCharArray();
        for (char c : strCharArray) {
            if(charFrequencyMap.containsKey(c) && charFrequencyMap.get(c)!=null)
                charFrequencyMap.put(c, (charFrequencyMap.get(c)+1));
            else
                charFrequencyMap.put(c, 1);
        }
        return charFrequencyMap.get(ch);
    }

    public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();
		char ch = (char)reader.read();
		
		System.out.println(charSearch(str,ch));
	}

}