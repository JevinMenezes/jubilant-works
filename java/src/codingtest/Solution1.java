package codingtest;

import java.util.Scanner;

/**
 * Given a string: "I soved this problem." ,
 * the output should be: "problem.this.soved.I"
 */
public class Solution1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace("."," ");
        String[] tokens = input.trim().strip().split("\\s+");
        String output = "";
        for(int i=0; i < tokens.length; i++ ) {

            if(i >= 1)
                output = output + ".";

            output = output + tokens[tokens.length - 1 - i];
        }
        sc.close();

        System.out.println(output);
    }
}
