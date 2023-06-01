import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int [] numbers = { 8, 9, 78, 1, 3, 5, 0, 6 };
        // int [] numbers = { 9, 6, 10, 44, 7, 1, 5, 2 }; // Essa deu treta, investigar
        quickSort(numbers, 0, numbers.length -1);
        System.out.println(Arrays.toString(numbers));
    }

    private static void quickSort(int[] n, int left, int right){
        int bkp;
        var i = left;
        var j = right;
        var pivot = n[left];

        while (i <= j) {

            while (n[i] < pivot) i ++;
            while (n[j] < pivot) j --; // Descrescente, pra tornar crescente, alterar o sinal de menor que pra maior que

            if (i <= j) {
                bkp = n[i];
                n[i] = n[j]; n[j] = bkp;
                i++; j--;
            }
        }

        if (left < j)
            quickSort(n, left, j);

        if (i < right)
            quickSort(n, i, right);
    }
}
