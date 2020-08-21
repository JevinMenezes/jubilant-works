import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class Result {

    /*
     * Complete the 'rearrangeWord' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING word as parameter.
     */

    static List<String> wordsList;
    static Set<String> wordsSet = new LinkedHashSet<String>(0);

    public static String rearrangeWord(String word) {
        if(word==null || word.length()==0 || word.length()==1){
            return "no answer";
        }

        int strLen = word.length();
        permute(word, 0, strLen-1);
        wordsList = new ArrayList<String>(wordsSet);
        Collections.sort(wordsList);

        if(wordsList.size()==1) {
            return "no answer";
        }
        //return wordsList.toString();
        int wordIndex = wordsList.indexOf(word);
        if(wordIndex < wordsList.size()-1) {
            return wordsList.get(wordIndex+1);
        }

        return "no answer";
    }

    public static void permute(String s, int start, int end) {
        if(start==end) {
            wordsSet.add(s);
        }
        else {
            for(int i=start; i<=end; i++) {
                s = swap(s,start,i);
                permute(s, start+1, end);
                s = swap(s,start,i);
            }
        }
    }

    public static String swap(String s1, int start1, int end1) {
        //char temp;
        /*char[] charArray = s1.toCharArray();
        char temp = charArray[start1];
        charArray[start1] = charArray[end1];
        charArray[end1] = temp;
        return String.valueOf(charArray);*/

        StringBuilder sb = new StringBuilder(s1);
        sb.setCharAt(start1, s1.charAt(end1));
        sb.setCharAt(end1, s1.charAt(start1));
        return sb.toString();

    }

}

public class Solution7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String word = bufferedReader.readLine();

        String result = Result.rearrangeWord(word);
        System.out.println(result);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
