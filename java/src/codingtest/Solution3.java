

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Cut the bamboo question
 * Given the input 8, 5, 4, 1, 3, 4 :-
 * Each interaction should be as follows:
 * 8, 5, 4, 1, 3, 4 -----> 6
 * 7, 4, 3, _, 2, 3 -----> 5
 * 5, 2, 1, _, _, 2 -----> 4
 * 4, 1, _, _, _, 1 -----> 3
 * 3, _, _, _, _, _ -----> 1
 * _, _, _, _, _, _ -----> 0
 * so output should be the remainder of elements [6, 5, 4, 3, 1, 0]
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lengths = new ArrayList<Integer>();
        while(sc.hasNextInt()){
            lengths.add(sc.nextInt());
        }

        List<Integer> pieces = new ArrayList<Integer>();
        int initialSize = lengths.size();
        System.out.println(lengths);
        System.out.println("initial size of array :"+initialSize);
        pieces.add(initialSize);
        
        List<Integer> arr = lengths;

        while(arr.size() > 0) {
            List<Integer> sortedArr = arr;
            Collections.sort(sortedArr);
            int key = sortedArr.get(0);
            System.err.println("key now :"+key);

            if(key != Integer.parseInt("0")) {
                for (int i=0; i<arr.size(); i++) {
                    arr.set(i, (arr.get(i) - key));
                }
            }

            while(arr.contains(Integer.parseInt("0"))) {
                arr.remove (Integer.parseInt("0"));
            }
            System.out.println(arr);

            if(key != Integer.parseInt("0") && arr.size()>0)
                pieces.add(arr.size());
        }

        System.out.println(pieces.size());
        System.out.println(pieces);

        sc.close();
    }
}