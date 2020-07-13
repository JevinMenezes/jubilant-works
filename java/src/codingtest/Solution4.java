package codingtest;

/**
 * Merge two soted arrays question withiut using collections of Java
 * Given two sorted arrays as inputs
 * so the output should be a merged sorted array
 */
public class Solution4 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int len1 = array1.length;
        int[] array2 = {2, 4, 6, 8};
        int len2 = array2.length;

        int[] resultArray = new int[len1+len2];
        mergeSortedArrays(array1, array2, len1, len2, resultArray);
        for(int i = 0; i < len1+len2; i++){
            System.out.println(resultArray[i]);
        }
    }

    private static void mergeSortedArrays(int[] array1, int[] array2, int len1, int len2, int[] resultArray) {
        int i=0,j=0,k=0;

        while(i < len1 && j < len2) {
            if(array1[i] < array2[j]) {
                resultArray[k] = array1[i];
                k++;
                i++;
            }
            else {
                resultArray[k] = array2[j];
                k++;
                j++;
            }
        }

        while(i < len1) {
            resultArray[k] = array1[i];
            k++;
            i++;
        }

        while(j < len2) {
            resultArray[k] = array2[j];
            k++;
            j++;
        }
    }
}