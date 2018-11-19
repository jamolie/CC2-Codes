package bubblesort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        int[] input ={1,2,3,4,5,6,7,8,9,10,
                    11,12,13,14,15,16,17,18,19,20,
                    21,22,23,24,25,26,27,28,29,30,
                    31,32,33,34,35,36,37,38,39,40,
                    41,42,43,44,45,46,47,48,49,50,
                    51,52,53,54,55,56,57,58,59,60,
                    61,62,63,64,65,66,67,68,69,70,
                    71,72,73,74,75,76,77,78,79,80,
                    81,82,83,84,85,86,87,88,89,90,
                    91,92,93,94,95,96,97,98,99,100};
        
        int inputLength = input.length;
        int temp;
        
        System.out.println("Bubble Sort");
        for (int i = 0; i < inputLength; i++) {
            for (int j = 1; j < (inputLength - i); j++) {
                if (input[j - 1] > input[j]) {
                    temp = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = temp;
                }
            }
        }
        String asc = Arrays.toString(input);
        System.out.println("Ascending: "+asc);
        
        for (int i = 0; i < inputLength; i++) {
            for (int j = 1; j < (inputLength - i); j++) {
                if (input[j - 1] < input[j]) {
                    temp = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = temp;
                }
            }
        }
        String des = Arrays.toString(input);
        System.out.println("Descending: "+des);
        
        System.out.print("Random: ");
        shuffleArray(input);
        
    }

    
    private static void shuffleArray(int[] input) {
        int index;
        Random random = new Random();
        for (int i = input.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            if (index != i) {
                input[index] ^= input[i];
                input[i] ^= input[index];
                input[index] ^= input[i];
            }
        }
        System.out.println(Arrays.toString(input));

}
}
