package algoritmos;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int [] numbers = {  9, 6, 10, 44, 7, 1, 5, 2 };
        // int [] numbers = { 9, 6, 10, 44, 7, 1, 5, 2 }; // Essa deu treta, investigar
        quickSort(numbers, 0, numbers.length -1);
        System.out.println(Arrays.toString(numbers));
    }

    private static void quickSort(int[] n, int begin_pos, int end_pos){
        int bkp;
        var l = begin_pos;
        var r = end_pos;
        var pivot = n[begin_pos];

        while (l <= r) {

            while (n[l] < pivot) l ++;
            while (n[r] > pivot) r --;

            if (l <= r) {
                bkp = n[l];
                n[l] = n[r];
                n[r] = bkp;
                l++;
                r--;
            }
        }

        if (begin_pos < r)
            quickSort(n, begin_pos, r);

        if (l < end_pos)
            quickSort(n, l, end_pos);
    }
}
