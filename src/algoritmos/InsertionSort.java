package algoritmos;

import java.util.Arrays;

public class InsertionSort {

    public static void main (String[] args) {
        int [] numbers = {5,2,4,6,1,3};
        for (var j = 1; j < numbers.length; j++) {
            int nKey = numbers[j];
            int i = j -1;
            System.out.println("F:" + j);
            while (i >= 0 && numbers[i] > nKey) {
                System.out.println("W:" + i);
                numbers[i+1] = numbers[i];
                i = i-1;
            }
            numbers[i+1] = nKey;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
